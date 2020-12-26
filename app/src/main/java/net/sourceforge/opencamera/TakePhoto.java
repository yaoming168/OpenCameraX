package net.sourceforge.opencamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import net.sourceforge.opencamera.utils.CameraXDebug;

/** Entry Activity for the "take photo" widget (see CameraXWidgetProviderTakePhoto).
 *  This redirects to MainActivity, but uses an intent extra/bundle to pass the
 *  "take photo" request.
 */
public class TakePhoto extends Activity {
    private static final String TAG = "TakePhoto";

    // Usually passing data via intent is preferred to using statics - however here a static is better for security,
    // as we don't want other applications calling Open Camera's MainActivity with a take photo intent!
    //public static final String TAKE_PHOTO = "net.sourceforge.opencamera.TAKE_PHOTO";
    public static boolean TAKE_PHOTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if( CameraXDebug.LOG )
            Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, CameraXActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //intent.putExtra(TAKE_PHOTO, true);
        TakePhoto.TAKE_PHOTO = true;
        this.startActivity(intent);
        if( CameraXDebug.LOG )
            Log.d(TAG, "finish");
        this.finish();
    }

    protected void onResume() {
        if( CameraXDebug.LOG )
            Log.d(TAG, "onResume");
        super.onResume();
    }
}
