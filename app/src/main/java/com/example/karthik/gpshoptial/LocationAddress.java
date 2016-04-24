package com.example.karthik.gpshoptial;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;


public class LocationAddress {
    private static final String TAG="LocationAddress";
    public static void getAddressFromLocation(final double latitude, final double longtitude, final Context context,final Handler handler){
        Thread thread=new Thread(){
            @Override
            public void run(){
                Geocoder geocoder=new Geocoder(context, Locale.getDefault());
                String result=null;
                try{
                    List<Address> addressList =geocoder.getFromLocation(latitude,longtitude,1);
                if(addressList!=null&& addressList.size()>0){
                    Address address=addressList.get(0);
                    StringBuilder sB=new StringBuilder();
                    for(int i=0;i<address.getMaxAddressLineIndex();i++){
                        sB.append(address.getAddressLine(i)).append("\n");
                    }
                    sB.append(address.getLocality()).append("\n");
                    sB.append(address.getPostalCode()).append("\n");
                    sB.append(address.getCountryName()).append("\n");
                    result = sB.toString();

                }

                }catch (IOException  e){
                    Log.e(TAG,"unable to get geocoder",e);
                }finally {
                    Message message=Message.obtain();
                    message.setTarget(handler);
                    if(result!=null){
message.what=1;
                        Bundle bundle=new Bundle();
                        result="Latitude"+latitude+"Longtitude"+longtitude+"\nAddress:\n"+result;
                        bundle.putString("address",result);
                        message.setData(bundle);
                    }else {
                        message.what=1;
                        Bundle bundle=new Bundle();
                        result="Latitude"+latitude+"Longtitude"+longtitude+"\nUnable to get address";
                        bundle.putString("address",result);
                        message.setData(bundle);
                    }
message.sendToTarget();
                }


            }
        };
        thread.start();
    }

}
