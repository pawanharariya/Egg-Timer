package com.example.android.eggtimernotifications

import android.app.NotificationManager
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.android.eggtimernotifications.util.sendNotification
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("MessagingService", "Refreshed Token: $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.i("MessagingService", message.from.toString())
        message.data?.let {
            Log.d("MessagingService", message.data.toString())
        }
        message.notification?.let {
            sendMessage(it.body)
        }
    }

    private fun sendMessage(body: String?) {
        val notificationCompat = ContextCompat.getSystemService(
            applicationContext, NotificationManager::class.java
        ) as NotificationManager
        notificationCompat.sendNotification(body.toString(), applicationContext)
    }
}
