package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

enum KrajPochodzenia{
    NIEWIADOMY("-------"),
    NIEMCY("Niemcy"),
    WIELKA_BRYTANIA("WielkaBrytania"),
    JAPONIA("Japionia"),
    USA("USA"),
    WLOCHY("Wlochy");

    String NazwaKraju;

    private KrajPochodzenia(String nazwa_kraju) {NazwaKraju = nazwa_kraju; }


    @Override
    public String toString() {
        return NazwaKraju;
    }


}  // koniec klasy enum Kraj

class AutoException extends Exception {

    private static final long serialVersionUID = 1L;

    public AutoException(String message) {
        super(message);
    }

} // koniec klasy PersonException

public class Auto {


    private String marka;
    private String model;
    private double pojemnosc_silnika;
    private KrajPochodzenia kraj;

    public Auto(String marka, String model) {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPojemnosc_silnika() {
        return pojemnosc_silnika;
    }

    public void setPojemnosc_silnika(double pojemnosc_silnika) {
        this.pojemnosc_silnika = pojemnosc_silnika;
    }


    public KrajPochodzenia getKraj() {
        return kraj;
    }

    public void setKraj(KrajPochodzenia kraj) {
        this.kraj = kraj;
    }



    @Override
    public String toString() {
        return marka + " " + model;
    }


}

