package com.anative.jaccen.glnative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback{

    // Used to load the 'native-lib' library on application startup.

    private SurfaceView mSurfaceView;
    private ARRender mARender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        mARender = new ARRender();
        mARender.init();
        // Example of a call to a native method
        mSurfaceView = (SurfaceView) findViewById(R.id.surface_view);
        mSurfaceView.getHolder().addCallback(this);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    protected void onDestroy() {
        mARender.release();
        mARender = null;
        super.onDestroy();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        mARender.surfaceCreated(holder.getSurface());
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mARender.surfaceChanged(width, height);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        mARender.surfaceDestroyed();
    }
}
