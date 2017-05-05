package com.mundotrujas.luzcristominalabanza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mundotrujas.luzcristominalabanza.Ministerio.Data.MinisterioContract;
import com.mundotrujas.luzcristominalabanza.Ministerio.Data.MinisterioDbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creacion del Objeto para crear la BD y la tabla.
        MinisterioContract MinContract = new MinisterioContract(this);
    }
}
