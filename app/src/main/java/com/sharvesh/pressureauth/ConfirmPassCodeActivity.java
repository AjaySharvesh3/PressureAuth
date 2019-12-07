package com.sharvesh.pressureauth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConfirmPassCodeActivity extends AppCompatActivity {

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button clearButton;

    private Button confirmCodeButton;
    private int count = 0;
    private int countAttempts = 3;

    private EditText textOne;
    private EditText texttwo;
    private StringBuilder pressureValue;
    private StringBuilder actualValue;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pass_code);

        pressureValue = new StringBuilder();
        actualValue = new StringBuilder();

        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        clearButton = findViewById(R.id.buttonClear);

        confirmCodeButton = findViewById(R.id.confirmCodeButton);

        textOne = findViewById(R.id.valueOne);
        texttwo = findViewById(R.id.valueTwo);

        final long[] lastDown = new long[1];
        final long[] keyPressedDuration = new long[1];

        buttonOne.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("1"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("1"));
                    }
                }
                return true;
            }
        });

        buttonTwo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("2"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("2"));
                    }
                }
                return true;
            }
        });

        buttonThree.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("3"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("3"));
                    }
                }
                return true;
            }
        });

        buttonFour.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("4"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("4"));
                    }
                }
                return true;
            }
        });

        buttonFive.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("5"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("5"));
                    }
                }
                return true;
            }
        });

        buttonSix.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("6"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("6"));
                    }
                }
                return true;
            }
        });

        buttonSeven.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("7"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("7"));
                    }
                }
                return true;
            }
        });

        buttonEight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("8"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("8"));
                    }
                }
                return true;
            }
        });

        buttonNine.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    lastDown[0] = System.currentTimeMillis();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    keyPressedDuration[0] = System.currentTimeMillis() - lastDown[0];
                    if (keyPressedDuration[0] < 200) {
                        textOne.setText(pressureValue.append("1"));
                        texttwo.setText(actualValue.append("9"));
                    } else if (keyPressedDuration[0] > 200){
                        textOne.setText(pressureValue.append("2"));
                        texttwo.setText(actualValue.append("9"));
                    }
                }
                return true;
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = actualValue.length();
                try {
                    String actualValue1 = actualValue.substring(0, length-1);
                    actualValue.replace(0, length, actualValue1);
                    texttwo.setText(actualValue);

                    String pressureValue1 = pressureValue.substring(0, length-1);
                    pressureValue.replace(0, length, pressureValue1);
                    textOne.setText(pressureValue);
                } catch (StringIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        });


        confirmCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = getIntent().getExtras();
                assert bundle != null;
                String actualData = bundle.getString("Actual Value");
                String pressureData = bundle.getString("PassCode Value");
                if (actualData.equals(actualValue.toString()) && pressureData.equals(pressureValue.toString())) {
                    Toast.makeText(ConfirmPassCodeActivity.this, "Code Matched Successfully", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(ConfirmPassCodeActivity.this, AuthSuccessActivity.class);
                    startActivity(i);
                } else {
                    // Toast.makeText(ConfirmPassCodeActivity.this, actualValue.toString() + " + " + pressureValue.toString(), Toast.LENGTH_LONG).show();
                    count += 1;
                    countAttempts--;
                    Toast.makeText(ConfirmPassCodeActivity.this, "Code Match Failed. You have " + countAttempts + ".", Toast.LENGTH_LONG).show();
                    if(count > 3) {
                        Intent i = new Intent(ConfirmPassCodeActivity.this, MainActivity.class);
                        startActivity(i);
                        count = 0;
                        countAttempts = 3;
                    }
                }
            }
        });
    }
}
