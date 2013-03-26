package edu.mediacampus.zahlenzoo.library;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Gibt 1-n Aufgaben zurück, wählbar nach Zahlenraum und Rechenarten
 */

public class AufgabenGenerator {

    public ArrayList<Aufgabe> aufgabenSpeicher = new ArrayList<Aufgabe>();
    public int zahlenraum = 10;
    public int schwierigkeit = 1;
    public int anzahl = 9;

    public AufgabenGenerator() {

        berechneStufe1();

    }

    public void berechneStufe1() {
        do {
            Random random = new Random();
            int ergebnis = random.nextInt(zahlenraum) + 1;
            int zahl2 = random.nextInt(ergebnis) + 1;
            int zahl1 = ergebnis - zahl2;

            Aufgabe aufgabe = new Aufgabe();
            aufgabe.setZahl1(zahl1);
            aufgabe.setZahl2(zahl2);
            aufgabe.setOperator('+');
            aufgabe.setErgebnis(ergebnis);

            if (zahl1 != 0 && zahl2 < ergebnis) {
                aufgabenSpeicher.add(aufgabe);
            }

        }

        while (aufgabenSpeicher.size() <= 9);


        for (Aufgabe a : aufgabenSpeicher) {
            Log.i(">>> Ergebnis", String.valueOf(a.getZahl1()) + a.getOperator() + String.valueOf(a.getZahl2()) + "=" + String.valueOf(a.getErgebnis()));

        }


    }
}
