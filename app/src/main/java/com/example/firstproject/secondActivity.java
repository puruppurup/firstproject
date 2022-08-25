package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    TextView textnumder1, textnumber2, result;
    Button button;
    EditText text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textnumder1 = findViewById(R.id.textTitle);
        textnumber2 = findViewById(R.id.textHello);
        button = findViewById(R.id.button);
        text1 = findViewById(R.id.number1);
        text2= findViewById(R.id.number1);
        result = findViewById(R.id.resultTextFild);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num1, num2;
                    num1 = Double.parseDouble(text1.getText().toString());
                    num2 = Double.parseDouble(text2.getText().toString());
                    result.setText(num1 + num2 + "");
                    //передача в 3 активити

                    Intent intent = new Intent(secondActivity.this, thirdActivity.class);
                    intent.putExtra("data",num1 + num2 + "");
                    startActivity(intent);


                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "ошибка "+ e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}