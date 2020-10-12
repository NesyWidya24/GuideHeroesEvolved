package com.kagu.guideapp;

import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.View.GONE;

public class HeroesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

//        deklarasi layout
        final ViewGroup heroLayout = (ViewGroup) findViewById(R.id.herolayout);

        final LinearLayout linearLayout1 = (LinearLayout) heroLayout.findViewById(R.id.line1);
        final TextView linearLayout12 = (TextView) heroLayout.findViewById(R.id.txtstr);
        final LinearLayout linearLayout2 = (LinearLayout) heroLayout.findViewById(R.id.line2);
        final TextView linearLayout22 = (TextView) heroLayout.findViewById(R.id.txtagi);
        final LinearLayout linearLayout3 = (LinearLayout) heroLayout.findViewById(R.id.line3);
        final TextView linearLayout33 = (TextView) heroLayout.findViewById(R.id.txtint);

        final ImageButton heroes1 = (ImageButton) heroLayout.findViewById(R.id.hero1);
        final TextView judul1 = (TextView) heroLayout.findViewById(R.id.judul1);

        final ImageButton heroes2 = (ImageButton) heroLayout.findViewById(R.id.hero2);
        final TextView judul2 = (TextView) heroLayout.findViewById(R.id.judul2);

        final ImageButton heroes3 = (ImageButton) heroLayout.findViewById(R.id.hero3);
        final TextView judul3 = (TextView) heroLayout.findViewById(R.id.judul3);

        final ImageButton heroes4 = (ImageButton) heroLayout.findViewById(R.id.hero4);
        final TextView judul4 = (TextView) heroLayout.findViewById(R.id.judul4);

        final ImageButton heroes5 = (ImageButton) heroLayout.findViewById(R.id.hero5);
        final TextView judul5 = (TextView) heroLayout.findViewById(R.id.judul5);

        final ImageButton heroes6 = (ImageButton) heroLayout.findViewById(R.id.hero6);
        final TextView judul6 = (TextView) heroLayout.findViewById(R.id.judul6);

        final LinearLayout text1 = (LinearLayout) heroLayout.findViewById(R.id.text1);
        final LinearLayout text2 = (LinearLayout) heroLayout.findViewById(R.id.text2);
        final LinearLayout text3 = (LinearLayout) heroLayout.findViewById(R.id.text3);
        final LinearLayout text4 = (LinearLayout) heroLayout.findViewById(R.id.text4);
        final LinearLayout text5 = (LinearLayout) heroLayout.findViewById(R.id.text5);
        final LinearLayout text6 = (LinearLayout) heroLayout.findViewById(R.id.text6);


        final Button hero1 = (Button) heroLayout.findViewById(R.id.btnhero1);
        final Button hero2 = (Button) heroLayout.findViewById(R.id.btnhero2);
        final Button hero3 = (Button) heroLayout.findViewById(R.id.btnhero3);

//        animasi detail hero Bonnie
        heroes1.setOnClickListener(new View.OnClickListener() {
            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                text1.setVisibility(visible ? View.VISIBLE : GONE);
                heroes2.setVisibility(visible ? GONE:View.VISIBLE);
                judul2.setVisibility(visible ? GONE:View.VISIBLE);

            }
        });

        //        animasi detail hero Burninator
        heroes2.setOnClickListener(new View.OnClickListener() {
            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                text2.setVisibility(visible ? View.VISIBLE : GONE);
                heroes1.setVisibility(visible ? GONE:View.VISIBLE);
                judul1.setVisibility(visible ? GONE:View.VISIBLE);

            }
        });

        //        animasi detail hero mikio
        heroes3.setOnClickListener(new View.OnClickListener() {
            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                text3.setVisibility(visible ? View.VISIBLE : GONE);
                heroes4.setVisibility(visible ? GONE:View.VISIBLE);
                judul4.setVisibility(visible ? GONE:View.VISIBLE);

            }
        });

        //        animasi detail hero lapina
        heroes4.setOnClickListener(new View.OnClickListener() {
            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                text4.setVisibility(visible ? View.VISIBLE : GONE);
                heroes3.setVisibility(visible ? GONE:View.VISIBLE);
                judul3.setVisibility(visible ? GONE:View.VISIBLE);

            }
        });

        //        animasi detail hero posei
        heroes5.setOnClickListener(new View.OnClickListener() {
            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                text5.setVisibility(visible ? View.VISIBLE : GONE);
                heroes6.setVisibility(visible ? GONE:View.VISIBLE);
                judul6.setVisibility(visible ? GONE:View.VISIBLE);

            }
        });

        //        animasi detail hero una
        heroes6.setOnClickListener(new View.OnClickListener() {
            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                text6.setVisibility(visible ? View.VISIBLE : GONE);
                heroes5.setVisibility(visible ? GONE:View.VISIBLE);
                judul5.setVisibility(visible ? GONE:View.VISIBLE);

            }
        });

//      animasi show hero
        hero1.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                linearLayout1.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout12.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout2.setVisibility(visible ? GONE:GONE);
                linearLayout22.setVisibility(visible ? GONE:GONE);
                linearLayout3.setVisibility(visible ? GONE:GONE);
                linearLayout33.setVisibility(visible ? GONE:GONE);
                text1.setVisibility(visible ? GONE:GONE);
                text2.setVisibility(visible ? GONE:GONE);
                text3.setVisibility(visible ? GONE:GONE);
                text4.setVisibility(visible ? GONE:GONE);
                text5.setVisibility(visible ? GONE:GONE);
                text6.setVisibility(visible ? GONE:GONE);
            }
        });

//        animasi show hero
        hero2.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                linearLayout2.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout22.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout1.setVisibility(visible ? GONE:GONE);
                linearLayout12.setVisibility(visible ? GONE:GONE);
                linearLayout3.setVisibility(visible ? GONE:GONE);
                linearLayout33.setVisibility(visible ? GONE:GONE);
                text1.setVisibility(visible ? GONE:GONE);
                text2.setVisibility(visible ? GONE:GONE);
                text3.setVisibility(visible ? GONE:GONE);
                text4.setVisibility(visible ? GONE:GONE);
                text5.setVisibility(visible ? GONE:GONE);
                text6.setVisibility(visible ? GONE:GONE);
            }
        });

//        animasi show hero
        hero3.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                linearLayout3.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout33.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout2.setVisibility(visible ? GONE: GONE);
                linearLayout22.setVisibility(visible ? GONE: GONE);
                linearLayout1.setVisibility(visible ? GONE: GONE);
                linearLayout12.setVisibility(visible ? GONE: GONE);
                text1.setVisibility(visible ? GONE:GONE);
                text2.setVisibility(visible ? GONE:GONE);
                text3.setVisibility(visible ? GONE:GONE);
                text4.setVisibility(visible ? GONE:GONE);
                text5.setVisibility(visible ? GONE:GONE);
                text6.setVisibility(visible ? GONE:GONE);
            }
        });
    }
}
