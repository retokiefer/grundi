package edu.mediacampus.zahlenzoo.library;


import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * Gibt 1-n Aufgaben zurück, wählbar nach Zahlenraum und Rechenarten
 */

public class AufgabenGenerator {

    public HashSet<Aufgabe> aufgabenSpeicher = new HashSet<Aufgabe>();
    public ArrayList<Aufgabe> alleAufgabenSpeicher = new ArrayList<Aufgabe>();
    public HashSet<Aufgabe> auswahlAufgabenSpeicher = new HashSet<Aufgabe>();
    public int zahlenraum = 10;
    public int schwierigkeit = 1;
    public int anzahl = 8;

    public AufgabenGenerator(int zahlenraum) {

        this.zahlenraum = zahlenraum;
    }

    public HashSet<Aufgabe> rechnenPlus() {
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
            if (zahl1 != 0 && zahl2 < ergebnis && aufgabe.getErgebnis() > zahlenraum - 10 && ergebnis <= zahlenraum) {
                aufgabenSpeicher.add(aufgabe);
            }
        }


        while (aufgabenSpeicher.size() <= anzahl);

        return aufgabenSpeicher;

    }

    public HashSet<Aufgabe> rechnenMinus() {

        do {
            Random random = new Random();
            int zahl1 = random.nextInt(zahlenraum) + 1;
            int zahl2 = random.nextInt(zahl1) + 1;

            Aufgabe aufgabe = new Aufgabe();
            aufgabe.setZahl1(zahl1);
            aufgabe.setZahl2(zahl2);
            aufgabe.setOperator('-');
            aufgabe.setErgebnis(zahl1 - zahl2);
            if (aufgabe.getErgebnis() > 0 && aufgabe.getErgebnis() > zahlenraum - 10) {
                aufgabenSpeicher.add(aufgabe);
            }
        }

        while (aufgabenSpeicher.size() <= anzahl);
        return aufgabenSpeicher;


    }

    public HashSet<Aufgabe> rechnenMal() {
        do {
            Random random = new Random();
            int zahl1 = random.nextInt(zahlenraum) + 1;
            int zahl2 = random.nextInt(zahl1) + 1;

            Aufgabe aufgabe = new Aufgabe();
            aufgabe.setZahl1(zahl1);
            aufgabe.setZahl2(zahl2);
            aufgabe.setOperator('*');
            aufgabe.setErgebnis(zahl1 * zahl2);
            if (aufgabe.getErgebnis() < zahlenraum && aufgabe.getErgebnis() > zahlenraum - 10) {
                aufgabenSpeicher.add(aufgabe);
            }
            //TODO: Dubletten rausfiltern
        }

        while (aufgabenSpeicher.size() <= anzahl);

        return aufgabenSpeicher;

    }

    //TODO: Gleichmäßige Verteilung der Operanden gewährleisten
    //TODO: => Neue Klasse: Ergebnisse vorschlagen und überprüfen

    public HashSet<Aufgabe> rechnenMeta() {
        this.zahlenraum = zahlenraum;
        aufgabenSpeicher.clear();
        rechnenMal();
        alleAufgabenSpeicher.addAll(aufgabenSpeicher);
        aufgabenSpeicher.clear();
        rechnenMinus();
        alleAufgabenSpeicher.addAll(aufgabenSpeicher);
        aufgabenSpeicher.clear();
        rechnenPlus();
        alleAufgabenSpeicher.addAll(aufgabenSpeicher);
        Log.v("ERGEBNIS >>>", String.valueOf(alleAufgabenSpeicher.size()));

        do {
            Random random = new Random();
            int pos = random.nextInt(alleAufgabenSpeicher.size());

            auswahlAufgabenSpeicher.add(alleAufgabenSpeicher.get(pos));
        }
        while (auswahlAufgabenSpeicher.size() <= anzahl);

        return auswahlAufgabenSpeicher;

    }

}
