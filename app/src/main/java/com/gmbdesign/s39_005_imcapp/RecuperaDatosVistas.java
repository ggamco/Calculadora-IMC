package com.gmbdesign.s39_005_imcapp;

import android.app.Activity;
import android.content.Context;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contendrá metodos para recuperar información de las vistas
 *
 * Created by ggamboa on 19/1/17.
 */

public class RecuperaDatosVistas {

    /**
     *
     * @param contexto de la actividad que llama al método.
     * @return cadenas introducidas en los EditText.
     */
    public static double[] recuperaCadenasIntroducidas(Context contexto){

        double[] cadenasIntroducidas = new double[2];

        Activity actividad = (Activity) contexto;
        EditText etPeso = (EditText) actividad.findViewById(R.id.myPesoTF);
        EditText etAltura = (EditText) actividad.findViewById(R.id.myAlturaTF);

        cadenasIntroducidas[0] = Double.parseDouble(etAltura.getText().toString());
        cadenasIntroducidas[1] = Double.parseDouble(etPeso.getText().toString());

        return cadenasIntroducidas;

    }

}
