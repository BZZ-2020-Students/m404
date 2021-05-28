package grades;

public class Subject {
    private Grade[] grades;
    private String name;
    private int semester;
    private int schoolyear;

    public Subject(Grade[] grades, String name, int semester, int schoolyear) {
        this.grades = grades;
        this.name = name;
        this.semester = semester;
        this.schoolyear = schoolyear;
    }

    public void addGrade(Grade grade){

    }
    public void printGrade(){

    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getSemester(){
        return semester;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }
    public int getSchoolyear(){
        return schoolyear;
    }
    public void setSchoolyear(int schoolyear){
        this.schoolyear = schoolyear;
    }
}
