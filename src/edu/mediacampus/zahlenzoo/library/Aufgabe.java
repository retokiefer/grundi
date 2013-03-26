package edu.mediacampus.zahlenzoo.library;

/**
 * Created with IntelliJ IDEA.
 * User: retokiefer
 * Date: 26.03.13
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */


public class Aufgabe {

    private int zahl1;
    private int zahl2;
    private char operator;
    private int ergebnis;


    @Override
    public String toString() {
        String result = String.valueOf(this.getZahl1()) + this.getOperator() + String.valueOf(this.getZahl2()) + "=" + String.valueOf(this.getErgebnis());
        return result;
    }

    public int getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(int ergebnis) {
        this.ergebnis = ergebnis;
    }

    public int getZahl1() {
        return zahl1;
    }

    public void setZahl1(int zahl1) {
        this.zahl1 = zahl1;
    }

    public int getZahl2() {
        return zahl2;
    }

    public void setZahl2(int zahl2) {
        this.zahl2 = zahl2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
