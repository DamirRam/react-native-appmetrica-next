package com.yandex.metrica.plugin.reactnative;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.yandex.metrica.push.firebase.MetricaMessagingService;

public class FirebaseMessagingMasterService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage message) {
        super.onMessageReceived(message);
        new MetricaMessagingService().processPush(this, message);
    }

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        new MetricaMessagingService().processToken(this, token);
    }
}