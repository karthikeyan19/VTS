package com.example.karthik.gpshoptial;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps2Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
float ZoomLevel= (float) 8.1;
       Bundle extra=getIntent().getExtras();
       double la= extra.getDouble("lat");
        double lo= extra.getDouble("lon");


        LatLng s = new LatLng(la,lo);
       if(la==9.5833){
        mMap.addMarker(new MarkerOptions().position(s).title("Virudhunagar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(s,ZoomLevel));
    }
        if(la==9.4500){
            mMap.addMarker(new MarkerOptions().position(s).title("Sivakasi"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(s,ZoomLevel));
        }
        if(la==9.4758){
            mMap.addMarker(new MarkerOptions().position(s).title("Thiruthangal"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(s,ZoomLevel));
        }
        if(la>0){
            mMap.addMarker(new MarkerOptions().position(s).title("My Location"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(s,ZoomLevel));
        }

    }
}
