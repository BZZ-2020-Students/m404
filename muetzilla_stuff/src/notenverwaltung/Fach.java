package notenverwaltung;

import java.text.DecimalFormat;

public class Fach {
    private Note[] noten;
    private String name;
    private int semester;
    private int schuljahr;
    private double averageNote;
    private DecimalFormat df = new DecimalFormat("0.00");

    public Fach(Note[] noten, String name, int semester, int schuljahr) {
        this.noten = noten;
        this.name = name;
        this.semester = semester;
        this.schuljahr = schuljahr;
    }

    public Note[] getNoten() {
        return noten;
    }

    public void setNoten(Note[] noten) {
        this.noten = noten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSchuljahr() {
        return schuljahr;
    }

    public void setSchuljahr(int schuljahr) {
        this.schuljahr = schuljahr;
    }

    public String printNoten() {
        String notenStr = "";
        for (int i = 0; i < noten.length; i++) {
            notenStr += noten[i].toString() + "\n";
        }
        return notenStr;
    }

    public double calculateAverageNote() {
        float total = 0;
        float gewichtung = 0;
        for (int i = 0; i < noten.length; i++) {
            total += noten[i].getWert() * noten[i].getGewichtung();
            gewichtung += noten[i].getGewichtung();
        }
        averageNote = total / gewichtung;
        df.format(averageNote);
        return averageNote;
    }

    public void addNote(Note n) {
        Note[] notenNew = new Note[noten.length + 1];
        for (int i = 0; i < noten.length; i++) {
            notenNew[i] = noten[i];
        }
        notenNew[notenNew.length - 1] = n;
        noten = notenNew;
    }

    @Override
    public String toString() {
        return "******************************************************************\nFach: " + name + "\n=============================\nSemseter: " + semester + "\nSchuljahr: " + schuljahr + "\nNoten: \n" + printNoten() + "\nDurchschnitt: " + df.format(calculateAverageNote());
    }

    public String toStringNameAndAverage() {
        return "Fach: " + name + "\tDurchschnitt: " + df.format(calculateAverageNote());
    }
}

