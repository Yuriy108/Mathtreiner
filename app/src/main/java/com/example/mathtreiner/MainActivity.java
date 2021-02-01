package com.example.mathtreiner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView timer;
    String qwest;
    String anser;
    Integer number1;
    Integer number2;
    Boolean flag;
    int min;
    int max;
    TextView qwestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qwestion= findViewById(R.id.textQwest);

    }


    public void generetQwest(View view) {
        min=5;
        max=50;
        number1=(int)(Math.random()*(max-min)+min);
        number2=(int)(Math.random()*(max-min)+min);
        qwest=""+number1+"  +"+"  "+number2;
        qwestion.setText(qwest);



    }
}
