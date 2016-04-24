package com.example.karthik.gpshoptial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String co,co1,co2,co3,co4,co5,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
toolbar.setTitle("Addressssss");
        setSupportActionBar(toolbar);

        TextView adc = (TextView) findViewById(R.id.addrc);
        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            co = extra.getString(Main2Activity.CODE);
        }
        if (extra != null) {
            co1 = extra.getString(ListActivity.CODE1);
        }
        if (extra != null) {
            co2 = extra.getString(AtmListActivity.CODE1);
        }
        if (extra != null) {
            co3 = extra.getString(VlistActivity.CODE);
        }
        if (extra != null) {
            co4 = extra.getString(Main2Activity.CODE);
        }
        if (extra != null) {
            co5 = extra.getString(Main2Activity.CODE);
        }
        if (extra != null) {
            e = extra.getString(Main3Activity.EMP);
        }
        if (e.equals("emp")) {
            adc.setText(R.string.empa);
        }
        if (co.equals("c0")) {
            adc.setText(R.string.cv1);
        }
        if (co.equals("c1")) {
            adc.setText(R.string.cv2);
        }
        if (co.equals("c2")) {
            adc.setText(R.string.cv3);
        }
        if (co.equals("c3")) {
            adc.setText(R.string.cv4);
        }
        if (co.equals("c4")) {
            adc.setText(R.string.cs1);
        }

        if (co.equals("c5")) {
            adc.setText(R.string.cs2);
        }
        if (co.equals("c6")) {
            adc.setText(R.string.cs3);
        }
        if (co.equals("c7")) {
            adc.setText(R.string.cs4);
        }
        if (co.equals("c8")) {
            adc.setText(R.string.cs5);
        }
        if (co.equals("c9")) {
            adc.setText(R.string.cs6);
        }
        if (co.equals("c10")) {
            adc.setText(R.string.cs7);
        }

        if (co.equals("r0")) {
            adc.setText(R.string.sres1);
        }
        if (co.equals("r1")) {
            adc.setText(R.string.sres2);
        }
        if (co.equals("r2")) {
            adc.setText(R.string.sres3);
        }
        if (co.equals("r3")) {
            adc.setText(R.string.sres4);
        }
        if (co.equals("r4")) {
            adc.setText(R.string.sres5);
        }

        if (co.equals("r5")) {
            adc.setText(R.string.sres6);
        }
        if (co.equals("r6")) {
            adc.setText(R.string.sres7);
        }
        if (co.equals("r7")) {
            adc.setText(R.string.sres8);
        }
        if (co.equals("r8")) {
            adc.setText(R.string.sres9);
        }
        if (co.equals("r9")) {
            adc.setText(R.string.sres10);
        }
        if (co.equals("r10")) {
            adc.setText(R.string.sres11);
        }

        if (co.equals("r11")) {
            adc.setText(R.string.vres1);
        }
        if (co.equals("r12")) {
            adc.setText(R.string.vres2);
        }
        if (co.equals("r13")) {
            adc.setText(R.string.vres3);
        }
        if (co.equals("r14")) {
            adc.setText(R.string.vres4);
        }
        if (co.equals("r15")) {
            adc.setText(R.string.vres5);
        }

        if (co.equals("r16")) {
            adc.setText(R.string.vres6);
        }
        if (co.equals("r17")) {
            adc.setText(R.string.vres7);
        }
        if (co.equals("r18")) {
            adc.setText(R.string.vres8);
        }
        if (co.equals("r19")) {
            adc.setText(R.string.vres9);
        }
        if (co.equals("r20")) {
            adc.setText(R.string.vres10);
        }
        if (co.equals("r21")) {
            adc.setText(R.string.vres11);
        }

        if (co.equals("r22")) {
            adc.setText(R.string.vres12);
        }
        if (co.equals("r23")) {
            adc.setText(R.string.vres13);
        }
        if (co.equals("r24")) {
            adc.setText(R.string.vres14);
        }
        if (co.equals("r25")) {
            adc.setText(R.string.vres15);
        }
        if (co.equals("r26")) {
            adc.setText(R.string.vres16);
        }

        if (co.equals("r27")) {
            adc.setText(R.string.tres1);
        }
        if (co.equals("r28")) {
            adc.setText(R.string.tres2);
        }
        if (co.equals("r29")) {
            adc.setText(R.string.tres3);
        }
        if (co.equals("rs0")) {
            adc.setText(R.string.sres1);
        }
        if (co.equals("rs1")) {
            adc.setText(R.string.sres2);
        }
        if (co.equals("rs2")) {
            adc.setText(R.string.sres3);
        }
        if (co.equals("rs3")) {
            adc.setText(R.string.sres4);
        }
        if (co.equals("rs4")) {
            adc.setText(R.string.sres5);
        }

        if (co.equals("rs5")) {
            adc.setText(R.string.sres6);
        }
        if (co.equals("rs6")) {
            adc.setText(R.string.sres7);
        }
        if (co.equals("rs7")) {
            adc.setText(R.string.sres8);
        }
        if (co.equals("rs8")) {
            adc.setText(R.string.sres9);
        }
        if (co.equals("rs9")) {
            adc.setText(R.string.sres10);
        }
        if (co.equals("rs10")) {
            adc.setText(R.string.sres11);
        }

        if (co.equals("rv0")) {
            adc.setText(R.string.vres1);
        }
        if (co.equals("rv1")) {
            adc.setText(R.string.vres2);
        }
        if (co.equals("rv2")) {
            adc.setText(R.string.vres3);
        }
        if (co.equals("rv3")) {
            adc.setText(R.string.vres4);
        }
        if (co.equals("rv4")) {
            adc.setText(R.string.vres5);
        }

        if (co.equals("rv5")) {
            adc.setText(R.string.vres6);
        }
        if (co.equals("rv6")) {
            adc.setText(R.string.vres7);
        }
        if (co.equals("rv7")) {
            adc.setText(R.string.vres8);
        }
        if (co.equals("rv8")) {
            adc.setText(R.string.vres9);
        }
        if (co.equals("rv9")) {
            adc.setText(R.string.vres10);
        }
        if (co.equals("rv10")) {
            adc.setText(R.string.vres11);
        }

        if (co.equals("rv11")) {
            adc.setText(R.string.vres12);
        }
        if (co.equals("rv12")) {
            adc.setText(R.string.vres13);
        }
        if (co.equals("rv13")) {
            adc.setText(R.string.vres14);
        }
        if (co.equals("rv14")) {
            adc.setText(R.string.vres15);
        }
        if (co.equals("rv15")) {
            adc.setText(R.string.vres16);
        }

        if (co.equals("rt0")) {
            adc.setText(R.string.tres1);
        }
        if (co.equals("rt1")) {
            adc.setText(R.string.tres2);
        }
        if (co.equals("rt2")) {
            adc.setText(R.string.tres3);
        }


        if (co1.equals("a0")) {
            adc.setText(R.string.satm1);
        }
        if (co1.equals("a1")) {
            adc.setText(R.string.satm2);
        }
        if (co1.equals("a2")) {
            adc.setText(R.string.satm3);
        }
        if (co1.equals("a3")) {
            adc.setText(R.string.satm4);
        }
        if (co1.equals("a4")) {
            adc.setText(R.string.satm5);
        }
        if (co1.equals("a5")) {
            adc.setText(R.string.satm6);
        }
        if (co1.equals("a6")) {
            adc.setText(R.string.satm7);
        }
        if (co1.equals("a7")) {
            adc.setText(R.string.satm8);
        }
        if (co1.equals("a8")) {
            adc.setText(R.string.satm9);
        }
        if (co1.equals("a9")) {
            adc.setText(R.string.satm10);
        }
        if (co1.equals("a10")) {
            adc.setText(R.string.satm11);
        }
        if (co1.equals("a11")) {
            adc.setText(R.string.satm12);
        }
        if (co1.equals("a12")) {
            adc.setText(R.string.satm13);
        }
        if (co1.equals("a13")) {
            adc.setText(R.string.satm14);
        }
        if (co1.equals("a14")) {
            adc.setText(R.string.satm15);
        }
        if (co1.equals("a15")) {
            adc.setText(R.string.satm16);
        }
        if (co1.equals("a16")) {
            adc.setText(R.string.satm17);
        }
        if (co1.equals("a17")) {
            adc.setText(R.string.satm18);
        }
        if (co1.equals("a18")) {
            adc.setText(R.string.satm19);
        } if (co1.equals("a19")) {
            adc.setText(R.string.satm20);
        }
        if (co1.equals("a20")) {
            adc.setText(R.string.satm21);
        }
        if (co1.equals("a21")) {
            adc.setText(R.string.satm22);
        }

        if (co1.equals("a22")){
            adc.setText(R.string.tatm1);
        }
        if (co1.equals("a23")) {
            adc.setText(R.string.tatm2);
        }
        if (co1.equals("a24")) {
            adc.setText(R.string.tatm3);
        }
        if (co1.equals("a25")) {
            adc.setText(R.string.tatm4);
        }
        if (co1.equals("a26")) {
            adc.setText(R.string.tatm5);
        }
        if (co1.equals("a27")) {
            adc.setText(R.string.tatm6);
        }
        if (co1.equals("a28")) {
            adc.setText(R.string.tatm7);
        }
        if (co1.equals("a29")) {
            adc.setText(R.string.tatm8);
        }
        if (co1.equals("a30")) {
            adc.setText(R.string.tatm9);
        }


        if (co1.equals("a31")) {
            adc.setText(R.string.vatm1);
        }
        if (co1.equals("a32")) {
            adc.setText(R.string.vatm2);
        }
        if (co1.equals("a33")) {
            adc.setText(R.string.vatm3);
        }
        if (co1.equals("a34")) {
            adc.setText(R.string.vatm4);
        }
        if (co1.equals("a35")) {
            adc.setText(R.string.vatm5);
        }
        if (co1.equals("a36")) {
            adc.setText(R.string.vatm6);
        }
        if (co1.equals("a37")) {
            adc.setText(R.string.vatm7);
        }
        if (co1.equals("a38")) {
            adc.setText(R.string.vatm8);
        }
        if (co1.equals("a39")) {
            adc.setText(R.string.vatm9);
        }
        if (co1.equals("a40")) {
            adc.setText(R.string.vatm10);
        }
        if (co1.equals("a41")) {
            adc.setText(R.string.vatm11);
        }
        if (co1.equals("a42")) {
            adc.setText(R.string.vatm12);
        }

        if (co2.equals("cv0")) {
            adc.setText(R.string.cv1);
        }
        if (co2.equals("cv1")) {
            adc.setText(R.string.cv2);
        }
        if (co2.equals("cv2")) {
            adc.setText(R.string.cv3);
        }
        if (co2.equals("cv3")) {
            adc.setText(R.string.cv4);
        }

        if (co2.equals("av0")) {
            adc.setText(R.string.vatm1);
        }
        if (co2.equals("av1")) {
            adc.setText(R.string.vatm2);
        }
        if (co2.equals("av2")) {
            adc.setText(R.string.vatm3);
        }
        if (co2.equals("av3")) {
            adc.setText(R.string.vatm4);
        }
        if (co2.equals("av4")) {
            adc.setText(R.string.vatm5);
        }
        if (co2.equals("av5")) {
            adc.setText(R.string.vatm6);
        }
        if (co2.equals("av6")) {
            adc.setText(R.string.vatm7);
        }
        if (co2.equals("av7")) {
            adc.setText(R.string.vatm8);
        }
        if (co2.equals("av8")) {
            adc.setText(R.string.vatm9);
        }
        if (co2.equals("av9")) {
            adc.setText(R.string.vatm10);
        }
        if (co2.equals("av10")) {
            adc.setText(R.string.vatm11);
        }
        if (co2.equals("av11")) {
            adc.setText(R.string.vatm12);
        }



        if (co3.equals("cs0")) {
            adc.setText(R.string.cs1);
        }
        if (co3.equals("cs1")) {
            adc.setText(R.string.cs2);
        }
        if (co3.equals("cs2")) {
            adc.setText(R.string.cs3);
        }
        if (co3.equals("cs3")) {
            adc.setText(R.string.cs4);
        }
        if (co3.equals("cs4")) {
            adc.setText(R.string.cs5);
        }
        if (co3.equals("cs5")) {
            adc.setText(R.string.cs6);
        }
        if (co3.equals("cs6")) {
            adc.setText(R.string.cs7);
        }

        if (co2.equals("as0")) {
            adc.setText(R.string.satm1);
        }
        if (co2.equals("as1")) {
            adc.setText(R.string.satm2);
        }
        if (co2.equals("as2")) {
            adc.setText(R.string.satm3);
        }
        if (co2.equals("as3")) {
            adc.setText(R.string.satm4);
        }
        if (co2.equals("as4")) {
            adc.setText(R.string.satm5);
        }
        if (co2.equals("as5")) {
            adc.setText(R.string.satm6);
        }
        if (co2.equals("as6")) {
            adc.setText(R.string.satm7);
        }
        if (co2.equals("as7")) {
            adc.setText(R.string.satm8);
        }
        if (co2.equals("as8")) {
            adc.setText(R.string.satm9);
        }
        if (co2.equals("as9")) {
            adc.setText(R.string.satm10);
        }
        if (co2.equals("as10")) {
            adc.setText(R.string.satm11);
        }
        if (co2.equals("as11")) {
            adc.setText(R.string.satm12);
        }
        if (co2.equals("as12")) {
            adc.setText(R.string.satm13);
        }
        if (co2.equals("as13")) {
            adc.setText(R.string.satm14);
        }
        if (co2.equals("as14")) {
            adc.setText(R.string.satm15);
        }
        if (co2.equals("as15")) {
            adc.setText(R.string.satm16);
        }
        if (co2.equals("as16")) {
            adc.setText(R.string.satm17);
        }
        if (co2.equals("as17")) {
            adc.setText(R.string.satm18);
        }
        if (co2.equals("as18")) {
            adc.setText(R.string.satm19);
        } if (co2.equals("as19")) {
            adc.setText(R.string.satm20);
        }
        if (co2.equals("as20")) {
            adc.setText(R.string.satm21);
        }
        if (co2.equals("as21")) {
            adc.setText(R.string.satm22);
        }

        if (co2.equals("at0")) {
            adc.setText(R.string.tatm1);
        }
        if (co2.equals("at1")) {
            adc.setText(R.string.tatm2);
        }
        if (co2.equals("at2")) {
            adc.setText(R.string.tatm3);
        }
        if (co2.equals("at3")) {
            adc.setText(R.string.tatm4);
        }
        if (co2.equals("at4")) {
            adc.setText(R.string.tatm5);
        }
        if (co2.equals("at5")) {
            adc.setText(R.string.tatm6);
        }
        if (co2.equals("at6")) {
            adc.setText(R.string.tatm7);
        }
        if (co2.equals("at7")) {
            adc.setText(R.string.tatm8);
        }
        if (co2.equals("at8")) {
            adc.setText(R.string.tatm9);
        }

        if (co4.equals("s0")) {
            adc.setText(R.string.sv1);
        }
        if (co4.equals("s1")) {
            adc.setText(R.string.sv2);
        }
        if (co4.equals("s2")) {
            adc.setText(R.string.sv3);
        }
        if (co4.equals("s3")) {
            adc.setText(R.string.sv4);
        }
        if (co4.equals("s4")) {
            adc.setText(R.string.sv5);
        }
        if (co4.equals("s5")) {
            adc.setText(R.string.sv6);
        }
        if (co4.equals("s6")) {
            adc.setText(R.string.sv7);
        }
        if (co4.equals("s7")) {
            adc.setText(R.string.ss1);
        }
        if (co4.equals("s8")) {
            adc.setText(R.string.ss2);
        }
        if (co4.equals("s9")) {
            adc.setText(R.string.ss3);
        }
        if (co4.equals("s10")) {
            adc.setText(R.string.ss4);
        }
        if (co4.equals("s11")) {
            adc.setText(R.string.ss5);
        }
        if (co4.equals("s12")) {
            adc.setText(R.string.ss6);
        }
        if (co4.equals("s13")) {
            adc.setText(R.string.ss7);
        }
        if (co4.equals("s14")) {
            adc.setText(R.string.ss8);
        }
        if (co4.equals("s15")) {
            adc.setText(R.string.ss10);
        }
        if (co4.equals("s16")) {
            adc.setText(R.string.ss11);
        }
        if (co4.equals("s17")) {
            adc.setText(R.string.ss12);
        }
        if (co4.equals("s18")) {
            adc.setText(R.string.ss13);
        }
        if (co4.equals("s19")) {
            adc.setText(R.string.ss14);
        }
        if (co4.equals("s20")) {
            adc.setText(R.string.ss15);
        }
        if (co4.equals("s21")) {
            adc.setText(R.string.ss16);
        }
        if (co4.equals("s22")) {
            adc.setText(R.string.ss17);
        }
        if(co.equals("s23")){adc.setText(R.string.ss18);}
        if (co4.equals("s24")) {
            adc.setText(R.string.st1);
        }
        if (co4.equals("s25")) {
            adc.setText(R.string.st2);
        }
        if (co4.equals("s26")) {
            adc.setText(R.string.st3);
        }
        if (co4.equals("s27")) {
            adc.setText(R.string.st4);
        }
        if (co4.equals("s28")) {
            adc.setText(R.string.st5);
        }
        if (co4.equals("s29")) {
            adc.setText(R.string.st6);
        }
        if (co4.equals("s30")) {
            adc.setText(R.string.st7);
        }
        if (co5.equals("h0")) {
            adc.setText(R.string.hs1);

        }
        if (co5.equals("h1")) {
            adc.setText(R.string.hs2);

        }
        if (co5.equals("h2")) {
            adc.setText(R.string.hs3);

        }
        if (co5.equals("h3")) {
            adc.setText(R.string.hs4);

        }
        if (co5.equals("h4")) {
            adc.setText(R.string.hs5);

        }
        if (co5.equals("h5")) {
            adc.setText(R.string.hs6);

        }
        if (co5.equals("h6")) {
            adc.setText(R.string.hs7);

        }
        if (co5.equals("h7")) {
            adc.setText(R.string.hs8);

        }
        if (co5.equals("h8")) {
            adc.setText(R.string.hs9);

        }
        if (co5.equals("h9")) {
            adc.setText(R.string.hs10);

        }
        if (co5.equals("h10")) {
            adc.setText(R.string.hs11);

        }
        if (co5.equals("h11")) {
            adc.setText(R.string.hs12);

        }
        if (co5.equals("h12")) {
            adc.setText(R.string.hs13);

        }
        if (co5.equals("h13")) {
            adc.setText(R.string.hv1);

        }
        if (co5.equals("h14")) {
            adc.setText(R.string.hv2);

        }
        if (co5.equals("h15")) {
            adc.setText(R.string.hv3);

        }
        if (co5.equals("h16")) {
            adc.setText(R.string.hv4);

        }
        if (co5.equals("h17")) {
            adc.setText(R.string.hv5);

        }
        if (co5.equals("h18")) {
            adc.setText(R.string.hv6);

        }
        if (co5.equals("h19")) {
            adc.setText(R.string.hv7);

        }
        if (co5.equals("h20")) {
            adc.setText(R.string.hv8);

        }
        if (co5.equals("h21")) {
            adc.setText(R.string.hv9);

        }
        if (co5.equals("h22")) {
            adc.setText(R.string.ht1);

        }
        if (co5.equals("h23")) {
            adc.setText(R.string.ht2);

        }
        if (co5.equals("h24")) {
            adc.setText(R.string.ht3);

        }
        if (co5.equals("h25")) {
            adc.setText(R.string.ht4);

        }
        if (co5.equals("h26")) {
            adc.setText(R.string.ht5);

        }
        if (co5.equals("h27")) {
            adc.setText(R.string.ht6);

        }
        if (co5.equals("h28")) {
            adc.setText(R.string.ht7);

        }
        if (co.equals("hs0")) {
            adc.setText(R.string.hs1);

        }
        if (co.equals("hs1")) {
            adc.setText(R.string.hs2);

        }
        if (co.equals("hs2")) {
            adc.setText(R.string.hs3);

        }
        if (co.equals("hs3")) {
            adc.setText(R.string.hs4);

        }
        if (co.equals("hs4")) {
            adc.setText(R.string.hs5);

        }
        if (co.equals("hs5")) {
            adc.setText(R.string.hs6);

        }
        if (co.equals("hs6")) {
            adc.setText(R.string.hs7);

        }
        if (co.equals("hs7")) {
            adc.setText(R.string.hs8);

        }
        if (co.equals("hs8")) {
            adc.setText(R.string.hs9);

        }
        if (co.equals("hs9")) {
            adc.setText(R.string.hs10);

        }
        if (co.equals("hs10")) {
            adc.setText(R.string.hs11);

        }
        if (co.equals("hs11")) {
            adc.setText(R.string.hs12);

        }
        if (co.equals("hs12")) {
            adc.setText(R.string.hs13);

        }
        if (co.equals("hv0")) {
            adc.setText(R.string.hv1);

        }
        if (co.equals("hv1")) {
            adc.setText(R.string.hv2);

        }
        if (co.equals("hv2")) {
            adc.setText(R.string.hv3);

        }
        if (co.equals("hv3")) {
            adc.setText(R.string.hv4);

        }
        if (co.equals("hv4")) {
            adc.setText(R.string.hv5);

        }
        if (co.equals("hv5")) {
            adc.setText(R.string.hv6);

        }
        if (co.equals("hv6")) {
            adc.setText(R.string.hv7);

        }
        if (co.equals("hv7")) {
            adc.setText(R.string.hv8);

        }
        if (co.equals("hv8")) {
            adc.setText(R.string.hv9);

        }
        if (co.equals("ht0")) {
            adc.setText(R.string.ht1);

        }
        if (co.equals("ht1")) {
            adc.setText(R.string.ht2);

        }
        if (co.equals("ht2")) {
            adc.setText(R.string.ht3);

        }
        if (co.equals("ht3")) {
            adc.setText(R.string.ht4);

        }
        if (co.equals("ht4")) {
            adc.setText(R.string.ht5);

        }
        if (co.equals("ht5")) {
            adc.setText(R.string.ht6);

        }
        if (co.equals("ht6")) {
            adc.setText(R.string.ht7);

        }
        if (co.equals("sv0")) {
            adc.setText(R.string.sv1);
        }
        if (co.equals("sv1")) {
            adc.setText(R.string.sv2);
        }
        if (co.equals("sv2")) {
            adc.setText(R.string.sv3);
        }
        if (co.equals("sv3")) {
            adc.setText(R.string.sv4);
        }
        if (co.equals("sv4")) {
            adc.setText(R.string.sv5);
        }
        if (co.equals("sv5")) {
            adc.setText(R.string.sv6);
        }
        if (co.equals("sv6")) {
            adc.setText(R.string.sv7);
        }
        if (co.equals("ss0")) {
            adc.setText(R.string.ss1);
        }
        if (co.equals("ss1")) {
            adc.setText(R.string.ss2);
        }
        if (co.equals("ss2")) {
            adc.setText(R.string.ss3);
        }
        if (co.equals("ss3")) {
            adc.setText(R.string.ss4);
        }
        if (co.equals("ss4")) {
            adc.setText(R.string.ss5);
        }
        if (co.equals("ss5")) {
            adc.setText(R.string.ss6);
        }
        if (co.equals("ss6")) {
            adc.setText(R.string.ss7);
        }
        if (co.equals("ss7")) {
            adc.setText(R.string.ss8);
        }
        if (co.equals("ss8")) {
            adc.setText(R.string.ss10);
        }
        if (co.equals("ss9")) {
            adc.setText(R.string.ss11);
        }
        if (co.equals("ss10")) {
            adc.setText(R.string.ss12);
        }
        if (co.equals("ss11")) {
            adc.setText(R.string.ss13);
        }
        if (co.equals("ss12")) {
            adc.setText(R.string.ss14);
        }
        if (co.equals("ss13")) {
            adc.setText(R.string.ss15);
        }
        if (co.equals("ss14")) {
            adc.setText(R.string.ss16);
        }
        if (co.equals("ss15")) {
            adc.setText(R.string.ss17);
        }
        if (co.equals("st0")) {
            adc.setText(R.string.st1);
        }
        if (co.equals("st1")) {
            adc.setText(R.string.st2);
        }
        if (co.equals("st2")) {
            adc.setText(R.string.st3);
        }
        if (co.equals("st3")) {
            adc.setText(R.string.st4);
        }
        if (co.equals("st4")) {
            adc.setText(R.string.st5);
        }
        if (co.equals("st5")) {
            adc.setText(R.string.st6);
        }
        if (co.equals("st6")) {
            adc.setText(R.string.st7);
        }
if(co.equals("ss16")){adc.setText(R.string.ss18);}

    }}
