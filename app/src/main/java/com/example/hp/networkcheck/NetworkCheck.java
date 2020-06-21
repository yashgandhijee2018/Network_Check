package com.example.hp.networkcheck;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkCheck {
    boolean haveConnectedWifi = false;
    boolean haveConnectedMobile = false;
    private static NetworkCheck instance = new NetworkCheck();
    static Context context;

    public static NetworkCheck getInstance(Context ctx) {
        context = ctx.getApplicationContext();
        return instance;
    }

    public boolean NetworkCheckByType(){


        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        assert cm != null;
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }
}
