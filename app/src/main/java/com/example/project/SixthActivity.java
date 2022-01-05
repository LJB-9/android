package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth);
        setTitle("영화 선호도 투표");

        final int voteCount[] = new int[9];    

        for (int i = 0; i < 9; i++)
            voteCount[i] = 0;
        
        ImageView image[] = new ImageView[9];
        
        Integer imageId[] = { R.id.iv1, R.id.iv2, R.id.iv3, R.id.iv4, R.id.iv5,
                R.id.iv6, R.id.iv7, R.id.iv8, R.id.iv9 };
        
        final String imgName[] = { "이터널스", "유체이탈자", "듄",
                "연애 빠진 로맨스", "엔칸토: 마법의 세계", "고스트버스터즈 라이즈", "태일이", "라스트 나잇 인 소호",
                "스파이더맨: 노 웨이 홈" };

        for (int i = 0; i < imageId.length; i++) {
            final int index; 
            index = i;                                                  
            image[index] = (ImageView) findViewById(imageId[index]);

            image[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    voteCount[index]++;
                    Toast.makeText(getApplicationContext(),
                            imgName[index] + ": 총 " + voteCount[index] + " 표",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

        Button btnFinish = (Button) findViewById(R.id.btnResult);
        Button btnReturn = (Button) findViewById(R.id.btnReturn);

        btnFinish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SixthActivity.this, ResultActivity.class);
                intent.putExtra("VoteCount", voteCount);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}