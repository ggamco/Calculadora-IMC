package com.gmbdesign.s39_005_imcapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.List;

/**
 * Created by ggamboa on 19/1/17.
 */

public class Acciones {

    public static void mostrarResultado(Context contexto, double[] datos){

        //Generamos un intent explicito, pasandole el contexto y llamando a la clase
        //que queremos lanzar, en este caso otra actividad.
        Intent intent = new Intent(contexto, ResultadoActivity.class);

        //añadimos en el intent los datos suministrados
        intent.putExtra("datosIntroducidos", datos);

        //preparamos la actividad que lanzara el intent explicito
        Activity actividad = (Activity) contexto;

        //Lanzamos el intent
        Log.d(Acciones.class.getCanonicalName(), "Lanzando el intent explicito");
        actividad.startActivity(intent);

    }

}
