package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9,clear,calculate;
    boolean is_empty=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button6);
        button2=findViewById(R.id.button4);
        button3=findViewById(R.id.button5);
        button4=findViewById(R.id.button);
        button5=findViewById(R.id.button7);
        button6=findViewById(R.id.button3);
        button7=findViewById(R.id.button9);
        button8=findViewById(R.id.button2);
        button9=findViewById(R.id.button8);
        button=findViewById(R.id.button10);
        clear=findViewById(R.id.button11);
        calculate=findViewById(R.id.button12);`

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("0");
                }
                else {
                    textView.setText(textView.getText()+"0");
                }
                is_empty=false;
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("1");
                }
                else {
                    textView.setText(textView.getText()+"1");
                }
                is_empty=false;

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("2");
                }
                else {
                    textView.setText(textView.getText()+"2");
                }
                is_empty=false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("3");
                }
                else {
                    textView.setText(textView.getText()+"3");
                }
                is_empty=false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("4");
                }
                else {
                    textView.setText(textView.getText()+"4");
                }
                is_empty=false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("5");
                }
                else {
                    textView.setText(textView.getText()+"5");
                }
                is_empty=false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("6");
                }
                else {
                    textView.setText(textView.getText()+"6");
                }
                is_empty=false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("7");
                }
                else {
                    textView.setText(textView.getText()+"7");
                }
                is_empty=false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("8");
                }
                else {
                    textView.setText(textView.getText()+"8");
                }
                is_empty=false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                if (is_empty){
                    textView.setText("9");
                }
                else {
                    textView.setText(textView.getText()+"9");
                }
                is_empty=false;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
               textView.setText("Enter your digits");
                is_empty=true;
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= findViewById(R.id.textView2);
                String temp = textView.getText().toString();
                int cash=Integer.parseInt(temp);


            /*    int numberOf1000= number/1000;
                int numberOf500=(number%1000)/500;
                int numberOf100=(number%500)/100;
                int numberOf50=(number%100)/50;*/
             /*   TextView counter1000= findViewById(R.id.textView6);
                counter1000.setText(cash);*/

              /*  TextView counter500= findViewById(R.id.textView7);
                counter500.setText(numberOf500);
                TextView counter100= findViewById(R.id.textView8);
                counter100.setText(numberOf100);
                TextView counter50= findViewById(R.id.textView9);
                counter50.setText(numberOf50);*/

            }
        });





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}