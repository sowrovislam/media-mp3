package com.example.myplear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton button,button1;

    CardView cardView;
    ImageView play;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        cardView=findViewById(R.id.cardmedia);
        play=findViewById(R.id.play);



        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (play.getTag()!=null&&play.getTag().toString().contains("NOT_Playing")){

                    if (mediaPlayer!=null) mediaPlayer.release();
                    mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.waz);
                    mediaPlayer.start();
                    play.setImageResource(R.drawable.baseline_adjust_24);
                    play.setTag("PLAYING");




                }else {


                    if (mediaPlayer!=null)mediaPlayer.release();
                    play.setImageResource(R.drawable.baseline_play_circle_24);
                    play.setTag("NOT_Playing");


                }





            }
        });



     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             startActivity(new Intent(MainActivity.this,MainActivity2.class));


         }
     });








    }
}