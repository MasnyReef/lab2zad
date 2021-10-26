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

public class Auto implements Comparable<Auto> {


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (Double.compare(auto.pojemnosc_silnika, pojemnosc_silnika) != 0) return false;
        if (marka != null ? !marka.equals(auto.marka) : auto.marka != null) return false;
        if (model != null ? !model.equals(auto.model) : auto.model != null) return false;
        return kraj == auto.kraj;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = marka != null ? marka.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        temp = Double.doubleToLongBits(pojemnosc_silnika);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (kraj != null ? kraj.hashCode() : 0);
        return result;
    }


    @Override
    public int compareTo(Auto that) {
        if (this.getMarka() == null && that.getMarka() == null) {
            // pass
        } else if (this.getMarka() == null) {
            return -1;
        } else if (that.getMarka() == null) {
            return 1;
        } else {
            int markaComparison = this.getMarka().compareTo(that.getMarka());
            if (markaComparison != 0) {
                return markaComparison < 0 ? -1 : 1;
            }
        }

        if (this.getModel() == null && that.getModel() == null) {
            // pass
        } else if (this.getModel() == null) {
            return -1;
        } else if (that.getModel() == null) {
            return 1;
        } else {
            int modelComparison = this.getModel().compareTo(that.getModel());
            if (modelComparison != 0) {
                return modelComparison < 0 ? -1 : 1;
            }
        }

        if (this.getPojemnosc_silnika() != that.getPojemnosc_silnika()) {
            return (this.getPojemnosc_silnika() < that.getPojemnosc_silnika() ? -1 : 1);
        }

        return 0;
    }
}


