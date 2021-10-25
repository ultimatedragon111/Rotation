package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private LinearLayout cardView1;
    private LinearLayout cardView2;
    private LinearLayout cardView3;
    private LinearLayout cardView4;
    private LinearLayout cardView5;
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;


    private int image1 = 0;
    private int image2 = 0;
    private int image3 = 0;
    private int image4 = 0;
    private int image5 = 0;

    ObjectAnimator objectAnimator1;
    ObjectAnimator objectAnimator2;
    ObjectAnimator objectAnimator3;
    ObjectAnimator objectAnimator4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);
        cardView5 = findViewById(R.id.cardView5);
        bt2 = findViewById(R.id.bt2);
        bt1 = findViewById(R.id.bt1);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image1 == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView1, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView1, "alpha", 1f, 0.2f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView1, "RotationY", 180f, 360f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView1, "alpha", 0f, 1f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt1.setEnabled(true);
                    image1++;
                }else{
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView1, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView1, "alpha", 0.2f, 1f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView1, "RotationY", 360f, 180f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView1, "alpha", 1f, 0f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt1.setEnabled(false);
                    image1--;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1,objectAnimator2,objectAnimator3,objectAnimator4);
                animatorSet.start();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image2 == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView2, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView2, "alpha", 1f, 0.2f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView2, "RotationY", 180f, 360f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView2, "alpha", 0f, 1f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt2.setEnabled(true);
                    image2++;
                }else{
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView2, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView2, "alpha", 0.2f, 1f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView2, "RotationY", 360f, 180f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView2, "alpha", 1f, 0f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt2.setEnabled(false);
                    image2--;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1,objectAnimator2,objectAnimator3,objectAnimator4);
                animatorSet.start();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image3 == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView3, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView3, "alpha", 1f, 0.2f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView3, "RotationY", 180f, 360f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView3, "alpha", 0f, 1f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt3.setEnabled(true);
                    image3++;
                }else{
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView3, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView3, "alpha", 0.2f, 1f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView3, "RotationY", 360f, 180f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView3, "alpha", 1f, 0f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt3.setEnabled(false);
                    image3--;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1,objectAnimator2,objectAnimator3,objectAnimator4);
                animatorSet.start();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image4 == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView4, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView4, "alpha", 1f, 0.2f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView4, "RotationY", 180f, 360f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView4, "alpha", 0f, 1f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt4.setEnabled(true);
                    image4++;
                }else{
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView4, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView4, "alpha", 0.2f, 1f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView4, "RotationY", 360f, 180f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView4, "alpha", 1f, 0f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt4.setEnabled(false);
                    image4--;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1,objectAnimator2,objectAnimator3,objectAnimator4);
                animatorSet.start();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(image5 == 0) {
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView5, "RotationY", 0f, 180f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView5, "alpha", 1f, 0.2f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView5, "RotationY", 180f, 360f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView5, "alpha", 0f, 1f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt5.setEnabled(true);
                    image5++;
                }else{
                    objectAnimator1 = ObjectAnimator.ofFloat(imageView5, "RotationY", 180f, 0f);
                    objectAnimator1.setDuration(1000);
                    objectAnimator2 = ObjectAnimator.ofFloat(imageView5, "alpha", 0.2f, 1f);
                    objectAnimator2.setStartDelay(500);
                    objectAnimator3 = ObjectAnimator.ofFloat(cardView5, "RotationY", 360f, 180f);
                    objectAnimator3.setDuration(1000);
                    objectAnimator4 = ObjectAnimator.ofFloat(cardView5, "alpha", 1f, 0f);
                    objectAnimator4.setStartDelay(500);
                    objectAnimator4.setDuration(1);
                    bt5.setEnabled(false);
                    image5--;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimator1,objectAnimator2,objectAnimator3,objectAnimator4);
                animatorSet.start();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Reserva.class);
                startActivity(a);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Reserva.class);
                startActivity(a);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Reserva.class);
                startActivity(a);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Reserva.class);
                startActivity(a);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Reserva.class);
                startActivity(a);
            }
        });


    }
}