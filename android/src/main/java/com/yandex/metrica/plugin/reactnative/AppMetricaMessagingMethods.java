package com.yandex.metrica.plugin.reactnative;

import androidx.annotation.NonNull;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.yandex.metrica.push.firebase.MetricaMessagingService;

public class AppMetricaMessagingMethods {
    private static final String TAG = "AppMetricaModule";

    private FirebaseMessagingService mFirebaseMessagingService;

    public AppMetricaMessagingMethods(@NonNull FirebaseMessagingService service) {
        this.mFirebaseMessagingService = service;
    }

    public void onMessageReceived(RemoteMessage message) {
        if (MetricaMessagingService.isNotificationRelatedToSDK(message)) {
            
            new MetricaMessagingService().processPush(this.mFirebaseMessagingService, message);

            Log.i(TAG, "Push message received to appmetrica");
            return;
        }
    }

    public void onNewToken(@NonNull String token) {
        new MetricaMessagingService().processToken(this.mFirebaseMessagingService, token);

        Log.i(TAG, "New token");
    }
}