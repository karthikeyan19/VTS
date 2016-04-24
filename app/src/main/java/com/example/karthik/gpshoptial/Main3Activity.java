package com.example.karthik.gpshoptial;

import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
TabHost tabHost;

    LocationService locationService;
    public static  String SCH="";
    public static  String EMP="";
    public static  String COLL="";
    public static  String ATM="";
    public static  String HOS="";
    public static  String RES="";
    TextView tvview;
    double latitude ;  double longtitude ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Virudhunagar Welfare App");
        setSupportActionBar(toolbar);
        tvview=(TextView)findViewById(R.id.ttView);
        locationService=new LocationService(Main3Activity.this);
        Button col=(Button)findViewById(R.id.button3);
        Button hos=(Button)findViewById(R.id.button1);
       Button sch=(Button)findViewById(R.id.button2);
        Button res=(Button)findViewById(R.id.button7);
        Button emm=(Button)findViewById(R.id.button8);


        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       Button atm=(Button)findViewById(R.id.button4);
        atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,ListActivity.class);
                i1.putExtra(ATM,"atm");
                startActivity(i1);
            }
        });
        emm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,MainActivity.class);
                i1.putExtra(EMP,"emp");
                startActivity(i1);
            }
        });
        col.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,Main2Activity.class);
                i.putExtra(COLL,"col");
                startActivity(i);

            }
        });
hos.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(Main3Activity.this,Main2Activity.class);
        i.putExtra(HOS,"hos");

        startActivity(i);
    }
});
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,Main2Activity.class);
                i.putExtra(RES,"res");

                startActivity(i);
            }
        });
sch.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(Main3Activity.this,Main2Activity.class);
        i.putExtra(SCH,"sch");
        startActivity(i);

    }
});
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
int cu=tabHost.getCurrentTab();
                if(cu==0)
                {Location networkLocation=locationService.getLocation(LocationManager.NETWORK_PROVIDER);
                if(networkLocation!=null) {
                    latitude = networkLocation.getLatitude();
                    longtitude = networkLocation.getLongitude();

                    LocationAddress locationAddress = new LocationAddress();
                    locationAddress.getAddressFromLocation(latitude, longtitude, getApplicationContext(), new GeocoderHandler());

                }}
                if(cu==1){
                    Intent i=new Intent(Main3Activity.this,Maps2Activity.class);
                i.putExtra("lat",9.5833);
                    i.putExtra("lon",77.9500);
startActivity(i);
                }
                if(cu==2){
                    Intent i=new Intent(Main3Activity.this,Maps2Activity.class);
                    i.putExtra("lat",9.4500);
                    i.putExtra("lon",77.8000);
                    startActivity(i);
                }
                if(cu==3){
                    Intent i=new Intent(Main3Activity.this,Maps2Activity.class);
                    i.putExtra("lat",9.4758);
                    i.putExtra("lon",77.7925);
                    startActivity(i);
                }
        }});
        tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec=tabHost.newTabSpec("Home");
        spec.setContent(R.id.linearLayout);
        spec.setIndicator("Home");

        TabHost.TabSpec spec1=tabHost.newTabSpec("VirudhuNagar");
        spec1.setContent(R.id.linearLayout2);
        spec1.setIndicator("VirudhuNagar");

        TabHost.TabSpec spec2=tabHost.newTabSpec("Sivakasi");
        spec2.setContent(R.id.linearLayout3);
        spec2.setIndicator("Sivakasi");

        TabHost.TabSpec spec3=tabHost.newTabSpec("Thiruthangal");

        spec3.setContent(R.id.linearLayout4);
        spec3.setIndicator("Thiruthangal");
tabHost.addTab(spec);
        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
        tabHost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
