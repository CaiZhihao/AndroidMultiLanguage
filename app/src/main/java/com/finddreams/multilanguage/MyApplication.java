package com.finddreams.multilanguage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;

import com.finddreams.languagelib.LanguageUtil;

/**
 * Created by lx on 17-10-26.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        LanguageUtil.init(this);
        LanguageUtil.getInstance().setConfiguration();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {
                LanguageUtil.getInstance().setConfiguration();
            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LanguageUtil.getInstance().setConfiguration();
    }
}
