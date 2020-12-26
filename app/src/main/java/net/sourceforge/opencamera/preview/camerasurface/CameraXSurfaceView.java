package net.sourceforge.opencamera.preview.camerasurface;

import net.sourceforge.opencamera.utils.CameraXDebug;
import net.sourceforge.opencamera.cameracontroller.CameraController;
import net.sourceforge.opencamera.cameracontroller.CameraControllerException;
import net.sourceforge.opencamera.preview.Preview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.media.MediaRecorder;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

/** Provides support for the surface used for the preview, using a SurfaceView.
 */
public class CameraXSurfaceView extends SurfaceView implements CameraSurface {
    private static final String TAG = "CameraXSurfaceView";

    private final Preview preview;
    private final int [] measure_spec = new int[2];
    private final Handler handler = new Handler();
    private final Runnable tick;

    public
    CameraXSurfaceView(Context context, final Preview preview) {
        super(context);
        this.preview = preview;
        if( CameraXDebug.LOG ) {
            Log.d(TAG, "new CameraXSurfaceView");
        }

        // Install a SurfaceHolder.Callback so we get notified when the
        // underlying surface is created and destroyed.
        getHolder().addCallback(preview);
        // deprecated setting, but required on Android versions prior to 3.0
        //getHolder().setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS); // deprecated

        tick = new Runnable() {
            public void run() {
				/*if( CameraXDebug.LOG )
					Log.d(TAG, "invalidate()");*/
                preview.test_ticker_called = true;
                invalidate();
                handler.postDelayed(this, preview.getFrameRate());
            }
        };
    }

    @Override
    public View getView() {
        return this;
    }

    @Override
    public void setPreviewDisplay(CameraController camera_controller) {
        if( CameraXDebug.LOG )
            Log.d(TAG, "setPreviewDisplay");
        try {
            camera_controller.setPreviewDisplay(this.getHolder());
        }
        catch(CameraControllerException e) {
            if( CameraXDebug.LOG )
                Log.e(TAG, "Failed to set preview display: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void setVideoRecorder(MediaRecorder video_recorder) {
        video_recorder.setPreviewDisplay(this.getHolder().getSurface());
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return preview.touchEvent(event);
    }

    @Override
    public void onDraw(Canvas canvas) {
        preview.draw(canvas);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        if( CameraXDebug.LOG )
            Log.d(TAG, "onMeasure: " + widthSpec + " x " + heightSpec);
        preview.getMeasureSpec(measure_spec, widthSpec, heightSpec);
        super.onMeasure(measure_spec[0], measure_spec[1]);
    }

    @Override
    public void setTransform(Matrix matrix) {
        if( CameraXDebug.LOG )
            Log.d(TAG, "setting transforms not supported for CameraXSurfaceView");
        throw new RuntimeException();
    }

    @Override
    public void onPause() {
        if( CameraXDebug.LOG )
            Log.d(TAG, "onPause()");
        handler.removeCallbacks(tick);
    }

    @Override
    public void onResume() {
        if( CameraXDebug.LOG )
            Log.d(TAG, "onResume()");
        tick.run();
    }
}
