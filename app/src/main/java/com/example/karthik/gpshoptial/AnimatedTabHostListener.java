package com.example.karthik.gpshoptial;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TabHost;

/**
 * Created by Karthik on 4/3/2016.
 */
public class AnimatedTabHostListener implements TabHost.OnTabChangeListener {
private static final int ANIMATION_TIME=240;
    private TabHost tabHost;
    private View pre;
    private View cur;
    private GestureDetector gestureDetector;
    private int curTab;
    public AnimatedTabHostListener(Context context,TabHost tabHost){
this.tabHost=tabHost;
        this.pre=tabHost.getCurrentTabView();
        gestureDetector=new GestureDetector(context,new MyGestureDetector());
        tabHost.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(gestureDetector.onTouchEvent(event)) {
                    return false;
                }
            else
                {
                    return true;
                }}
        });
    }
    @Override
    public void onTabChanged(String tabId) {
      cur=tabHost.getCurrentView();
        if(tabHost.getCurrentTab()>curTab)
        {
            pre.setAnimation(outToLeftAnimation());
            cur.setAnimation(inFromRightAnimation());
        }
        else
        {
            pre.setAnimation(outToRightAnimation());
            cur.setAnimation(inFromLeftAnimation());

        }
        pre=cur;
        curTab=tabHost.getCurrentTab();
    }
private Animation inFromRightAnimation()
    {
        Animation inFromRight=new TranslateAnimation(Animation.RELATIVE_TO_PARENT,1.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f);
        return setProperties(inFromRight);
    }
    private Animation outToRightAnimation(){
        Animation outToRight=new  TranslateAnimation(Animation.RELATIVE_TO_PARENT,1.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f);
        return setProperties(outToRight);

    }
    private Animation inFromLeftAnimation()
    {
        Animation inFromLeft=new TranslateAnimation(Animation.RELATIVE_TO_PARENT,-1.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f);
        return setProperties(inFromLeft);
    }
    private Animation outToLeftAnimation(){
        Animation outToLeft=new  TranslateAnimation(Animation.RELATIVE_TO_PARENT,-1.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f,Animation.RELATIVE_TO_PARENT,0.0f);
        return setProperties(outToLeft);

    }
private Animation setProperties(Animation animation){
    animation.setDuration(ANIMATION_TIME);
    animation.setInterpolator(new AccelerateInterpolator());
    return animation;
}
    class MyGestureDetector extends GestureDetector.SimpleOnGestureListener
    {
        private static final int SWIPE_MIN_DISTANCE=120;
        private static final int SWIPE_MAX_OFF_PATH=250;
        private static final int SWIPE_THERSHOLD_VELOCITY=200;
        private int maxTabs;
        public MyGestureDetector()
        {
            maxTabs=tabHost.getTabContentView().getChildCount();
        }
        @Override
        public  boolean onFling(MotionEvent event1,MotionEvent event2,float velocityX,float velocityY)
        {
            int newTab=0;
            if(Math.abs(event1.getY()-event2.getY())>SWIPE_MAX_OFF_PATH){
            return false;
        }
            if (event1.getX()-event2.getY()>SWIPE_MIN_DISTANCE){
            newTab=curTab+1;
        }else if(event2.getX()-event1.getX()>SWIPE_MIN_DISTANCE&&Math.abs(velocityX)>SWIPE_THERSHOLD_VELOCITY){
            newTab=curTab-1;

        }
            if(newTab>0||newTab>(maxTabs-1))
            {
                return false;
            }
        tabHost.setCurrentTab(newTab);
            return super.onFling(event1,event2,velocityX,velocityY);
        }
            
            
    }
}
