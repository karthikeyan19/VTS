package com.example.karthik.gpshoptial;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karthik on 3/5/2016.
 */
public class ListAdapterArray extends ArrayAdapter {


    private List chatlist = new ArrayList();
    // private ArrayAdapter cl;
    private LinearLayout si;

    Content content;

    public  void add(Content content) {
        chatlist.add(content);
        super.add(content);
    }

    public ListAdapterArray(Context context, int textviewid) {
        super(context, textviewid);
    }
    public int getCount()
    {
        return this.chatlist.size();
    }
    public Content getItem(int index)
    {
        return (Content) this.chatlist.get(index);
    }






    public View getView(int pos, View content, ViewGroup parent){
        View row=content;
        if(row==null)
        {

            LayoutInflater inflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            row=inflater.inflate(R.layout.listadapter,parent,false);

        }
        Content obj=getItem(pos);

        si=(LinearLayout)row.findViewById(R.id.linearLayout5);
        TextView cont = (TextView) row.findViewById(R.id.conte);
        ImageView ic=(ImageView)row.findViewById(R.id.ico);
        String i=obj.y;
        if(i.equals("school"))
        {ic.setImageResource(R.drawable.school);}
        if(i.equals("hospital"))
        {ic.setImageResource(R.drawable.hospital);}
if(i.equals("university")){ic.setImageResource(R.drawable.university);}
        if(i.equals("uni")){ic.setImageResource(R.drawable.uni);}
        if(i.equals("sbi")){ic.setImageResource(R.drawable.sbi);}
        if(i.equals("axis")){ic.setImageResource(R.drawable.axis);}

        if(i.equals("hdfc")){ic.setImageResource(R.drawable.hdfc);}
        if(i.equals("karuvur")){ic.setImageResource(R.drawable.karur);}
        if(i.equals("tmb")){ic.setImageResource(R.drawable.tmb);}
        if(i.equals("canara")){ic.setImageResource(R.drawable.canara);}
        if(i.equals("icici")){ic.setImageResource(R.drawable.icici);}
        if(i.equals("idbi")){ic.setImageResource(R.drawable.idbi);}
        if(i.equals("bindia")){ic.setImageResource(R.drawable.bindia);}
        if(i.equals("maharastra")){ic.setImageResource(R.drawable.maharashtra);}
        if(i.equals("catholic")){ic.setImageResource(R.drawable.catholic);
        }    if(i.equals("lakshmi")){ic.setImageResource(R.drawable.lash);}

        if(i.equals("jaycess")){ic.setImageResource(R.drawable.jecees);}
        if(i.equals("srn")){ic.setImageResource(R.drawable.srn);}
        if(i.equals("aaa")){ic.setImageResource(R.drawable.foot);}
        if(i.equals("kvs")){ic.setImageResource(R.drawable.kvs);}
        if(i.equals("lion")){ic.setImageResource(R.drawable.lion);}
        if(i.equals("rj")){ic.setImageResource(R.drawable.rjlogo);}
        if(i.equals("ruby")){ic.setImageResource(R.drawable.ruby);}
        if(i.equals("auna")){ic.setImageResource(R.drawable.auna);}
        if(i.equals("yrtv")){ic.setImageResource(R.drawable.yrtv);}
        if(i.equals("kamaraj")){ic.setImageResource(R.drawable.kamaraj);}
        if(i.equals("vani")){ic.setImageResource(R.drawable.vani);}
        if(i.equals("vhnsn")){ic.setImageResource(R.drawable.vhnsn);}
        if(i.equals("vidya")){ic.setImageResource(R.drawable.srividya);}
        if(i.equals("aj")){ic.setImageResource(R.drawable.aj);}
        if(i.equals("agp")){ic.setImageResource(R.drawable.ajp);}
        if(i.equals("aaa")){ic.setImageResource(R.drawable.aaa);}
        if(i.equals("renga")){ic.setImageResource(R.drawable.rag);}
        if(i.equals("psr")){ic.setImageResource(R.drawable.psr);}
        if(i.equals("sfr")){ic.setImageResource(R.drawable.sfr);}
        if(i.equals("kalis")){ic.setImageResource(R.drawable.kalis);}
        if(i.equals("mepco")){ic.setImageResource(R.drawable.mpco);}
if(i.equals("vskd")){ic.setImageResource(R.drawable.school);}
        if(i.equals("res")){ic.setImageResource(R.drawable.res);}
        cont.setText(obj.b);


        return row;
    }
    public Bitmap decodeToBitmap(byte[]decodedbyte)
    {
        return BitmapFactory.decodeByteArray(decodedbyte, 0, decodedbyte.length);
    }
}
