package edu.mediacampus.grundi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by retokiefer on 30.05.13.
 */

public class StartActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        //TODO Gespeicherte Spieler auslesen und die Buttons beschriften
        //TODO Shared Preferences

    }


    public void selectPlayer(View view) {

        Button button = (Button) view;
        if(button.getText().toString().equals("Neuer Spieler")) {
            //TODO Setup für existierenden Spieler laden und anzeigen
            //TODO Testausgabe löschen
            Toast.makeText(getApplicationContext(), button.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        else {
            //TODO Setup für existierenden Spieler laden und anzeigen
        }

    }

}

