package com.example.engn.applicationintro;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Intro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("engindmr",
                "Binary Code",
                R.drawable.binarycode,
                Color.parseColor("#51e2b7")));

        addSlide(AppIntroFragment.newInstance("engindmr",
                "Computer",
                R.drawable.computer,
                Color.parseColor("#8c50e3")));

        addSlide(AppIntroFragment.newInstance("engindmr",
                "Smart Phone",
                R.drawable.smartphone,
                Color.parseColor("#4fd7ff")));

        addSlide(AppIntroFragment.newInstance("engindmr",
                "Tablet",
                R.drawable.tablet,
                Color.parseColor("#00bcd4")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));

    }

    public void onDonePressed(){
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
    public void onSkipPressed(Fragment currentFragment){
        Toast.makeText(this,"Atla",Toast.LENGTH_SHORT).show();
    }
    public void onSlideChanged(){
        Toast.makeText(this,"Slayt Değiştirildi..",Toast.LENGTH_SHORT).show();
    }
}
