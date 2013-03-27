package edu.mediacampus.zahlenzoo.library;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * Gibt 1-n Aufgaben zurück, wählbar nach Zahlenraum und Rechenarten
 */

public class AufgabenGenerator {

    public ArrayList<Aufgabe> aufgabenSpeicher = new ArrayList<Aufgabe>();
    public ArrayList<Aufgabe> alleAufgabenSpeicher = new ArrayList<Aufgabe>();
    public ArrayList<Aufgabe> auswahlAufgabenSpeicher = new ArrayList<Aufgabe>();
    public int zahlenraum = 10;
    public int schwierigkeit = 1;
    public int anzahl = 8;

    public AufgabenGenerator(int zahlenraum) {

        this.zahlenraum = zahlenraum;
    }

    public ArrayList<Aufgabe> rechnenPlus() {
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
            if (zahl1 != 0 && zahl2 < ergebnis && ergebnis > zahlenraum - 10 && ergebnis <= zahlenraum) {
                aufgabenSpeicher.add(aufgabe);
                alleAufgabenSpeicher.add(aufgabe);
            }
            //TODO: Dubletten rausfiltern

            removeDuplicate();
        }


        while (aufgabenSpeicher.size() <= anzahl);

        return aufgabenSpeicher;

    }

    public ArrayList<Aufgabe> rechnenMinus() {

        do {
            Random random = new Random();
            int zahl1 = random.nextInt(zahlenraum) + 1;
            int zahl2 = random.nextInt(zahl1) + 1;

            Aufgabe aufgabe = new Aufgabe();
            aufgabe.setZahl1(zahl1);
            aufgabe.setZahl2(zahl2);
            aufgabe.setOperator('-');
            aufgabe.setErgebnis(zahl1 - zahl2);
            if (aufgabe.getErgebnis() > 0) {
                aufgabenSpeicher.add(aufgabe);
                alleAufgabenSpeicher.add(aufgabe);
            }
            //TODO: Dubletten rausfiltern
        }

        while (aufgabenSpeicher.size() <= anzahl);
        return aufgabenSpeicher;


    }

    public ArrayList<Aufgabe> rechnenMal() {
        do {
            Random random = new Random();
            int zahl1 = random.nextInt(zahlenraum) + 1;
            int zahl2 = random.nextInt(zahl1) + 1;

            Aufgabe aufgabe = new Aufgabe();
            aufgabe.setZahl1(zahl1);
            aufgabe.setZahl2(zahl2);
            aufgabe.setOperator('*');
            aufgabe.setErgebnis(zahl1 * zahl2);
            if (aufgabe.getErgebnis() < zahlenraum) {
                aufgabenSpeicher.add(aufgabe);
                alleAufgabenSpeicher.add(aufgabe);
            }
            //TODO: Dubletten rausfiltern
        }

        while (aufgabenSpeicher.size() <= anzahl);

        return aufgabenSpeicher;

    }

    public ArrayList<Aufgabe> rechnenGeteilt() {
        do {
            Random random = new Random();
            int ergebnis = random.nextInt(zahlenraum) + 1;
            int zahl2 = random.nextInt(ergebnis) + 1;
            int zahl1 = ergebnis * zahl2;
            Aufgabe aufgabe = new Aufgabe();
            aufgabe.setZahl1(zahl1);
            aufgabe.setZahl2(zahl2);
            aufgabe.setOperator('/');
            aufgabe.setErgebnis(ergebnis);
            if (zahl2 != 0 && zahl1 > zahl2 && zahl1< zahlenraum && zahl2 < zahlenraum) {
                aufgabenSpeicher.add(aufgabe);
                alleAufgabenSpeicher.add(aufgabe);
            }
            //TODO: Dubletten rausfiltern
        }

        while (aufgabenSpeicher.size() <= anzahl);

        return aufgabenSpeicher;

    }

    public ArrayList<Aufgabe> rechnenMeta() {
        this.zahlenraum = zahlenraum;
        aufgabenSpeicher.clear();
        rechnenMal();
        aufgabenSpeicher.clear();
        rechnenMinus();
        aufgabenSpeicher.clear();
        rechnenPlus();
        Log.v("ERGEBNIS >>>", String.valueOf(alleAufgabenSpeicher.size()));

        for (int i = 0; i <= 8; i++) {
            Random random = new Random();
            int pos = random.nextInt(27);

            auswahlAufgabenSpeicher.add(alleAufgabenSpeicher.get(pos));
        }

        return auswahlAufgabenSpeicher;

    }

    public void removeDuplicate() {
        HashSet hs = new HashSet();
        hs.addAll(aufgabenSpeicher);
        aufgabenSpeicher.clear();
        aufgabenSpeicher.addAll(hs);
    }

}
