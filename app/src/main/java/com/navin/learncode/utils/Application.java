package com.navin.learncode.utils;

import com.onesignal.OneSignal;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            OneSignal.startInit(this)
                    .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                    .unsubscribeWhenNotificationsAreDisabled(true)
                    .init();

        }catch (Exception  e){
            e.printStackTrace();

        }
    }
}
