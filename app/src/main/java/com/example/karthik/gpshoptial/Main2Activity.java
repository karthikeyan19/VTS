package com.example.karthik.gpshoptial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    String c,c1,c2,c3;
int ch=0;
    ListView listView;
    String[] clists={"Kamaraj College of Engineering and Technology "
            ,"V.V.Vanniaperumal College for Women,","VHNSN college","Sri Vidya College of Engineering"
            ,"Ayya Nadar Janaki Ammal College"
            ,"Sri Kaliswari College ",
            "Mepco Engineering College ",
            "PSR Engineering College - Sivakasi","AAA Engineering College","SFR College of Arts and Science for women","Renganayagi Varatharaj College of Engineering"};
    String[] cico={"kamaraj"
            ,"vani","vhnsn","vidya"
            ,"aj"
            ,"kalis",
            "mepco",
            "psr","aaa","sfr","renga","agp"};

    String[] ico11={"kvs","school","school","school","rj","kvs","school","jaycess","auna","school","school","school","school","school","school","lion","school","school","school","school","school","school","school","vskd","school","yrtv","aaa","school","srn","school","school"};
String[] ico1={"kvs","school","school","school","rj","kvs","school"};
    String[] ico21={"jaycess","auna","school","school","school","school","school","school","lion","school","school","school","school","school","school","vskd","school"};
    String[] ico3={"school","yrtv","aaa","school","srn","school","school"};
String[] schlist11={"KVS Matriculation Higher Secondary School, Virudhunagar",
        "P.S.Chidambara Nadar Senior English School, Virudhunagar" ,
        "Kshatriya Vidya Sala Middle School, Virudhunagar",
        "Kendriya Vidyalaya, Virudhunagar Virudhunagar",
        "RJ Mantra English School, Virudhunagar",
        "KVS Centenary School, Virudhunagar",
        "Kshatriya Girls' Middle School , Virudhunagar" ,
        "Jaycees Matriculation Hr. Sec. School, Sivakasi",
    "ANUA Municipal Hr Sec School Sivakasi",
   " AVM Marimuthu Nadar Hr.Sec.School, Sivakasi",
           " AVT High School ,Sivakasi",
   " CMS Girls Hr.Sec.School ,Sivakasi",

    "Coronation Girls High School ,Sivakasi",
  "  Kalaimagal Hr.Sec.School, Sivakasi",
           " Kamarajar Eng Medium School, Sivakasi",
    "Lion Melwin Jones Primary & Nursery, Sivakasi"
          ,
    "Municipal High School ,Sivakasi",
    "Muslim Hr Sec School,Sivakasi",
    "NPSS Rotary Matric High School, Sivakasi"
        ,
    "Senbaga Vinayagar Matriculation School,Sivakasi",
    "SHN Girls High School, Sivakasi",
    "SHNV Hr Sec School, Sivakasi",
        " A.P.Kaliappa Nadar Middle School, Sivakasi",
"VSKD school, Sivakasi",
        "Kalaimagal Thiruthangal"

        ,"Yrtv School Thiruthangal",

        "AAA INTERNATIONAL SCHOOL (CBSE) Thiruthangal",

        "KMKA Matriculation School Thiruthangal",

        "S.R.N. Govt Hr. Sec. School  Thiruthangal",

       " KMKA Matric Higher Secondary School",

        "Muthumari Matric Higher Secondary School Thiruthangal"
};
    String[] atmlist={"Axis Bank ATM","State Bank ATM","TMB ATM","Axis Bank ATM","Tamilnadu Mercandile Bank ATM","TMB Atm","HDFC Bank ATM","SBI ATM"};
  String[] hoslist={"Rural Mother Teresa Tertiary Care World Class Hospital in Madurai,Sivakasi",
          "Aarthy Hospital,Sivakasi",
    "Ajay Clinic,Sivakasi",
    "Alagan Sugalayam (Acupuncture),Sivakasi",
    "Annai Clinic,Sivakasi",
    "Aruna Children Hospital,Sivakasi",
    "Ashveny Clinic,Sivakasi",
    " Senthilkumar (Children Specialist),Sivakasi"
,   "C.Ramesh M.D(CHEST) D.T.C.D.,Sivakasi"
          ,"Dr. A.C.Thilagar (Dental)"
    ,"Dr. Chandragraham Medical Fundation,Sivakasi"
    ,"Dr. D. Balasubramaniyan,Sivakasi",
    "Dr. J. Venketesan B.P.T., Physiotherapist,Sivakasi",
   " Virudhunagar Government Hospital ,Virudhunagar",
    "Thiruvengadam Hospital,Virudhunagar",
    "Dr. Lysonder Hospital,Virudhunagar",
    "Suriyakandhi Hospital,Virudhunagar",
    "Karthik Nusing Home,Virudhunagar",
    "Holy Cross Hospital,Virudhunagar",
    "Rural Eye Hospital,Virudhunagar",
    "Sudhakaran Dental Clinic,Virudhunagar",
    "St. Luka Eye Hospital,Virudhunagar",
    "Thiruthangal Government Hospital, Thiruthangal",
    "NETHRA HOSPITAL,Thiruthangal",
    "S.M.V.Hospital - Dr.V.Mookiah,Thiruthangal",
    "Menaka Hospital,Thiruthangal",
    "Narmadha Nurshing Home,Thiruthangal",
    "DR.THANGAVEL CLINIC,Thiruthangal",
    "Arun Physiotheraphy,Thiruthangal"

};
    String[] hoslists={"Rural Mother Teresa Tertiary Care World Class Hospital in Madurai,Sivakasi",
            "Aarthy Hospital,Sivakasi",
            "Ajay Clinic,Sivakasi",
            "Alagan Sugalayam (Acupuncture),Sivakasi",
            "Annai Clinic,Sivakasi",
            "Aruna Children Hospital,Sivakasi",
            "Ashveny Clinic,Sivakasi",
            " Senthilkumar (Children Specialist),Sivakasi"
            ,   "C.Ramesh M.D(CHEST) D.T.C.D.,Sivakasi"
            ,"Dr. A.C.Thilagar (Dental)"
            ,"Dr. Chandragraham Medical Fundation,Sivakasi"
            ,"Dr. D. Balasubramaniyan,Sivakasi",
            "Dr. J. Venketesan B.P.T., Physiotherapist,Sivakasi"};
