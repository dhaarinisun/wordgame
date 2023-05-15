package com.example.taskgametask;

import static com.example.taskgametask.R.id;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class game extends AppCompatActivity {
EditText answer;
    private int score = 0;
    Button check;ImageButton clued;
    ImageView star1,star2,star3;
    Button reset;
    TextView t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36;
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.game);
            String ans=getIntent().getStringExtra("Word");
            String clue = getIntent().getStringExtra("Clue");
answer=
        findViewById(id.editTextTextPersonName6);
ArrayList<Character>op= new ArrayList<>();int namelength=0;
if(ans.length()!=0){
    namelength=ans.length();}

for(int i=0;i< namelength;i++){op.add(ans.charAt(i));}
Collections.shuffle(op);
String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
Random ran =new Random();
            t21=(TextView)findViewById(id.textView21);
            t22=(TextView) findViewById(id.textView22);
            t23=(TextView) findViewById(id.textView23);
            t24=(TextView) findViewById(id.textView24);
            t25=(TextView) findViewById(id.textView25);
            t26=(TextView) findViewById(id.textView26);
            t27=(TextView) findViewById(id.textView27);
            t28=(TextView) findViewById(id.textView28);
            t29=(TextView) findViewById(R.id.textView29);
            t30=(TextView) findViewById(id.textView30);
            t31=(TextView) findViewById(id.textView31);
            t32=(TextView) findViewById(id.textView32);
            t33=(TextView) findViewById(id.textView33);
            t34=(TextView) findViewById(id.textView34);
            t35=(TextView) findViewById(id.textView35);
            t36=(TextView) findViewById(id.textView36);
star1=(ImageView) findViewById(id.iv1);
star2=(ImageView) findViewById(id.iv2);
star3=(ImageView) findViewById(id.iv3);
ImageView[] del=new ImageView[3];
del[0]=star1;del[1]=star2;del[2]=star3;

            if(op.size()!=0){
                t21.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t21.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t22.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t22.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t23.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t23.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t24.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t24.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t25.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t25.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t26.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t26.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t27.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t27.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t28.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t28.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t29.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t29.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t30.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t30.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t31.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t31.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t32.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t32.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t33.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t33.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t34.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t34.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t35.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t35.setText(String.valueOf(alpha.charAt(ranchar)));}
            if(op.size()!=0){
                t36.setText(String.valueOf(op.get(0)));op.remove(0);}
            else{int ranchar=ran.nextInt(alpha.length());
                t36.setText(String.valueOf(alpha.charAt(ranchar)));}
            t21.setOnClickListener(v -> answer.append(t21.getText()));
            t22.setOnClickListener(v -> answer.append(t22.getText()));
            t23.setOnClickListener(v -> answer.append(t23.getText()));
            t24.setOnClickListener(v -> answer.append(t24.getText()));
            t25.setOnClickListener(v -> answer.append(t25.getText()));
            t26.setOnClickListener(v -> answer.append(t26.getText()));
            t27.setOnClickListener(v -> answer.append(t27.getText()));
            t28.setOnClickListener(v -> answer.append(t28.getText()));
            t29.setOnClickListener(v -> answer.append(t29.getText()));
            t30.setOnClickListener(v -> answer.append(t30.getText()));
            t31.setOnClickListener(v -> answer.append(t31.getText()));
            t32.setOnClickListener(v -> answer.append(t32.getText()));
            t33.setOnClickListener(v -> answer.append(t33.getText()));
            t34.setOnClickListener(v -> answer.append(t34.getText()));
            t35.setOnClickListener(v -> answer.append(t35.getText()));
            t36.setOnClickListener(v -> answer.append(t36.getText()));

check=(Button)findViewById(id.button);


    check.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder n=new AlertDialog.Builder(game.this);
            View dialogViewed=getLayoutInflater().inflate(R.layout.checky,null);
            n.setView(dialogViewed);
            EditText jk=dialogViewed.findViewById(R.id.et);
            AlertDialog h=n.create();
            h.show();
            if(answer.equals(getIntent().getStringExtra("Word"))){jk.setText("Your Score is 300");}
            else{jk.setText("Your Score :0");int i;for( i=0;i<3;i++){
                del[i].setVisibility(View.GONE);break;}
                if(i==3){Intent g=new Intent(game.this,MainActivity.class);

                    startActivity(g);}

            }
             Button home=dialogViewed.findViewById(R.id.button4);
             home.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent a=new Intent(game.this,MainActivity.class);
                     startActivity(a);
                 }
             });

Button playAgain=dialogViewed.findViewById(R.id.button5);
playAgain.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {h.dismiss();
    }
});


        }
    });
reset=(Button)findViewById(id.button3);
reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(game.this,game.class);
        i.putExtra("Word",ans);
        i.putExtra("Clue",clue);
        startActivity(i);
    }
});





            clued=(ImageButton) findViewById(id.imageButton3);
clued.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder=new AlertDialog.Builder(game.this);
      View dialogView=getLayoutInflater().inflate(R.layout.dialog,null);
      builder.setView(dialogView);
      TextView messageView=dialogView.findViewById(id.textView2);
      messageView.setText(clue);

      builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
              dialog.dismiss();
          }
      });AlertDialog dialog=builder.create();
        dialog.show();


    }
});

        }}

