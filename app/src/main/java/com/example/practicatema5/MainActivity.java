package com.example.practicatema5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Toast, Notificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast =(Button)findViewById(R.id.btnToast);
        Toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toast = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(toast);
            }
        });

        Notificacion =(Button)findViewById(R.id.btnNotificacion);
        Notificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notificacion = new Intent(MainActivity.this, NotificacionActivity.class);
                startActivity(notificacion);
            }
        });


    }
}
