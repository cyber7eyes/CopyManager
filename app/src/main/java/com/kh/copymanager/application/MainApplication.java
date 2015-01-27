package com.kh.copymanager.application;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Administrator on 2015-01-27.
 */
public class MainApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "P1U8yJrDbN9DjvDWlRfauDPmxoLwQU0v7mOz8HuJ", "uqUYWLPlhsgCUqrinL6yOCgwdmy9GDbNMZKayUga");
    }
}
