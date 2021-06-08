package Bankkonto;

public class Date {
    int simulatedDayCounter;
    WeekDays weekday;
    int hour = -1;
    int min = -1;

    public Date(int simulatedDayCounter, WeekDays weekday, int hour, int min) {
        this.simulatedDayCounter = simulatedDayCounter;
        this.weekday = weekday;
        this.hour = hour;
        this.min = min;
    }

    public Date(int simulatedDayCounter, WeekDays weekday) {
        this.simulatedDayCounter = simulatedDayCounter;
        this.weekday = weekday;
    }

    public String toString() {
        if (hour < 0 && min < 0) {
            return "";
        } else {
            return "Datum: " + "\n" +
                    "\tDer " + simulatedDayCounter + ". Tag der Simulation" + "\n" +
                    "\tWochentag: " + weekday + "\n" +
                    "\tUhrzeit: " + hour + ":" + min;
        }
    }
}
