package net.sourceforge.opencamera;

import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import androidx.annotation.RequiresApi;
import android.util.Log;

import net.sourceforge.opencamera.utils.CameraXDebug;

/** Provides service for quick settings tile.
 */
@RequiresApi(api = Build.VERSION_CODES.N)
public class CameraXTileServiceVideo extends TileService {
    private static final String TAG = "CameraXTileServiceVideo";
    public static final String TILE_ID = "net.sourceforge.opencamera.TILE_VIDEO";

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }

    @Override
    public void onClick() {
        if( CameraXDebug.LOG )
            Log.d(TAG, "onClick");
        super.onClick();
        Intent intent = new Intent(this, CameraXActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setAction(TILE_ID);
        startActivity(intent);
    }
}
