package edu.mediacampus.grundi.library;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: retokiefer
 * Date: 17.04.13
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 * <p/>
 * User CRUD
 */
public class Verwaltung {

    public void neuerUser(String name, String icon) {
        User user = new User(name, icon);
    }

    public void userLoeschen(String name) {
        //
    }

    public ArrayList<User> zeigeUserListe() {

        ArrayList<User> userListe = new ArrayList<User>();

        //TODO: Aus Persistenz User auslesen

        return userListe;
    }

}
