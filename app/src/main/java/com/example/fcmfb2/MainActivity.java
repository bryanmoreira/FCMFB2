package com.example.fcmfb2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular (View view) {

        EditText idade = findViewById(R.id.idade);

        String ano = idade.getText().toString();

        int anoIdade = Integer.parseInt(ano);
        int calculo = 220 - anoIdade;

        Toast.makeText(getApplicationContext(), "A frequência cardíaca média da sua idade é: " + String.valueOf(calculo), Toast.LENGTH_LONG).show();
    }
}