package com.sometning.zeesh.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.sometning.zeesh.dashboard.Fragments.FiveFragment;
import com.sometning.zeesh.dashboard.Fragments.FourFragment;
import com.sometning.zeesh.dashboard.Fragments.OneFragment;
import com.sometning.zeesh.dashboard.Fragments.ThreeFragment;
import com.sometning.zeesh.dashboard.Fragments.TwoFragment;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    CardView cardView;
    ImageView one , two , three, four , five;
    FrameLayout replaceCntainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.cardView);
        cardView.setBackgroundResource(R.drawable.bg);
        replaceCntainer = findViewById(R.id.replaceContainer);
        getSupportFragmentManager().beginTransaction().replace(replaceCntainer.getId() , new OneFragment()).commit();


        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Fragment selectedFragment = null;
        int id = view.getId();

        switch (id)
        {
            case R.id.one:
                selectedFragment = new OneFragment();
                one.setBackgroundResource(R.drawable.iconbg);
                two.setBackground(null);
                three.setBackground(null);
                four.setBackground(null);
                five.setBackground(null);

                break;
            case R.id.two:
                selectedFragment = new TwoFragment();
                two.setBackgroundResource(R.drawable.iconbg);
                one.setBackground(null);
                three.setBackground(null);
                four.setBackground(null);
                five.setBackground(null);
                break;
            case R.id.three:
                selectedFragment = new ThreeFragment();
                three.setBackgroundResource(R.drawable.iconbg);
                two.setBackground(null);
                one.setBackground(null);
                four.setBackground(null);
                five.setBackground(null);
                break;
            case R.id.four:
                selectedFragment = new FourFragment();
                four.setBackgroundResource(R.drawable.iconbg);
                two.setBackground(null);
                three.setBackground(null);
                one.setBackground(null);
                five.setBackground(null);
                break;
            case R.id.five:
                selectedFragment = new FiveFragment();
                five.setBackgroundResource(R.drawable.iconbg);
                two.setBackground(null);
                three.setBackground(null);
                four.setBackground(null);
                one.setBackground(null);
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(replaceCntainer.getId() , selectedFragment).commit();
    }
}
