package com.example.fran.Proyecto_GPS;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.fran.Proyecto_GPS.servicio.Servicio;

public class ServicioGps extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        final Context c = context;
        Intent serviceIntent = new Intent(context,Servicio.class);
        context.startService(serviceIntent);
    }
}