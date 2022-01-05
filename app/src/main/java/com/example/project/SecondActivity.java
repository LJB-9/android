package com.example.project;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        setTitle("현재 상영중인 영화");

        Integer[] posterId = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9 };

        // 영화제목을 문자 배열로 초기화
        String[] movie = {"이터널스","유체이탈자","듄","연애 빠진 로맨스","엔칸토:마법의 세계","고스트버스터즈 라이즈","태일이","라스트 나잇 인 소호","스파이더맨: 노 웨이 홈"};
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, movie);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ImageView imageView = (ImageView)findViewById(R.id.imageView);
                imageView.setImageResource(posterId[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        Button btnReturn = (Button) findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();  // 메인 화면으로 돌아감
            }
        });
    }
}


