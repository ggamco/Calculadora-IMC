package com.gmbdesign.s39_005_imcapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import java.util.List;

import static com.gmbdesign.s39_005_imcapp.RecuperaDatosVistas.*;

/**
 * Created by ggamboa on 19/1/17.
 */

public class EscuchaBoton implements View.OnClickListener{

    Context contexto;

    public EscuchaBoton(Context contexto){
        this.contexto = contexto;
    }

    /**
     * Este método es invocado como callback cuando el usuario pulse sobre un
     * objeto de la vista.
     *
     * @param view vista que ha sido soleccionada.
     */
    @Override
    public void onClick(View view) {

        //detectamos el id del boton que llama al evento
        int idVistaPulsada = view.getId();

        switch (idVistaPulsada){
            case R.id.botonCalcular:
                Log.d(getClass().getCanonicalName(), "El usuario a pulsado el botonCalcular");

                double[] datosIntroducidos = recuperaCadenasIntroducidas(contexto);

                Acciones.mostrarResultado(contexto, datosIntroducidos);
        }

    }
}