int i=tabHost.getCurrentTab();
                if(i==2) {
                    HorizontalScrollView mm = (HorizontalScrollView) findViewById(R.id.m);
                    mm.smoothScrollBy(1,1);
                }}
        });

        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            TextView tv=(TextView)tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#FFFFFF"));
        }
       tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
                                           @Override
                                           public void onTabChanged(String tabId) {
                                               LinearLayout linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
                                              new AnimatedTabHostListener(linearLayout.getContext(),tabHost);
                                               HorizontalScrollView ss=(HorizontalScrollView)findViewById(R.id.m);
                                              focusOnView(ss,tabHost);
                                               int cur = tabHost.getCurrentTab();
                                               if (cur == 0) {
                                                   fab.setVisibility(View.VISIBLE);
                                                   fab.setImageResource(android.R.drawable.ic_menu_mylocation);
                                               } else {
                                                   fab.setImageResource(R.mipmap.ic_launcher1);

                                               }
                                           }
                                       }
       ); int cur=tabHost.getCurrentTab();

        Button colv=(Button)findViewById(R.id.bton3);

        Button atmv=(Button)findViewById(R.id.bton4);
Button schv=(Button)findViewById(R.id.bton2);
        Button hosv=(Button)findViewById(R.id.bton1);
        Button resv=(Button)findViewById(R.id.res);


        atmv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,AtmListActivity.class);
                i1.putExtra(ATM,"atmv");
                startActivity(i1);
            }
        });
        schv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,Main2Activity.class);
                i1.putExtra(SCH,"schv");
                startActivity(i1);
            }
        });
        resv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,Main2Activity.class);
                i1.putExtra(RES,"resv");
                startActivity(i1);
            }
        });

        hosv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,Main2Activity.class);
                i1.putExtra(HOS,"hosv");
                startActivity(i1);
            }
        });

        colv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,VlistActivity.class);
                i.putExtra(COLL,"colv");
                startActivity(i);

            }
        });
        Button cols=(Button)findViewById(R.id.utton3);

        Button atms=(Button)findViewById(R.id.utton4);

        atms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,AtmListActivity.class);
                i1.putExtra(ATM,"atms");
                startActivity(i1);
            }
        });
        cols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,VlistActivity.class);
                i.putExtra(COLL,"cols");
                startActivity(i);

            }
        });
        Button schs=(Button)findViewById(R.id.utton2);

        Button hoss=(Button)findViewById(R.id.utton1);
        Button ress=(Button)findViewById(R.id.utton7);

        schs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,Main2Activity.class);
                i1.putExtra(SCH,"schs");
                startActivity(i1);
            }
        });
        hoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,Main2Activity.class);
                i.putExtra(HOS,"hoss");
                startActivity(i);

            }
        });
        ress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,Main2Activity.class);
                i.putExtra(RES,"ress");
                startActivity(i);

            }
        });
        Button colt=(Button)findViewById(R.id.uton3);

        Button atmt=(Button)findViewById(R.id.uton4);

        atmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,AtmListActivity.class);
                i1.putExtra(ATM,"atmt");
                startActivity(i1);
            }
        });
        colt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,VlistActivity.class);
                i.putExtra(COLL,"cols");
                startActivity(i);

            }
        });

        Button scht=(Button)findViewById(R.id.uton2);
        Button rest=(Button)findViewById(R.id.uton7);
        Button host=(Button)findViewById(R.id.uton1);

        scht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Main3Activity.this,Main2Activity.class);
                i1.putExtra(SCH,"scht");
                startActivity(i1);
            }
        });
        host.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,Main2Activity.class);
                i.putExtra(HOS,"host");
                startActivity(i);

            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main3Activity.this,Main2Activity.class);
                i.putExtra(RES,"rest");
                startActivity(i);

            }
        });

        tvview.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(!tvview.equals("Get Your Location")){
            Intent i=new Intent(Main3Activity.this,Maps2Activity.class);
            i.putExtra("lat",latitude);
            i.putExtra("lon",longtitude);
            startActivity(i);


        }
    }
});


    }
private final void focusOnView(final HorizontalScrollView scroll,final View view){
    new Handler().post(new Runnable() {
        @Override
        public void run() {

            int sw=scroll.getWidth();
            scroll.smoothScrollTo((sw/4),0);
        }
    });
}
        private class GeocoderHandler extends Handler {
            @Override
            public void handleMessage(Message message){
                tvview=(TextView)findViewById(R.id.ttView);
                String locationAddress;
                switch(message.what) {
                    case 1:
                        Bundle bundle=message.getData();
                        locationAddress=bundle.getString("address");
                        break;
                    default:
                        locationAddress=null;

                }
                tvview.setText(locationAddress);

            }
        }

}
