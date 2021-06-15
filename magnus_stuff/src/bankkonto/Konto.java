package bankkonto;

import java.util.ArrayList;

public class Konto {
    private String name;
    private double franken;
    private String iban;
    private String standort;
    private ArrayList<String> history = new ArrayList<>();

    public String showHistory(){
        String answer = "Die Historie vom Konto "+ name +":\n";
        for (String s : history){
            answer += s + "\n";
        }
        return answer;
    }

    public void einzahlen(double franken, String grund){
        this.franken += franken;
        history.add("Es wurden " + franken + " auf das Konto von " + name + " eingezahlt. Grund: " + grund);
    }

    public void auszahlen(double franken, String grund){
        this.franken -= franken;
        history.add("Es wurden " + franken + " vom Konto " + name + " ausbezahlt. Grund: " + grund);
    }

    @Override
    public String toString(){
        return "Das Konto von " + name + " hat " + runden(franken) + " Fr. auf dem Konto\nStandort: "+ standort + " IBAN: " + iban + "\n";
    }

    public double runden(double franken){
        franken *= 100;
        int newfranken = (int)franken;
        franken = (double) newfranken / 100;
        return franken;
    }

    public Konto(){}

    public Konto(String name, double franken, String iban, String standort) {
        this.name = name;
        this.franken = franken;
        this.iban = iban;
        this.standort = standort;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFranken() {
        return franken;
    }

    public void setFranken(double franken) {
        this.franken = franken;
    }

}
