package com.yandex.metrica.plugin.reactnative;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;

import com.yandex.metrica.push.YandexMetricaPush;

public class SilentPushReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String payload = intent.getStringExtra(YandexMetricaPush.EXTRA_PAYLOAD);
    }
}
