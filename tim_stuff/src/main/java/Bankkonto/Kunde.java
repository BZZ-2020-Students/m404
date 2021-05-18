package Bankkonto;

import java.util.Date;

public class Kunde {
    String vorname, nachname;
    int alter, id;

    public Kunde(int id, String vorname, String nachname, int alter) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public String toString() {
        return "ID: " + id + "\n"
                + "Name: " + vorname + " " + nachname + "\n" +
                "Alter: " + alter;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getId() {
        return id;
    }
}