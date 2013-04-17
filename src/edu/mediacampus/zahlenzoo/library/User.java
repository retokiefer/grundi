package edu.mediacampus.zahlenzoo.library;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: retokiefer
 * Date: 17.04.13
 * Time: 14:24
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private String name;
    private String icon; //


    private int score;  //
    private ArrayList<Integer> bilder;

    private int donePlus;
    private int doneMinus;
    private int doneMal;
    private int doneMeta;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Integer> getBilder() {
        return bilder;
    }

    public void setBilder(ArrayList<Integer> bilder) {
        this.bilder = bilder;
    }

    public int getDonePlus() {
        return donePlus;
    }

    public void setDonePlus(int donePlus) {
        this.donePlus = donePlus;
    }

    public int getDoneMinus() {
        return doneMinus;
    }

    public void setDoneMinus(int doneMinus) {
        this.doneMinus = doneMinus;
    }

    public int getDoneMal() {
        return doneMal;
    }

    public void setDoneMal(int doneMal) {
        this.doneMal = doneMal;
    }

    public int getDoneMeta() {
        return doneMeta;
    }

    public void setDoneMeta(int doneMeta) {
        this.doneMeta = doneMeta;
    }


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
