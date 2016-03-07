package com.ozyozyo.multiprocessapplicationsample.neko.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ToastNekoService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
