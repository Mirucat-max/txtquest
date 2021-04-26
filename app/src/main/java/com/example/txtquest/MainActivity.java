package com.example.txtquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    TextView info = findViewById(R.id.triggers);
    TextView playerInfo = findViewById(R.id.player);

    TextView warning = findViewById(R.id.warning);
    static class leshiy{
        int hp = 200;
        int damage = 20;
        int money = 140;
    }
    static class garpy{
        int hp = 160;
        int damage = 32;
        int money = 200;
    }
    static class wildDog{
        int hp = 80;
        int damage = 35;
        int money = 80;
    }
    static class wolf{
        int hp = 100;
        int damage = 25;
        int money = 50;
    }
    static class snake{
        int hp = 20;
        int damage = 6;
        int money = 20;
    }
    static class mouse{
        int hp = 8;
        int damage = 1;
        int money = 3;
    }
    static class bear{
        int hp = 120;
        int damage = 60;
        int money = 140;
    }
    static class player{
        int hp = 10;
        int lvl = 1;
        int damage = 1;
        int money = 0;
        int[] inventory;
        boolean attack = false;
        int[] vs;
        int idLocation = 0;
    }
    String InfoPlayerString;
    player MainPlayer = new player();

    @SuppressLint("SetTextI18n")
    public void Wild(View view){
        if(MainPlayer.attack) {warning.setText("Вы не можете передвигаться, когда атакованы"); return;}
        int a = (int) (Math.random() * 101);
        if(a <= 30){
            int b = (int) (Math.random() * 3);
            if(b == 1){
                mouse Micky = new mouse();
                MainPlayer.attack = true;
                MainPlayer.vs[0] = Micky.hp + (int)(Math.random() * MainPlayer.lvl);
                MainPlayer.vs[1] = Micky.damage+ (int)(Math.random() * MainPlayer.lvl);
                MainPlayer.vs[2] = Micky.money+ (int)(Math.random() * MainPlayer.lvl);
                warning.setText("Вас атаковала Мышь");
                info.setText("Вы не можете передвигаться, так как вас атаковали. У вашего врага "+String.valueOf(MainPlayer.vs[0])+" хп и "+String.valueOf(MainPlayer.vs[0])+" урона");
            }
            if(b == 2){
                snake Snaker = new snake();
                MainPlayer.attack = true;
                MainPlayer.vs[0] = Snaker.hp + (int)(Math.random() * MainPlayer.lvl);
                MainPlayer.vs[1] = Snaker.damage + (int)(Math.random() * MainPlayer.lvl);
                MainPlayer.vs[2] = Snaker.money + (int)(Math.random() * MainPlayer.lvl);
                warning.setText("Вас атаковала Змея");
                info.setText("Вы не можете передвигаться, так как вас атаковали. У вашего врага "+String.valueOf(MainPlayer.vs[0])+" хп и "+String.valueOf(MainPlayer.vs[0])+" урона");
            }
        }
        else {
            info.setText("Вы прошли без проишествий и заметили блеск на земле. +1 монета");
            MainPlayer.money+=1;
        }
    }


}