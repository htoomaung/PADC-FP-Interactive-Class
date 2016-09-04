package com.padc.interactive_class;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dell on 9/4/2016.
 */
public class InteractiveClassApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