String[] hoslistv= {" Virudhunagar Government Hospital ,Virudhunagar",
        "Thiruvengadam Hospital,Virudhunagar",
        "Dr. Lysonder Hospital,Virudhunagar",
        "Suriyakandhi Hospital,Virudhunagar",
        "Karthik Nusing Home,Virudhunagar",
        "Holy Cross Hospital,Virudhunagar",
        "Rural Eye Hospital,Virudhunagar",
        "Sudhakaran Dental Clinic,Virudhunagar",
        "St. Luka Eye Hospital,Virudhunagar"};
String[] hoslistt= {"Thiruthangal Government Hospital, Thiruthangal",
        "NETHRA HOSPITAL,Thiruthangal",
        "S.M.V.Hospital - Dr.V.Mookiah,Thiruthangal",
        "Menaka Hospital,Thiruthangal",
        "Narmadha Nurshing Home,Thiruthangal",
        "DR.THANGAVEL CLINIC,Thiruthangal",
        "Arun Physiotheraphy,Thiruthangal"
};
    String[] schlistv= {"KVS Matriculation Higher Secondary School, Virudhunagar",
            "P.S.Chidambara Nadar Senior English School, Virudhunagar",
            "Kshatriya Vidya Sala Middle School, Virudhunagar",
            "Kendriya Vidyalaya, Virudhunagar Virudhunagar",
            "RJ Mantra English School, Virudhunagar",
            "KVS Centenary School, Virudhunagar",
            "Kshatriya Girls' Middle School , Virudhunagar"
    };
    String[] schlists1={"Jaycees Matriculation Hr. Sec. School, Sivakasi",
            "ANUA Municipal Hr Sec School Sivakasi",
            " AVM Marimuthu Nadar Hr.Sec.School, Sivakasi",
            " AVT High School ,Sivakasi",
            " CMS Girls Hr.Sec.School ,Sivakasi",
            "Coronation Girls High School ,Sivakasi",
            "  Kalaimagal Hr.Sec.School, Sivakasi",
            " Kamarajar Eng Medium School, Sivakasi",
            "Lion Melwin Jones Primary & Nursery, Sivakasi"
            ,
            "Municipal High School ,Sivakasi",
            "Muslim Hr Sec School,Sivakasi",
            "NPSS Rotary Matric High School, Sivakasi"
            ,
            "Senbaga Vinayagar Matriculation School,Sivakasi",
            "SHN Girls High School, Sivakasi",
            "SHNV Hr Sec School, Sivakasi",
            " A.P.Kaliappa Nadar Middle School, Sivakasi",
            "VSKD School,Sivakasi"};
   String[] schlistt={ "Kalaimagal Thiruthangal"

            ,"Yrtv School Thiruthangal",

            "AAA INTERNATIONAL SCHOOL (CBSE) Thiruthangal",

            "KMKA Matriculation School Thiruthangal",

            "S.R.N. Govt Hr. Sec. School  Thiruthangal",

            " KMKA Matric Higher Secondary School",

            "Muthumari Matric Higher Secondary School Thiruthangal"

};
    String[] res={"Karthik Hotel,Sivakasi - Veg",
            "Sharma Restaurant,Sivakasi - Veg",
            "C Square Cafe,Sivakasi",
            "Sree Baalaji Bhavan,Sivakasi - Veg",
            "Annapoorna Hotel,Sivakasi - Veg & NonVeg",
            "Marutham Restaurant,Sivakasi - Veg & NonVeg",
            "Sri Kaliswari Le Orchids,Sivakasi - Veg & NonVeg",
            "Sri Apoorva Restaurant,Sivakasi - Veg & NonVeg",
            "Navarasaa Restaurant,Sivakasi - Veg & NonVeg",
            "VIJAYAM MESS,Sivakasi - Veg & NonVeg"
            ,"Sharma Restaurant,Sivakasi - Veg & NonVeg",

            "Burma Kadai,Virudhunagar - Veg & NonVeg",
            "Kamaliya Garden Restaurant,Virudhunagar - Veg & NonVeg",
            "Burma Kadai,Virudhunagar - Veg & NonVeg",
            "Banu Restaurant,Virudhunagar - Veg & NonVeg",
            "Kamaliyas,Virudhunagar - Veg & NonVeg",
            "Prince Family Restaurant,Virudhunagar - Veg & NonVeg",
            "Rathina's Hot Bakes,Virudhunagar - Veg & NonVeg",
            "Sri Nandha Hotel,Virudhunagar - Veg & NonVeg",
            "Sree Kumaran Hote,Virudhunagarl - Veg & NonVeg",
            "Anandas Hotel,Virudhunagar - Veg & NonVeg",
            "S P Veg Restaurant,Virudhunagar - Veg & NonVeg",
            "Sathya Hotel,Virudhunagar - Veg & NonVeg",
            "Hotel Udupi Venkatesha Bhavan,Virudhunagar - Veg & NonVeg",
            "Udupi Venkateswara Bhavan,Virudhunagar - Veg",
            "Sri Udupi Woodlands,Virudhunagar - Veg",
            "Hotel Royal Vasantham,Virudhunagar - Veg",

            "Annai Cool Drinks,Thiruthangal",
            "Arun IceCream,Thiruthangal",
            "Karruppasamy Cafe,Thiruthangal"
            };
    String[] ress={"Karthik Hotel,Sivakasi - Veg",
            "Sharma Restaurant,Sivakasi - Veg",
            "C Square Cafe,Sivakasi",
            "Sree Baalaji Bhavan,Sivakasi - Veg",
            "Annapoorna Hotel,Sivakasi - Veg & NonVeg",
            "Marutham Restaurant,Sivakasi - Veg & NonVeg",
            "Sri Kaliswari Le Orchids,Sivakasi - Veg & NonVeg",
            "Sri Apoorva Restaurant,Sivakasi - Veg & NonVeg",
            "Navarasaa Restaurant,Sivakasi - Veg & NonVeg",
            "VIJAYAM MESS,Sivakasi - Veg & NonVeg"
            ,"Sharma Restaurant,Sivakasi - Veg & NonVeg"};
    String[] resv={
            "Burma Kadai,Virudhunagar - Veg & NonVeg",
            "Kamaliya Garden Restaurant,Virudhunagar - Veg & NonVeg",
            "Burma Kadai,Virudhunagar - Veg & NonVeg",
            "Banu Restaurant,Virudhunagar - Veg & NonVeg",
            "Kamaliyas,Virudhunagar - Veg & NonVeg",
            "Prince Family Restaurant,Virudhunagar - Veg & NonVeg",
            "Rathina's Hot Bakes,Virudhunagar - Veg & NonVeg",
            "Sri Nandha Hotel,Virudhunagar - Veg & NonVeg",
            "Sree Kumaran Hote,Virudhunagarl - Veg & NonVeg",
            "Anandas Hotel,Virudhunagar - Veg & NonVeg",
            "S P Veg Restaurant,Virudhunagar - Veg & NonVeg",
            "Sathya Hotel,Virudhunagar - Veg & NonVeg",
            "Hotel Udupi Venkatesha Bhavan,Virudhunagar - Veg & NonVeg",
            "Udupi Venkateswara Bhavan,Virudhunagar - Veg",
            "Sri Udupi Woodlands,Virudhunagar - Veg",
            "Hotel Royal Vasantham,Virudhunagar - Veg"
    };
    String[] rest={
            "Annai Cool Drinks,Thiruthangal",
            "Arun IceCream,Thiruthangal",
            "Karruppasamy Cafe,Thiruthangal"
    };
    public static  String CODE="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.listView1);
        ListAdapterArray stringArrayAdapter = new ListAdapterArray(getApplicationContext(), android.R.layout.list_content);
        listView.setAdapter(stringArrayAdapter);
        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            {
                c = extra.getString(Main3Activity.COLL);
                c1 = extra.getString(Main3Activity.SCH);
                c2 = extra.getString(Main3Activity.HOS);
                c3 = extra.getString(Main3Activity.RES);

            }


            if (c.equals("col")) {
                toolbar.setTitle("College");
                setSupportActionBar(toolbar);

                ch = 3;
                for (int i = 0; i < 11; i++) {
                    stringArrayAdapter.add(new Content(clists[i],cico[i]));
                }
            }
            if (c3.equals("res")) {
                toolbar.setTitle("Restaurant");
                setSupportActionBar(toolbar);

                ch = 6;
                for (int i = 0; i < 30; i++) {
                    stringArrayAdapter.add(new Content(res[i],"res"));
                }
            }
            if (c1.equals("scht")) {
                ch = 34;
                toolbar.setTitle("Schools in Thiruthangal");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 7; i++) {
                    stringArrayAdapter.add(new Content(schlistt[i],ico3[i]));
                }
                }
            if (c1.equals("schs")) {
                ch = 24;
                toolbar.setTitle("Schools in Sivakasi");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 17; i++) {
                    stringArrayAdapter.add(new Content(schlists1[i],ico21[i]));
                }
            }
            if (c1.equals("schv")) {
                ch = 14;
                toolbar.setTitle("Schools in Virudhunagar");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 7; i++) {
                    stringArrayAdapter.add(new Content(schlistv[i],ico1[i]));
                }
            }
            if (c1.equals("rest")) {
                ch = 36;
                toolbar.setTitle("Restaurant in Thiruthangal");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 3; i++) {
                    stringArrayAdapter.add(new Content(rest[i],"res"));
                }
            }
            if (c1.equals("ress")) {
                ch = 26;
                toolbar.setTitle("Restaurant in Sivakasi");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 11; i++) {
                    stringArrayAdapter.add(new Content(ress[i],"res"));
                }
            }
            if (c1.equals("resv")) {
                ch = 16;
                toolbar.setTitle("Restaurant in Virudhunagar");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 16; i++) {
                    stringArrayAdapter.add(new Content(resv[i],"res"));
                }
            }

            if (c1.equals("sch")) {
                ch = 4;
                toolbar.setTitle("Schools");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 31; i++) {
                    stringArrayAdapter.add(new Content(schlist11[i],ico11[i]));
                }
            }

            if (c2.equals("hos")) {
                ch = 5;
                toolbar.setTitle("Hospital");
                setSupportActionBar(toolbar);

                for (int i = 0; i < 29; i++) {
                    stringArrayAdapter.add(new Content(hoslist[i],"hospital"));
                }
            }
                if (c2.equals("host")) {
                    ch = 35;
                    toolbar.setTitle("Hospital in Thiruthangal");
                    setSupportActionBar(toolbar);

                    for (int i = 0; i < 7; i++) {
                        stringArrayAdapter.add(new Content(hoslistt[i],"hospital"));
                    }
                }
                    if (c2.equals("hoss")) {
                        ch = 25;
                        toolbar.setTitle("Hospital in Sivakasi");
                        setSupportActionBar(toolbar);

                        for (int i = 0; i < 13; i++) {
                            stringArrayAdapter.add(new Content(hoslists[i],"hospital"));
                        }
                    }
                        if (c2.equals("hosv")) {
                            ch = 15;
                            toolbar.setTitle("Hospital in Virudhunagar");
                            setSupportActionBar(toolbar);

                            for (int i = 0; i < 9; i++) {
                                stringArrayAdapter.add(new Content(hoslistv[i],"hospital"));
                            }
                        }
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (ch == 3) {
                            String navi = "c" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);

                        }
                        if (ch == 4) {
                            String navi = "s" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 14) {
                            String navi = "sv" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 24) {
                            String navi = "ss" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 34) {
                            String navi = "st" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }


                        if (ch == 5) {
                            String navi = "h" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 15) {
                            String navi = "hv" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 25) {
                            String navi = "hs" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }if (ch == 35) {
                            String navi = "ht" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 6) {
                            String navi = "r" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 16) {
                            String navi = "rv" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                        if (ch == 26) {
                            String navi = "rs" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }if (ch == 36) {
                            String navi = "rt" + position;
                            Intent i = new Intent(Main2Activity.this, MainActivity.class);
                            i.putExtra(CODE, navi);
                            startActivity(i);
                        }
                    }

                });
            }

        }

    }
