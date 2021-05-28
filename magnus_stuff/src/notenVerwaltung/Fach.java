package notenVerwaltung;

public class Fach {
    Note[] noten;
    String name;
    int semester;
    int Schuljahr;

    public void addNote(Note note) {
        if (noten != null) {
            Note[] newNoten = new Note[noten.length + 1];
            for (int i = 0; i < noten.length; i++) {
                newNoten[i] = noten[i];
            }
            newNoten[noten.length] = note;
            this.noten = newNoten;
        } else {
            noten = new Note[]{note};
        }
    }

    public void printNote() {
        System.out.println("Noten im Fach " + name + ": ");
        for (int i = 0; i < noten.length; i++) {
            System.out.println("Note: " + noten[i].getWert() + "\nDatum: " + noten[i].getDatum() + "\nGewichtung: " + noten[i].getGewichtung() + "\n------");
        }
    }

    public String printNoteString() {
        String str = "";
        for (int i = 0; i < noten.length; i++) {
            str += "\nNote: " + noten[i].getWert() + "\nDatum: " + noten[i].getDatum() + "\nGewichtung: " + noten[i].getGewichtung() + "\n------";
        }

        return str;
    }

    public Fach() {

    }

    public Fach(String name, int semester, int schuljahr) {
        this.name = name;
        this.semester = semester;
        Schuljahr = schuljahr;
    }

    public Fach(Note[] noten, String name, int semester, int schuljahr) {
        this.noten = noten;
        this.name = name;
        this.semester = semester;
        Schuljahr = schuljahr;
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
        return Schuljahr;
    }

    public void setSchuljahr(int schuljahr) {
        Schuljahr = schuljahr;
    }
}
