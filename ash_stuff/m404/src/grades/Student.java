package grades;

public class Student {
    private Subject[] subjects;
    private String firstname;
    private String lastname;
    private String birthdate;
    private String gender;

    public Student(Subject[] subjects, String firstname, String lastname, String birthdate, String gender) {
        this.subjects = subjects;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public void addSubject(Subject subject){

    }

//    public Subject getSubject(String name){
//        return name;
//    }

    public void printSubjects(){

    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
