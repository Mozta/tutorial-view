package com.hololo.tutorial.sample;

import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class MainActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Ahora sabrás cuantos litros te cargan en la gasolinera")
                .setBackgroundColor(Color.parseColor("#99CC33"))
                .setDrawable(R.drawable.banner1)
                .build());
        addFragment(new Step.Builder().setTitle("Identifica la gasolinera mejor evualuada")
                .setBackgroundColor(Color.parseColor("#99CC33"))
                .setDrawable(R.drawable.banner2)
                .build());
        addFragment(new Step.Builder().setTitle("Califica del 1 al 5 el servicio de las gasolineras")
                .setBackgroundColor(Color.parseColor("#99CC33"))
                .setDrawable(R.drawable.banner1)
                .build());
        addFragment(new Step.Builder().setTitle("Comparte tu calificación y comenta con otros usuarios")
                .setBackgroundColor(Color.parseColor("#99CC33"))
                .setDrawable(R.drawable.banner2)
                .build());
        addFragment(new Step.Builder().setTitle("Revisa cuánto te rinde el combustible despachado")
                .setBackgroundColor(Color.parseColor("#99CC33"))
                .setDrawable(R.drawable.banner1)
                .build());
        addFragment(new Step.Builder().setTitle("¡Disfruta éste y otros grandes beneficios que te brinda éste gadget y entra al futuro!")
                .setBackgroundColor(Color.parseColor("#99CC33"))
                .setDrawable(R.drawable.banner2)
                .build());
    }
}
