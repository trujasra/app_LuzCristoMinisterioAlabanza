package com.mundotrujas.luzcristominalabanza;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends Activity {

    // declarcion del tiempo para el Splash
    private static final int TIEMPO_DURACION = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                // Inicia la otra actividad
                Intent intent =  new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, TIEMPO_DURACION);
    }
}
