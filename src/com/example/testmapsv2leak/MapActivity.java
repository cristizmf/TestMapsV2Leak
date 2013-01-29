
package com.example.testmapsv2leak;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MapActivity extends Activity {

    private static final String TAG = MapActivity.class.getSimpleName();

    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
        setContentView(R.layout.map_activity_layout);

        mapView = (MapView)findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);

        mapView.getMap().animateCamera(CameraUpdateFactory.newLatLng(new LatLng(51.510078, -0.117717)));
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume");
        mapView.onResume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause");
        mapView.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy");
        mapView.onDestroy();
        mapView = null;
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "onSaveInstanceState");
        mapView.onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }
}
