package com.yandex.metrica.plugin.reactnative;

import androidx.annotation.Nullable;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.yandex.appmetrica.push.hms.MetricaHmsMessagingService;

public class HmsMessagingMasterService extends HmsMessageService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        new MetricaHmsMessagingService().processPush(this, remoteMessage);
    }

    @Override
    public void onNewToken(@Nullable String token) {
        super.onNewToken(token);
        new MetricaHmsMessagingService().processToken(this, token);
    }
}