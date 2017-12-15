package com.daslab.das.rider.Service;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


/**
 * Created by User on 12/15/2017.
 */

public class MyFirebaseMessaging extends FirebaseMessagingService {


    @Override
    public void onMessageReceived(final RemoteMessage remoteMessage) {
        //super.onMessageReceived(remoteMessage);

        // it send the firebase message with contain lat and lng from Rider app
        //so we need convert message to lnanlan

        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {

                Toast.makeText(MyFirebaseMessaging.this," "+remoteMessage.getNotification()
                        .getBody(),Toast.LENGTH_LONG).show();

            }
        });




    }
}
