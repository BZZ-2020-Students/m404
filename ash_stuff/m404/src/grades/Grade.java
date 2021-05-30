package grades;

import java.util.Date;

public class Grade {
    private double value;
    private Date dateTime;
    private double weighting;

    public Grade(double value, Date dateTime, double weighting){
        this.value = value;
        this.dateTime = dateTime;
        this.weighting = weighting;
    }

    public double getValue(){
        return getValue();
    }
    public void setValue(double value){
        this.value = value;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public double getWeighting() {
        return weighting;
    }

    public void setWeighting(double weighting) {
        this.weighting = weighting;
    }
}
