package com.example.karthik.gpshoptial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AtmListActivity extends AppCompatActivity {
int ch=0;
    String a;
    ListView listView;
    String[] atmlist={"TMB Atm,Virudhunagar","HDFC Bank ATM,Virudhunagar","SBI ATM,Virudhunagar", "Indian Overseas Bank ATMs,Virudhunagar"
            ,"City Union Bank ATMs,Virudhunagar",
            "Lakshmi Vilas Bank ATMs,Virudhunagar",
            "Lakshmi Vilas Bank ATMs,Virudhunagar",
            "ICICI Bank ATMs,Virudhunagar",
            "State Bank of India ATMs,Virudhunagar",
            "Tamilnad Mercantile Bank ATMs,Virudhunagar",
            "UCO Bank ATMs,Virudhunagar",
            "Karur Vysya Bank ATMs,Virudhunagar"};
    String[] ico={"tmb","hdfc","sbi",
            "bindia"
            ,"uni",
            "lakshmi",
            "lakshmi",
            "icici",
            "sbi",
            "tmb",
            "uni",
            "karuvur"
    };
    String[] atmlist1={"Axis Bank ATM,Sivakasi","State Bank ATM,Sivakasi","TMB ATM,Sivakasi","Axis Bank,Sivakasi",
            "Axis Bank,Sivakasi",
            "Axis Bank,Sivakasi",
            "Axis Bank,Sivakasi",
            "Axis Bank,Sivakasi",
            "Axis Bank,Sivakasi",
            "Bank of Baroda,Sivakasi",
            "Bank of India,Sivakasi",
            "Bank of India,Sivakasi",
            "Bank of Maharastra,Sivakasi",
            "Canara Bank,Sivakasi",
            "Catholic syrian bank,Sivakasi",
            "Central Bank,Sivakasi",
            "City Union Bank,Sivakasi",
            "HDFC Bank,Sivakasi",
            " HDFC Bank,Sivakasi",
            "ICICI Bank,Sivakasi",
            "ICICI Bank,Sivakasi",
            "Indian Bank,Sivakasi"};
    String[] ico1={"axis","sbi","tmb",
            "axis",
            "axis",
            "axis",
            "axis",
            "axis",
            "axis",
            "axis",
            "bindia",
            "bindia",
            "maharastra",
            "canara",
            "catholic",
            "uni",
            "uni",
            "hdfc",
            "hdfc",
            "icici",
            "icici","bindia"};
    String[] atmlist2={"Axis Bank ATM,TTL","Tamilnadu Mercandile Bank ATM,TTL","Axis Bank ATM,Thiruthangal",
            "Tamilnadu Mercandile Bank ATM,Thiruthangal",
            "Union Bank Of India ATM,Thiruthangal",
            " TMB ATM,Thiruthangal",
            "Axis Bank ATM,Thiruthangal",
            "HDFC bank,Thiruthangal",
            "IDBI ATM,Thiruthangal"};
    String[] ico2={  "axis","tmb",
            "axis",
            "tmb",
            "uni",
            "tmb",
            "axis",
            "hdfc",
            "idbi",
    };
    public static  String CODE1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        listView=(ListView)findViewById(R.id.listView4);
        ListAdapterArray stringArrayAdapter= new ListAdapterArray(getApplicationContext(), android.R.layout.list_content);
        listView.setAdapter(stringArrayAdapter);
        Bundle extra=getIntent().getExtras();
        if(extra!=null){
            {
                a = extra.getString(Main3Activity.ATM);

            }


            if(a.equals("atmv")){
ch=3;
                toolbar.setTitle("ATM Virudhunagar");
                setSupportActionBar(toolbar);

                for(int i=0;i<11;i++)
                {
                    stringArrayAdapter.add(new Content(atmlist[i],ico[i]));
                }
            }
            if(a.equals("atms")){
ch=4;
                toolbar.setTitle("ATM Sivakasi");
                setSupportActionBar(toolbar);

                for(int i=0;i<22;i++)
                {
                    stringArrayAdapter.add(new Content(atmlist1[i],ico1[i]));
                }
            }
            if(a.equals("atmt")){
                ch=5;
                toolbar.setTitle("ATM Thiruthangal");
                setSupportActionBar(toolbar);

                for(int i=0;i<9;i++)
                {
                    stringArrayAdapter.add(new Content(atmlist2[i],ico2[i]));
                }
            }
        }
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                             if(ch==3) {
                                                 String navi = "av" + position;
                                                 Intent i = new Intent(AtmListActivity.this, MainActivity.class);
                                                 i.putExtra(CODE1, navi);
                                                 startActivity(i);
                                             }
                                                if(ch==4) {
                                                    String navi = "as" + position;
                                                    Intent i = new Intent(AtmListActivity.this, MainActivity.class);
                                                    i.putExtra(CODE1, navi);
                                                    startActivity(i);
                                                }
                                                if(ch==5) {
                                                    String navi = "at" + position;
                                                    Intent i = new Intent(AtmListActivity.this, MainActivity.class);
                                                    i.putExtra(CODE1, navi);
                                                    startActivity(i);
                                                }

                                            }

                                        }
        );

    }

}
