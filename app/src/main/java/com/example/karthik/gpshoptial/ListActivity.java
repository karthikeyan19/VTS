package com.example.karthik.gpshoptial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {


        String a;
        ListView listView;
        String[] atmlist={"Axis Bank ATM,Sivakasi","State Bank ATM,Sivakasi","TMB ATM,Sivakasi",
                "Axis Bank ,Sivakasi",
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
    "Indian Bank,Sivakasi", "Axis Bank ATM,TTL","Tamilnadu Mercandile Bank ATM,TTL",
            "Axis Bank ATM,Thiruthangal",
    "Tamilnadu Mercandile Bank ATM,Thiruthangal",
    "Union Bank Of India ATM,Thiruthangal",
   " TMB ATM,Thiruthangal",
  "Axis Bank ATM,Thiruthangal",
    "HDFC bank,Thiruthangal",
    "IDBI ATM,Thiruthangal",
            "TMB Atm,Virudhunagar","HDFC Bank ATM,Virudhunagar","SBI ATM,Virudhunagar",
    "Indian Overseas Bank ATMs,Virudhunagar"
    ,"City Union Bank ATMs,Virudhunagar",
    "Lakshmi Vilas Bank ATMs,Virudhunagar",
    "Lakshmi Vilas Bank ATMs,Virudhunagar",
"ICICI Bank ATMs,Virudhunagar",
    "State Bank of India ATMs,Virudhunagar",
    "Tamilnad Mercantile Bank ATMs,Virudhunagar",
    "UCO Bank ATMs,Virudhunagar",
    "Karur Vysya Bank ATMs,Virudhunagar"
};
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
            "icici",
            "bindia", "axis","tmb",
            "axis",
            "tmb",
            "uni",
            "tmb",
            "axis",
            "hdfc",
            "idbi",
            "tmb","hdfc","sbi",
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
        public static  String CODE1="";
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("ATM");
            setSupportActionBar(toolbar);
            listView=(ListView)findViewById(R.id.listView2);
            ListAdapterArray stringArrayAdapter= new ListAdapterArray(getApplicationContext(), android.R.layout.list_content);
            listView.setAdapter(stringArrayAdapter);
            Bundle extra=getIntent().getExtras();
            if(extra!=null){
                {
                    a = extra.getString(Main3Activity.ATM);

                }


                    if(a.equals("atm")){

                        for(int i=0;i<43;i++)
                        {
                            stringArrayAdapter.add(new Content(atmlist[i],ico1[i]));
                        }
                    }
                }
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                String navi="a"+position;
                                Intent i=new Intent(ListActivity.this,MainActivity.class);
                                i.putExtra(CODE1,navi);
                                startActivity(i);
                        }
                    }
        );



    }

}
