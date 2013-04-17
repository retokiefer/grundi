package edu.mediacampus.zahlenzoo.library;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: retokiefer
 * Date: 17.04.13
 * Time: 14:40
 * To change this template use File | Settings | File Templates.
 */
public class Engine {

    User user = new User();

    /**
     * @return Arrayliste mit Spielständen
     */
    public ArrayList<Integer> getSpielstand() {

        ArrayList<Integer> spielstand = new ArrayList<Integer>();
        spielstand.add(user.getDonePlus());
        spielstand.add(user.getDoneMinus());
        spielstand.add(user.getDoneMal());
        spielstand.add(user.getDoneMeta());

        return spielstand;
    }

    /**
     * SetSpielstand
     * Setzt den Spielstand für den jeweilig gespielten Operanden.
     *
     * @param operator
     * @param neueStufe
     */
    public void setSpielstand(int operator, int neueStufe) {
        //1:+, 2:-, 3:*, 4:#
        switch (operator) {
            case 1:
                user.setDonePlus(neueStufe);
                break;
            case 2:
                user.setDoneMinus(neueStufe);
                break;
            case 3:
                user.setDoneMal(neueStufe);
                break;
            case 4:
                user.setDoneMeta(neueStufe);
                break;
        }
    }

    /*TODO
     *  Aufgaben prüfen
     *  Spielstand
     *  Scoreerhöhen
     *  Externe Album-Klasse
     *  Neue Nutzer anlegen
     *
     *
     */

    public Boolean pruefeLoesungsvorschlag(String aufgabe, String vorschlag) {

        int pos = aufgabe.indexOf('=');
        String ergebnis = aufgabe.substring(pos + 1, aufgabe.length());

        if (ergebnis == vorschlag) {
            return true;
        }

        return false;
    }

}
