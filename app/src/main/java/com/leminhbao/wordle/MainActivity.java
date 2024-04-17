package com.leminhbao.wordle;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFullScreen();

        // Inherit views
        inheritViews();

        // Set the word to guess
        wordToGuess = "ASKEW";
    }

    private void setFullScreen(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().setDecorFitsSystemWindows(false);
            WindowInsetsController controller = getWindow().getInsetsController();
            if(controller != null) {
                controller.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                controller.setSystemBarsBehavior(WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
            }
        }
        else {
            // no inspection deprecation
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_IMMERSIVE
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        }
    }

    private void inheritViews(){
        // Layouts
        layoutFirstTry = findViewById(R.id.firstTry);
        layoutSecondTry = findViewById(R.id.secondTry);
        layoutThirdTry = findViewById(R.id.thirdTry);
        layoutFourthTry = findViewById(R.id.fourthTry);
        layoutFifthTry = findViewById(R.id.fifthTry);
        layoutSixthTry = findViewById(R.id.sixthTry);

        // First Try
        firstTry_Letter01 = findViewById(R.id.firstTry_Letter01);
        firstTry_Letter02 = findViewById(R.id.firstTry_Letter02);
        firstTry_Letter03 = findViewById(R.id.firstTry_Letter03);
        firstTry_Letter04 = findViewById(R.id.firstTry_Letter04);
        firstTry_Letter05 = findViewById(R.id.firstTry_Letter05);

        // Second Try
        secondTry_Letter01 = findViewById(R.id.secondTry_Letter01);
        secondTry_Letter02 = findViewById(R.id.secondTry_Letter02);
        secondTry_Letter03 = findViewById(R.id.secondTry_Letter03);
        secondTry_Letter04 = findViewById(R.id.secondTry_Letter04);
        secondTry_Letter05 = findViewById(R.id.secondTry_Letter05);

        // Third Try
        thirdTry_Letter01 = findViewById(R.id.thirdTry_Letter01);
        thirdTry_Letter02 = findViewById(R.id.thirdTry_Letter02);
        thirdTry_Letter03 = findViewById(R.id.thirdTry_Letter03);
        thirdTry_Letter04 = findViewById(R.id.thirdTry_Letter04);
        thirdTry_Letter05 = findViewById(R.id.thirdTry_Letter05);

        // Fourth Try
        fourthTry_Letter01 = findViewById(R.id.fourthTry_Letter01);
        fourthTry_Letter02 = findViewById(R.id.fourthTry_Letter02);
        fourthTry_Letter03 = findViewById(R.id.fourthTry_Letter03);
        fourthTry_Letter04 = findViewById(R.id.fourthTry_Letter04);
        fourthTry_Letter05 = findViewById(R.id.fourthTry_Letter05);

        // Fifth Try
        fifthTry_Letter01 = findViewById(R.id.fifthTry_Letter01);
        fifthTry_Letter02 = findViewById(R.id.fifthTry_Letter02);
        fifthTry_Letter03 = findViewById(R.id.fifthTry_Letter03);
        fifthTry_Letter04 = findViewById(R.id.fifthTry_Letter04);
        fifthTry_Letter05 = findViewById(R.id.fifthTry_Letter05);

        // Sixth Try
        sixthTry_Letter01 = findViewById(R.id.sixthTry_Letter01);
        sixthTry_Letter02 = findViewById(R.id.sixthTry_Letter02);
        sixthTry_Letter03 = findViewById(R.id.sixthTry_Letter03);
        sixthTry_Letter04 = findViewById(R.id.sixthTry_Letter04);
        sixthTry_Letter05 = findViewById(R.id.sixthTry_Letter05);

        // Buttons
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnE = findViewById(R.id.btnE);
        btnF = findViewById(R.id.btnF);
        btnG = findViewById(R.id.btnG);
        btnH = findViewById(R.id.btnH);
        btnI = findViewById(R.id.btnI);
        btnJ = findViewById(R.id.btnJ);
        btnK = findViewById(R.id.btnK);
        btnL = findViewById(R.id.btnL);
        btnM = findViewById(R.id.btnM);
        btnN = findViewById(R.id.btnN);
        btnO = findViewById(R.id.btnO);
        btnP = findViewById(R.id.btnP);
        btnQ = findViewById(R.id.btnQ);
        btnR = findViewById(R.id.btnR);
        btnS = findViewById(R.id.btnS);
        btnT = findViewById(R.id.btnT);
        btnU = findViewById(R.id.btnU);
        btnV = findViewById(R.id.btnV);
        btnW = findViewById(R.id.btnW);
        btnX = findViewById(R.id.btnX);
        btnY = findViewById(R.id.btnY);
        btnZ = findViewById(R.id.btnZ);

        btnEnter = findViewById(R.id.btnEnter);
        btnDelete = findViewById(R.id.btnDelete);

        // Set onClickListener
        btnA.setOnClickListener(v -> {
            setText("A", numberOfTry, currentCarret);
        });

        btnB.setOnClickListener(v -> {
            setText("B", numberOfTry, currentCarret);
        });

        btnC.setOnClickListener(v -> {
            setText("C", numberOfTry, currentCarret);
        });

        btnD.setOnClickListener(v -> {
            setText("D", numberOfTry, currentCarret);
        });

        btnE.setOnClickListener(v -> {
            setText("E", numberOfTry, currentCarret);
        });

        btnF.setOnClickListener(v -> {
            setText("F", numberOfTry, currentCarret);
        });

        btnG.setOnClickListener(v -> {
            setText("G", numberOfTry, currentCarret);
        });

        btnH.setOnClickListener(v -> {
            setText("H", numberOfTry, currentCarret);
        });

        btnI.setOnClickListener(v -> {
            setText("I", numberOfTry, currentCarret);
        });

        btnJ.setOnClickListener(v -> {
            setText("J", numberOfTry, currentCarret);
        });

        btnK.setOnClickListener(v -> {
            setText("K", numberOfTry, currentCarret);
        });

        btnL.setOnClickListener(v -> {
            setText("L", numberOfTry, currentCarret);
        });

        btnM.setOnClickListener(v -> {
            setText("M", numberOfTry, currentCarret);
        });

        btnN.setOnClickListener(v -> {
            setText("N", numberOfTry, currentCarret);
        });

        btnO.setOnClickListener(v -> {
            setText("O", numberOfTry, currentCarret);
        });

        btnP.setOnClickListener(v -> {
            setText("P", numberOfTry, currentCarret);
        });

        btnQ.setOnClickListener(v -> {
            setText("Q", numberOfTry, currentCarret);
        });

        btnR.setOnClickListener(v -> {
            setText("R", numberOfTry, currentCarret);
        });

        btnS.setOnClickListener(v -> {
            setText("S", numberOfTry, currentCarret);
        });

        btnT.setOnClickListener(v -> {
            setText("T", numberOfTry, currentCarret);
        });

        btnU.setOnClickListener(v -> {
            setText("U", numberOfTry, currentCarret);
        });

        btnV.setOnClickListener(v -> {
            setText("V", numberOfTry, currentCarret);
        });

        btnW.setOnClickListener(v -> {
            setText("W", numberOfTry, currentCarret);
        });

        btnX.setOnClickListener(v -> {
            setText("X", numberOfTry, currentCarret);
        });

        btnY.setOnClickListener(v -> {
            setText("Y", numberOfTry, currentCarret);
        });

        btnZ.setOnClickListener(v -> {
            setText("Z", numberOfTry, currentCarret);
        });

        btnEnter.setOnClickListener(v -> {
            checkResult();
        });

        btnDelete.setOnClickListener(v -> {
            deleteLetter();
        });
    }

    private void deleteLetter() {
        switch (currentCarret) {
            case 1:
                switch (numberOfTry) {
                    case 0:
                        firstTry_Letter01.setText("");
                        break;
                    case 1:
                        secondTry_Letter01.setText("");
                        break;
                    case 2:
                        thirdTry_Letter01.setText("");
                        break;
                    case 3:
                        fourthTry_Letter01.setText("");
                        break;
                    case 4:
                        fifthTry_Letter01.setText("");
                        break;
                    case 5:
                        sixthTry_Letter01.setText("");
                        break;
                }
                break;
            case 2:
                switch (numberOfTry) {
                    case 0:
                        firstTry_Letter02.setText("");
                        break;
                    case 1:
                        secondTry_Letter02.setText("");
                        break;
                    case 2:
                        thirdTry_Letter02.setText("");
                        break;
                    case 3:
                        fourthTry_Letter02.setText("");
                        break;
                    case 4:
                        fifthTry_Letter02.setText("");
                        break;
                    case 5:
                        sixthTry_Letter02.setText("");
                        break;
                }
                break;
            case 3:
                switch (numberOfTry) {
                    case 0:
                        firstTry_Letter03.setText("");
                        break;
                    case 1:
                        secondTry_Letter03.setText("");
                        break;
                    case 2:
                        thirdTry_Letter03.setText("");
                        break;
                    case 3:
                        fourthTry_Letter03.setText("");
                        break;
                    case 4:
                        fifthTry_Letter03.setText("");
                        break;
                    case 5:
                        sixthTry_Letter03.setText("");
                        break;
                }
                break;
            case 4:
                switch (numberOfTry) {
                    case 0:
                        firstTry_Letter04.setText("");
                        break;
                    case 1:
                        secondTry_Letter04.setText("");
                        break;
                    case 2:
                        thirdTry_Letter04.setText("");
                        break;
                    case 3:
                        fourthTry_Letter04.setText("");
                        break;
                    case 4:
                        fifthTry_Letter04.setText("");
                        break;
                    case 5:
                        sixthTry_Letter04.setText("");
                        break;
                }
                break;
            case 5:
                switch (numberOfTry) {
                    case 0:
                        firstTry_Letter05.setText("");
                        break;
                    case 1:
                        secondTry_Letter05.setText("");
                        break;
                    case 2:
                        thirdTry_Letter05.setText("");
                        break;
                    case 3:
                        fourthTry_Letter05.setText("");
                        break;
                    case 4:
                        fifthTry_Letter05.setText("");
                        break;
                    case 5:
                        sixthTry_Letter05.setText("");
                        break;
                }
                break;
        }

        if (currentCarret <= 0) return;

        currentCarret--;
    }

    private void setText(String letter, int numberOfTry, int currentCarret){
        switch (numberOfTry) {
            case 0:
                switch (currentCarret) {
                    case 0:
                        firstTry_Letter01.setText(letter);
                        break;
                    case 1:
                        firstTry_Letter02.setText(letter);
                        break;
                    case 2:
                        firstTry_Letter03.setText(letter);
                        break;
                    case 3:
                        firstTry_Letter04.setText(letter);
                        break;
                    case 4:
                        firstTry_Letter05.setText(letter);
                        break;
                }
                break;
            case 1:
                switch (currentCarret) {
                    case 0:
                        secondTry_Letter01.setText(letter);
                        break;
                    case 1:
                        secondTry_Letter02.setText(letter);
                        break;
                    case 2:
                        secondTry_Letter03.setText(letter);
                        break;
                    case 3:
                        secondTry_Letter04.setText(letter);
                        break;
                    case 4:
                        secondTry_Letter05.setText(letter);
                        break;
                }
                break;
            case 2:
                switch (currentCarret) {
                    case 0:
                        thirdTry_Letter01.setText(letter);
                        break;
                    case 1:
                        thirdTry_Letter02.setText(letter);
                        break;
                    case 2:
                        thirdTry_Letter03.setText(letter);
                        break;
                    case 3:
                        thirdTry_Letter04.setText(letter);
                        break;
                    case 4:
                        thirdTry_Letter05.setText(letter);
                        break;
                }
                break;
            case 3:
                switch (currentCarret) {
                    case 0:
                        fourthTry_Letter01.setText(letter);
                        break;
                    case 1:
                        fourthTry_Letter02.setText(letter);
                        break;
                    case 2:
                        fourthTry_Letter03.setText(letter);
                        break;
                    case 3:
                        fourthTry_Letter04.setText(letter);
                        break;
                    case 4:
                        fourthTry_Letter05.setText(letter);
                        break;
                }
                break;
            case 4:
                switch (currentCarret) {
                    case 0:
                        fifthTry_Letter01.setText(letter);
                        break;
                    case 1:
                        fifthTry_Letter02.setText(letter);
                        break;
                    case 2:
                        fifthTry_Letter03.setText(letter);
                        break;
                    case 3:
                        fifthTry_Letter04.setText(letter);
                        break;
                    case 4:
                        fifthTry_Letter05.setText(letter);
                        break;
                }
                break;
            case 5:
                switch (currentCarret) {
                    case 0:
                        sixthTry_Letter01.setText(letter);
                        break;
                    case 1:
                        sixthTry_Letter02.setText(letter);
                        break;
                    case 2:
                        sixthTry_Letter03.setText(letter);
                        break;
                    case 3:
                        sixthTry_Letter04.setText(letter);
                        break;
                    case 4:
                        sixthTry_Letter05.setText(letter);
                        break;
                }
                break;
        }

        if (currentCarret >= 5) {return;}

        this.currentCarret++;
    }

    private void checkResult() {
        // Check if the word is correct
        String word = "";
        switch (numberOfTry) {
            case 0:
                word = firstTry_Letter01.getText().toString() + firstTry_Letter02.getText().toString() + firstTry_Letter03.getText().toString() + firstTry_Letter04.getText().toString() + firstTry_Letter05.getText().toString();
                break;
            case 1:
                word = secondTry_Letter01.getText().toString() + secondTry_Letter02.getText().toString() + secondTry_Letter03.getText().toString() + secondTry_Letter04.getText().toString() + secondTry_Letter05.getText().toString();
                break;
            case 2:
                word = thirdTry_Letter01.getText().toString() + thirdTry_Letter02.getText().toString() + thirdTry_Letter03.getText().toString() + thirdTry_Letter04.getText().toString() + thirdTry_Letter05.getText().toString();
                break;
            case 3:
                word = fourthTry_Letter01.getText().toString() + fourthTry_Letter02.getText().toString() + fourthTry_Letter03.getText().toString() + fourthTry_Letter04.getText().toString() + fourthTry_Letter05.getText().toString();
                break;
            case 4:
                word = fifthTry_Letter01.getText().toString() + fifthTry_Letter02.getText().toString() + fifthTry_Letter03.getText().toString() + fifthTry_Letter04.getText().toString() + fifthTry_Letter05.getText().toString();
                break;
            case 5:
                word = sixthTry_Letter01.getText().toString() + sixthTry_Letter02.getText().toString() + sixthTry_Letter03.getText().toString() + sixthTry_Letter04.getText().toString() + sixthTry_Letter05.getText().toString();
                break;
        }

        if (word.length() != 5) {
            Toast.makeText(this, "Please enter a word", Toast.LENGTH_SHORT).show();
            return;
        }

        if (guessedWord.contains(word)) {
            Toast.makeText(this, "You have already guessed this word", Toast.LENGTH_SHORT).show();
            setText("", numberOfTry, 0);
            setText("", numberOfTry, 1);
            setText("", numberOfTry, 2);
            setText("", numberOfTry, 3);
            setText("", numberOfTry, 4);
            currentCarret = 0;
            return;
        }

        // check each letter of the word, change the color based on the result
        // if letter is correct, right location, change the color to btn_right_letter_right_place_keyboard
        // if letter is correct, wrong location, change the color to btn_right_letter_wrong_place_keyboard
        // if letter is wrong, change the color to btn_wrong_keyboard
        // Initialize an array to track correct positions
        boolean[] correctPosition = new boolean[5];

        // Check each letter of the word
        for (int i = 0; i < 5; i++) {
            char guessedChar = word.charAt(i);
            // Check if the guessed letter is at the correct position
            if (wordToGuess.charAt(i) == guessedChar) {
                correctPosition[i] = true;
            }
        }

        // Initialize a variable to track incorrect positions
        boolean[] incorrectPosition = new boolean[5];

        // Check each letter of the word
        for (int i = 0; i < 5; i++) {
            char guessedChar = word.charAt(i);
            // If the guessed letter is not at the correct position
            if (!correctPosition[i]) {
                // Check if the guessed letter exists elsewhere in the word
                for (int j = 0; j < 5; j++) {
                    if (wordToGuess.charAt(j) == guessedChar && !correctPosition[j] && !incorrectPosition[j]) {
                        incorrectPosition[j] = true;
                        break;
                    }
                }
            }
        }

        // Change color based on correct letters and positions
        for (int i = 0; i < 5; i++) {
            if (correctPosition[i]) {
                // Change the color of the keyboard
                char letter = word.charAt(i);
                switch (letter) {
                    case 'A':
                        btnA.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'B':
                        btnB.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'C':
                        btnC.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'D':
                        btnD.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'E':
                        btnE.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'F':
                        btnF.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'G':
                        btnG.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'H':
                        btnH.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'I':
                        btnI.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'J':
                        btnJ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'K':
                        btnK.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'L':
                        btnL.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'M':
                        btnM.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'N':
                        btnN.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'O':
                        btnO.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'P':
                        btnP.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'Q':
                        btnQ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'R':
                        btnR.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'S':
                        btnS.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'T':
                        btnT.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'U':
                        btnU.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'V':
                        btnV.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'W':
                        btnW.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'X':
                        btnX.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'Y':
                        btnY.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                    case 'Z':
                        btnZ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_right_place_keyboard, getTheme()));
                        break;
                }

                switch (numberOfTry) {
                    case 0:
                        switch (i) {
                            case 0:
                                firstTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 1:
                                firstTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 2:
                                firstTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 3:
                                firstTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 4:
                                firstTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                        }
                        break;
                    case 1:
                        switch (i) {
                            case 0:
                                secondTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 1:
                                secondTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 2:
                                secondTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 3:
                                secondTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 4:
                                secondTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                        }
                        break;
                    case 2:
                        switch (i) {
                            case 0:
                                thirdTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 1:
                                thirdTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 2:
                                thirdTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 3:
                                thirdTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 4:
                                thirdTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                        }
                        break;
                    case 3:
                        switch (i) {
                            case 0:
                                fourthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 1:
                                fourthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 2:
                                fourthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 3:
                                fourthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 4:
                                fourthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                        }
                        break;
                    case 4:
                        switch (i) {
                            case 0:
                                fifthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 1:
                                fifthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 2:
                                fifthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 3:
                                fifthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 4:
                                fifthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                        }
                        break;
                    case 5:
                        switch (i) {
                            case 0:
                                sixthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 1:
                                sixthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 2:
                                sixthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 3:
                                sixthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 4:
                                sixthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                        }
                        break;
                }
            } else if (incorrectPosition[i]) {
                // Change the color of the keyboard
                char letter = word.charAt(i);
                switch (letter) {
                    case 'A':
                        btnA.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'B':
                        btnB.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'C':
                        btnC.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'D':
                        btnD.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'E':
                        btnE.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'F':
                        btnF.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'G':
                        btnG.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'H':
                        btnH.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'I':
                        btnI.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'J':
                        btnJ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'K':
                        btnK.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'L':
                        btnL.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'M':
                        btnM.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'N':
                        btnN.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'O':
                        btnO.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'P':
                        btnP.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'Q':
                        btnQ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'R':
                        btnR.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'S':
                        btnS.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'T':
                        btnT.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'U':
                        btnU.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'V':
                        btnV.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'W':
                        btnW.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'X':
                        btnX.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'Y':
                        btnY.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                    case 'Z':
                        btnZ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_right_letter_wrong_place_keyboard, getTheme()));
                        break;
                }

                switch (numberOfTry) {
                    case 0:
                        switch (i) {
                            case 0:
                                firstTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 1:
                                firstTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 2:
                                firstTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 3:
                                firstTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 4:
                                firstTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                        }
                        break;
                    case 1:
                        switch (i) {
                            case 0:
                                secondTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 1:
                                secondTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 2:
                                secondTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 3:
                                secondTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 4:
                                secondTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                        }
                        break;
                    case 2:
                        switch (i) {
                            case 0:
                                thirdTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 1:
                                thirdTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 2:
                                thirdTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 3:
                                thirdTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 4:
                                thirdTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                        }
                        break;
                    case 3:
                        switch (i) {
                            case 0:
                                fourthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 1:
                                fourthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 2:
                                fourthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 3:
                                fourthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 4:
                                fourthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                        }
                        break;
                    case 4:
                        switch (i) {
                            case 0:
                                fifthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 1:
                                fifthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 2:
                                fifthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 3:
                                fifthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                            case 4:
                                fifthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_wrong_place, getTheme()));
                                break;
                        }
                        break;
                    case 5:
                        switch (i) {
                            case 0:
                                sixthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 1:
                                sixthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 2:
                                sixthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 3:
                                sixthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                            case 4:
                                sixthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_right_letter_right_place, getTheme()));
                                break;
                        }
                        break;
                }
            } else {
                // Change the color of the keyboard
                char letter = word.charAt(i);
                switch (letter) {
                    case 'A':
                        btnA.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'B':
                        btnB.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'C':
                        btnC.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'D':
                        btnD.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'E':
                        btnE.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'F':
                        btnF.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'G':
                        btnG.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'H':
                        btnH.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'I':
                        btnI.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'J':
                        btnJ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'K':
                        btnK.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'L':
                        btnL.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'M':
                        btnM.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'N':
                        btnN.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'O':
                        btnO.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'P':
                        btnP.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'Q':
                        btnQ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'R':
                        btnR.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'S':
                        btnS.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'T':
                        btnT.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'U':
                        btnU.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'V':
                        btnV.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'W':
                        btnW.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'X':
                        btnX.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'Y':
                        btnY.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                    case 'Z':
                        btnZ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_wrong_keyboard, getTheme()));
                        break;
                }

                switch (numberOfTry) {
                    case 0:
                        switch (i) {
                            case 0:
                                firstTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 1:
                                firstTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 2:
                                firstTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 3:
                                firstTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 4:
                                firstTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                        }
                        break;
                    case 1:
                        switch (i) {
                            case 0:
                                secondTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 1:
                                secondTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 2:
                                secondTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 3:
                                secondTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 4:
                                secondTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                        }
                        break;
                    case 2:
                        switch (i) {
                            case 0:
                                thirdTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 1:
                                thirdTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 2:
                                thirdTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 3:
                                thirdTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 4:
                                thirdTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                        }
                        break;
                    case 3:
                        switch (i) {
                            case 0:
                                fourthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 1:
                                fourthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 2:
                                fourthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 3:
                                fourthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 4:
                                fourthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                        }
                        break;
                    case 4:
                        switch (i) {
                            case 0:
                                fifthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 1:
                                fifthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 2:
                                fifthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 3:
                                fifthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 4:
                                fifthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                        }
                        break;
                    case 5:
                        switch (i) {
                            case 0:
                                sixthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 1:
                                sixthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 2:
                                sixthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 3:
                                sixthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                            case 4:
                                sixthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_wrong_letter, getTheme()));
                                break;
                        }
                        break;
                }
            }
        }

        if (word.equals(wordToGuess)) {
            // Show the dialog
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Congratulations");
            builder.setMessage("You have guessed the word correctly");

            builder.setPositiveButton("New Game", (dialog, which) -> {
                // Start a new game
                startNewGame();
            });

            builder.setNegativeButton("Exit", (dialog, which) -> {
                // Exit the game
                finish();
            });

            builder.show();
            return;
        }

        guessedWord.add(word);

        // Increase the number of try
        numberOfTry++;

        // Reset the current carret
        currentCarret = 0;

        // If the number of try is 6, show the dialog
        if (numberOfTry == 6) {
            // Show the dialog
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Game Over");
            builder.setMessage("You have reached the maximum number of tries \n" + "The word was: " + wordToGuess);

            builder.setPositiveButton("New Game", (dialog, which) -> {
                // Start a new game
                startNewGame();
            });

            builder.setNegativeButton("Exit", (dialog, which) -> {
                // Exit the game
                finish();
            });

            builder.show();
        }
    }

    private void startNewGame() {
        // Reset the number of try
        numberOfTry = 0;

        // Reset the current carret
        currentCarret = 0;

        // Reset the guessed word
        guessedWord.clear();

        // Reset the color of the keyboard
        btnA.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnB.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnC.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnD.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnE.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnF.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnG.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnH.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnI.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnJ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnK.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnL.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnM.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnN.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnO.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnP.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnQ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnR.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnS.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnT.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnU.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnV.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnW.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnX.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnY.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));
        btnZ.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.btn_unchecked_keyboard, getTheme()));

        // Reset the color of the EditText
        firstTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        firstTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        firstTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        firstTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        firstTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));

        secondTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        secondTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        secondTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        secondTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        secondTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));

        thirdTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        thirdTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        thirdTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        thirdTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        thirdTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));

        fourthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fourthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fourthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fourthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fourthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));

        fifthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fifthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fifthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fifthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        fifthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));

        sixthTry_Letter01.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        sixthTry_Letter02.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        sixthTry_Letter03.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        sixthTry_Letter04.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));
        sixthTry_Letter05.setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.edt_unchecked_letter, getTheme()));

        // Clear all the EditText
        firstTry_Letter01.setText("");
        firstTry_Letter02.setText("");
        firstTry_Letter03.setText("");
        firstTry_Letter04.setText("");
        firstTry_Letter05.setText("");

        secondTry_Letter01.setText("");
        secondTry_Letter02.setText("");
        secondTry_Letter03.setText("");
        secondTry_Letter04.setText("");
        secondTry_Letter05.setText("");

        thirdTry_Letter01.setText("");
        thirdTry_Letter02.setText("");
        thirdTry_Letter03.setText("");
        thirdTry_Letter04.setText("");
        thirdTry_Letter05.setText("");

        fourthTry_Letter01.setText("");
        fourthTry_Letter02.setText("");
        fourthTry_Letter03.setText("");
        fourthTry_Letter04.setText("");
        fourthTry_Letter05.setText("");

        fifthTry_Letter01.setText("");
        fifthTry_Letter02.setText("");
        fifthTry_Letter03.setText("");
        fifthTry_Letter04.setText("");
        fifthTry_Letter05.setText("");

        sixthTry_Letter01.setText("");
        sixthTry_Letter02.setText("");
        sixthTry_Letter03.setText("");
        sixthTry_Letter04.setText("");
        sixthTry_Letter05.setText("");

        // Get a new word
        wordToGuess = getWord();
    }

    private String getWord() {
        // get a random word from R.array.words
        String[] words = getResources().getStringArray(R.array.words);

        Random random = new Random();
        int index = random.nextInt(words.length);

        return words[index].toUpperCase();
    }


    // Variables declaration
    private LinearLayout layoutFirstTry, layoutSecondTry, layoutThirdTry, layoutFourthTry, layoutFifthTry, layoutSixthTry;

    private TextView firstTry_Letter01, firstTry_Letter02, firstTry_Letter03, firstTry_Letter04, firstTry_Letter05;
    private TextView secondTry_Letter01, secondTry_Letter02, secondTry_Letter03, secondTry_Letter04, secondTry_Letter05;
    private TextView thirdTry_Letter01, thirdTry_Letter02, thirdTry_Letter03, thirdTry_Letter04, thirdTry_Letter05;
    private TextView fourthTry_Letter01, fourthTry_Letter02, fourthTry_Letter03, fourthTry_Letter04, fourthTry_Letter05;
    private TextView fifthTry_Letter01, fifthTry_Letter02, fifthTry_Letter03, fifthTry_Letter04, fifthTry_Letter05;
    private TextView sixthTry_Letter01, sixthTry_Letter02, sixthTry_Letter03, sixthTry_Letter04, sixthTry_Letter05;

    private Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
    private Button btnEnter, btnDelete;

    private int numberOfTry = 0;
    private int currentCarret = 0;
    private String wordToGuess;
    private Collection<String> guessedWord = new ArrayList<>();

}