
package com.example.testmapsv2leak;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.MapsInitializer;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    private static final String TAG = MyApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        try {
            MapsInitializer.initialize(this);
        } catch (GooglePlayServicesNotAvailableException impossible) {
            Log.i(TAG, "exception " + impossible);
        }
        super.onCreate();
    }
}
