package notenverwaltung;

public class Fach {
    private Note[] noten;
    private String name;
    private int semester;
    private int schuljahr;

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

    @Override
    public String toString() {
        return "******************************************************************\nFach: " + name + " Semseter: " + semester + " Schuljahr: " + schuljahr + " Noten: \n" + printNoten();
    }
}

