package com.example.myfirstapp;

import android.app.Application;

import com.droi.sdk.core.Core;

/**
 * Created by tony on 10/7/16.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Core.initialize(this);
    }
}
