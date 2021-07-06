package _projektFussballVerwaltung;

public class Club {
    private String clubName;
    private Spieler[] spielers;

    public Club(){
    }

    public Club(String clubName, Spieler[] spielers) {
        this.clubName = clubName;
        this.spielers = spielers;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Spieler[] getSpielers() {
        return spielers;
    }

    public void setSpielers(Spieler[] spielers) {
        this.spielers = spielers;
    }
}
