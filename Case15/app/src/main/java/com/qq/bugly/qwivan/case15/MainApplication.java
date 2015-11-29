package com.qq.bugly.qwivan.case15;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by ivan on 15-11-29.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "900013940", false);
    }
}
