package com.example.gamecenter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gamecenter.DB.DB_Handle;
import com.example.gamecenter.DB.Game;
import com.example.gamecenter.DB.ScoreGame;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        openGame();

    }

    public void openGame(){
        final ImageView ticTacToe = (ImageView) findViewById(R.id.game_tictactoe);
        final ImageView flipCard = (ImageView) findViewById(R.id.game_flipcard);
        final ImageView TwoZeroFourEight = (ImageView) findViewById(R.id.game_2048);

        flipCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(MainActivity.this, FlipCardMemory_Menu.class);
                    startActivity(i);
                }catch (Exception e ){

                }
            }
        });

        ticTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i = new Intent(MainActivity.this, TicTacToe_AddPlayer.class);
                    startActivity(i);
                }catch (Exception e ){
                    e.printStackTrace();
                }
            }
        });
    }
}