package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        TextView textView,textView2,textView3,textView4;

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        Button btnNewActivity3 = (Button) findViewById(R.id.btnNewActivity3);
        Button btnNewActivity4 = (Button) findViewById(R.id.btnNewActivity4);
        Button btnNewActivity5 = (Button) findViewById(R.id.btnNewActivity5);
        Button btnNewActivity6 = (Button) findViewById(R.id.btnNewActivity6);
        Button btnSelf = (Button) findViewById(R.id.btnSelf);
        Button btnName = (Button) findViewById(R.id.btnName);
        Button btnNum = (Button) findViewById(R.id.btnNum);
        Button btnMajor = (Button) findViewById(R.id.btnMajor);
        Button btnSchool = (Button) findViewById(R.id.btnSchool);
        Switch switchShow = (Switch)findViewById(R.id.switchShow);
        textView = (TextView) findViewById(R.id.textview);
        textView2 = (TextView) findViewById(R.id.textview2);
        textView3 = (TextView) findViewById(R.id.textview3);
        ImageView imageView1 = (ImageView) findViewById(R.id.h);


        switchShow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (switchShow.isChecked() == true) {
                    btnSchool.setVisibility(View.VISIBLE);
                    btnName.setVisibility(View.VISIBLE);
                    btnMajor.setVisibility(View.VISIBLE);
                    btnNum.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    imageView1.setVisibility(View.VISIBLE);

                } else {
                    btnSchool.setVisibility(View.GONE);
                    btnName.setVisibility(View.GONE);
                    btnMajor.setVisibility(View.GONE);
                    btnNum.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);
                    imageView1.setVisibility(View.GONE);
                }
            }
        });

        btnName.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText("이준범");
            }
        });

        btnSchool.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.h);
                Toast.makeText(getApplicationContext(), "한림대학교", Toast.LENGTH_SHORT).show();
            }
        });

        btnMajor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView2.setText("빅데이터");
            }
        });

        btnNum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView3.setText("20195286");
            }
        });

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        btnNewActivity3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent3 = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent3);
            }
        });

        btnNewActivity4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent4 = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(intent4);
            }
        });

        btnNewActivity5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent5 = new Intent(getApplicationContext(), FifthActivity.class);
                startActivity(intent5);
            }
        });

        btnNewActivity6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent6 = new Intent(getApplicationContext(), SixthActivity.class);
                startActivity(intent6);
            }
        });
    }

}