package com.kagu.guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.view.View.GONE;

public class ModesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        final ViewGroup heroLayout = (ViewGroup) findViewById(R.id.modelayout);

        final LinearLayout linearLayout1 = (LinearLayout) heroLayout.findViewById(R.id.item1judul);
        final LinearLayout linearLayout2 = (LinearLayout) heroLayout.findViewById(R.id.item2judul);
        final LinearLayout linearLayout3 = (LinearLayout) heroLayout.findViewById(R.id.item3judul);

        final Button hero1 = (Button) heroLayout.findViewById(R.id.btnmode1);
        final Button hero2 = (Button) heroLayout.findViewById(R.id.btnmode2);
        final Button hero3 = (Button) heroLayout.findViewById(R.id.btnmode3);

        //      animasi show hero
        hero1.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                linearLayout1.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout2.setVisibility(visible ? GONE:GONE);
                linearLayout3.setVisibility(visible ? GONE:GONE);
            }
        });

        //      animasi show hero
        hero2.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                linearLayout2.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout1.setVisibility(visible ? GONE:GONE);
                linearLayout3.setVisibility(visible ? GONE:GONE);
            }
        });

        //      animasi show hero
        hero3.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(heroLayout);
                visible = !visible;
                linearLayout3.setVisibility(visible ? View.VISIBLE : View.VISIBLE);
                linearLayout2.setVisibility(visible ? GONE:GONE);
                linearLayout1.setVisibility(visible ? GONE:GONE);
            }
        });
    }


    public void normalrank(View view) {
        Intent intent = new Intent(ModesActivity.this, NormalRankActivity.class);
        startActivity(intent);
    }

    public void banrank(View view) {
        Intent intent = new Intent(ModesActivity.this, BannedRankActivity.class);
        startActivity(intent);
    }

    public void altar(View view) {
        Intent intent = new Intent(ModesActivity.this, AltarActivity.class);
        startActivity(intent);
    }

    public void chaotic(View view) {
        Intent intent = new Intent(ModesActivity.this, ChaosActivity.class);
        startActivity(intent);
    }

    public void valley(View view) {
        Intent intent = new Intent(ModesActivity.this, ValleyActivity.class);
        startActivity(intent);
    }
}
