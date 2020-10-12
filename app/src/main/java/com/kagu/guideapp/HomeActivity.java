package com.kagu.guideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    ImageButton gameplay, heroes, modes;
    TextView item1, item2, item3, subitem1, subitem2, subitem3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ViewGroup homeLayout = (ViewGroup) findViewById(R.id.homelayout);
        final FrameLayout frameLayoutplay = (FrameLayout) homeLayout.findViewById(R.id.play);
        final FrameLayout frameLayouthero = (FrameLayout) homeLayout.findViewById(R.id.hero);
        final FrameLayout frameLayoutmode = (FrameLayout) homeLayout.findViewById(R.id.mode);
        final Button btnclickme = (Button) homeLayout.findViewById(R.id.clickme);

        btnclickme.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(homeLayout);
                visible = !visible;
                frameLayoutplay.setVisibility(visible ? View.VISIBLE : View.GONE);
                frameLayouthero.setVisibility(visible ? View.VISIBLE : View.GONE);
                frameLayoutmode.setVisibility(visible ? View.VISIBLE : View.GONE);
            }

        });

        gameplay = (ImageButton) findViewById(R.id.gameplay);
        heroes = (ImageButton) findViewById(R.id.heroes);
        modes = (ImageButton) findViewById(R.id.modes);

        item1 = (TextView) findViewById(R.id.gameplaytext);
        item2 = (TextView) findViewById(R.id.heroestext);
        item3 = (TextView) findViewById(R.id.modestext);

        subitem1 = (TextView) findViewById(R.id.gameplaytext2);
        subitem2 = (TextView) findViewById(R.id.heroestext2);
        subitem3 = (TextView) findViewById(R.id.modestext2);

        Animation gbrbtn1 = AnimationUtils.loadAnimation(HomeActivity.this, R.anim.righttoleft);
        Animation gbrbtn2 = AnimationUtils.loadAnimation(HomeActivity.this, R.anim.lefttoright);
        Animation gbrbtn3 = AnimationUtils.loadAnimation(HomeActivity.this, R.anim.righttoleft);

        gameplay.startAnimation(gbrbtn1);
        item1.startAnimation(gbrbtn1);
        subitem1.startAnimation(gbrbtn1);

        heroes.startAnimation(gbrbtn2);
        item2.startAnimation(gbrbtn2);
        subitem2.startAnimation(gbrbtn2);

        modes.startAnimation(gbrbtn3);
        item3.startAnimation(gbrbtn3);
        subitem3.startAnimation(gbrbtn3);
    }

    public void gameplaybtn(View view) {
        Intent intent = new Intent(HomeActivity.this, GameplayActivity.class);
        startActivity(intent);
    }

    public void heroesbtn(View view) {
        Intent intent = new Intent(HomeActivity.this, HeroesActivity.class);
        startActivity(intent);
    }

    public void modes(View view) {
        Intent intent = new Intent(HomeActivity.this, ModesActivity.class);
        startActivity(intent);
    }
}
