package com.example.karthik.gpshoptial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class VlistActivity extends AppCompatActivity {
    String[] clists={"Kamaraj College of Engineering and Technology "
            ,"V.V.Vanniaperumal College for Women,","VHNSN college"
            ,"Sri Vidya College of Engineering"};
    String c,a;
    int ch=0;
    ListView listView;
    public static  String CODE="";
    String[] clists1={
            "Ayya Nadar Janaki Ammal College"
            ,"Sri Kaliswari College ",
            "Mepco Engineering College "
            ,"PSR Engineering College - Sivakasi","AAA Engineering College","SFR College of Arts and Science for women","Renganayagi Varatharaj College of Engineering"};
    String[] cico= {"kamaraj"
            , "vani", "vhnsn", "vidya"
    };
    String[] cico1={"aj"
            ,"kalis",
            "mepco",
            "psr","aaa","sfr","renga","agp"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        listView=(ListView)findViewById(R.id.listView3);
        ListAdapterArray stringArrayAdapter= new ListAdapterArray(getApplicationContext(), android.R.layout.list_content);
        listView.setAdapter(stringArrayAdapter);

        Bundle extra=getIntent().getExtras();

        if(extra!=null){
            {
                c = extra.getString(Main3Activity.COLL);

            }

            if(c.equals("colv")){
                ch=3;
                toolbar.setTitle("Colleges in Virudhunagar");
                setSupportActionBar(toolbar);

                for(int i=0;i<4;i++)
                {
                    stringArrayAdapter.add(new Content(clists[i],cico[i]));
                }
            }
            if(c.equals("cols")){
                ch=4;
                toolbar.setTitle("Colleges in Sivakasi-Thiruthangal");
                setSupportActionBar(toolbar);

                for(int i=0;i<7;i++)
                {
                    stringArrayAdapter.add(new Content(clists1[i],cico1[i]));
                }
            }
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

if(ch==3) {
    String navi = "cv" + position;
    Intent i = new Intent(VlistActivity.this, MainActivity.class);
    i.putExtra(CODE, navi);
    startActivity(i);
}
                    if(ch==4) {
                        String navi = "cs" + position;
                        Intent i = new Intent(VlistActivity.this, MainActivity.class);
                        i.putExtra(CODE, navi);
                        startActivity(i);
                    }

                }
            });

    }

}}
