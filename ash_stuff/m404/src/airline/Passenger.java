package airline;

import java.util.Date;

public class Passenger {
    public Passenger(){}

    private String seatNr;
    private String firstName;
    private String lastName;
    private String birthDate;
    private char virus;

    public Passenger(String seatNr, String firstName, String lastName, String birthDate, char virus){
        this.seatNr = seatNr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.virus = virus;
    }

    public String getSeatNr(){
        return seatNr;
    }
    public void setSeatNr(String seatNr){
        this.seatNr = seatNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public char getVirus(){
        return virus;
    }

    public void setVirus(char virus){
        this.virus = virus;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "seatNr='" + seatNr + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", state='" + virus + '\'' +
                '}';
    }
}
