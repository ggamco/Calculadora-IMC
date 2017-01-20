package com.gmbdesign.s39_005_imcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Se dibuja la actividad principal
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creamos el objeto Listener
        View.OnClickListener escuchaBoton = new EscuchaBoton(this);

        //Preparamos el boton y seteamos el listener
        Button botonPulsado = (Button) findViewById(R.id.botonCalcular);
        botonPulsado.setOnClickListener(escuchaBoton);

    }




}
