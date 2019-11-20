package com.example.notificationfcmphpmysql.service;

public abstract class MyFirebaseInstanceIDService {

    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();

    // TODO* LAST PROBLEM

    /**
     * method will be called whenever there is a change in firebase registration id.*/
    /*@Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        // Saving reg id to shared preferences
        storeRegIdInPref(refreshedToken);

        // sending reg id to your server
        sendRegistrationToServer(refreshedToken);

        // Notify UI that registration has completed, so the progress indicator can be hidden.
        Intent registrationComplete = new Intent(Config.REGISTRATION_COMPLETE);
        registrationComplete.putExtra("token", refreshedToken);
        // Broadcast manager broadcasts the reg id to all the activities those are listening.
        LocalBroadcastManager.getInstance(this).sendBroadcast(registrationComplete);
    }*/

    /*private void sendRegistrationToServer(final String token) {
        // sending gcm token to server
        Log.e(TAG, "sendRegistrationToServer: " + token);
    }*/

    /**
     * stores the registration id in shared preferences.*/
    /*private void storeRegIdInPref(String token) {
        SharedPreferences pref = getApplicationContext().getSharedPreferences(Config.SHARED_PREF, 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("regId", token);
        editor.commit();
    }*/

}