package edu.mediacampus.zahlenzoo.library;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: retokiefer
 * Date: 17.04.13
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class Album {

    private ArrayList<String> album = new ArrayList<String>();


    public Album() {
        //Hier das Album aus Dateinamen einlesen und aufbauen.
    }


    public ArrayList<String> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<String> album) {
        this.album = album;
    }

}
