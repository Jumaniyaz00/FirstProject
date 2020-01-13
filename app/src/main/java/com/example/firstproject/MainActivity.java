package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button zero, first, five, four, six, two, tree, eight, seven, nine, skop, percent, clin, division,
            minus, umnajenie, plus, vergul, ravno, plusandminus;
    TextView showText;
    float mValueOne, mValueTwo;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.zero);
        first = findViewById(R.id.first);
        five = findViewById(R.id.five);
        four = findViewById(R.id.four);
        six = findViewById(R.id.six);
        two = findViewById(R.id.two);
        tree = findViewById(R.id.tree);
        eight = findViewById(R.id.eight);
        seven = findViewById(R.id.seven);
        nine = findViewById(R.id.nine);
        skop = findViewById(R.id.skop);
        percent = findViewById(R.id.percent);
        clin = findViewById(R.id.clin);
        division = findViewById(R.id.division);
        minus = findViewById(R.id.minus);
        umnajenie = findViewById(R.id.umnajenie);
        showText = findViewById(R.id.show_text);
        ravno=findViewById(R.id.ravno);
        plus=findViewById(R.id.plus);
        vergul=findViewById(R.id.vergul);
        plusandminus=findViewById(R.id.plusandminus);
        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "0");
            }
        });
        first.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("setTx")
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "2");
            }
        });
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "9");
            }
        });
        clin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText("");
            }
        });
        skop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "( )");
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "%");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(showText.getText() + "");
                crunchifyDivision = true;
                showText.setText(null);
            }
        });
        umnajenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(showText.getText() + "");
                crunchifyMultiplication = true;
                showText.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(showText.getText() + "");
                mSubtract = true;
                showText.setText(null);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showText == null) {
                    showText.setText("");
                } else {
                    mValueOne = Float.parseFloat(showText.getText() + "");
                    crunchifyAddition = true;
                    showText.setText(null);
                }
            }
        });


        ravno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(showText.getText() + "");

                if (crunchifyAddition == true) {
                    showText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    showText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    showText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    showText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });
        vergul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + ",");
            }
        });
        plusandminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText(showText.getText().toString() + "-");
            }
        });
    }
}

