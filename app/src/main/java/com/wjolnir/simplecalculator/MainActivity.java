package com.wjolnir.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text; //Global değişkenler tanımladık.
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.number1Text); //Global değişkenleri ön yüzdeki id'lere eşitledik.
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {// matches burada eşitliği kontrol ediyor. String'ler == ile kontrol edilemiyor.

            resultText.setText("Enter Number");

        }

        else{
            int number1 = Integer.parseInt(number1Text.getText().toString()); //String'e çevirdiğimiz değerleri Integer.parseInt ile int değere dönüştürdük.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result); //Bizden string bir değer istediği için sadece result yazarsak çalıştırınca çökecektir.
        }
    }

    public void deduct(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {// matches burada eşitliği kontrol ediyor. String'ler == ile kontrol edilemiyor.

            resultText.setText("Enter Number");

        }

        else{
            int number1 = Integer.parseInt(number1Text.getText().toString()); //String'e çevirdiğimiz değerleri Integer.parseInt ile int değere dönüştürdük.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result); //Bizden string bir değer istediği için sadece result yazarsak çalıştırınca çökecektir.
        }
    }

    public void multiply(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {// matches burada eşitliği kontrol ediyor. String'ler == ile kontrol edilemiyor.

            resultText.setText("Enter Number");

        }

        else{
            int number1 = Integer.parseInt(number1Text.getText().toString()); //String'e çevirdiğimiz değerleri Integer.parseInt ile int değere dönüştürdük.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result); //Bizden string bir değer istediği için sadece result yazarsak çalıştırınca çökecektir.
        }
    }

    public void divide(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {// matches burada eşitliği kontrol ediyor. String'ler == ile kontrol edilemiyor.

            resultText.setText("Enter Number");

        }

        else{
            int number1 = Integer.parseInt(number1Text.getText().toString()); //String'e çevirdiğimiz değerleri Integer.parseInt ile int değere dönüştürdük.
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result: " + result); //Bizden string bir değer istediği için sadece result yazarsak çalıştırınca çökecektir.
        }
    }
}