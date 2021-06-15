package Bankkonto;

public enum WeekDays {
    MONTAG,
    DIENSTAG,
    MITTWOCH,
    DONNERSTAG,
    FREITAG,
    SAMSTAG,
    SONNTAG;

    private static WeekDays[] vals = values();
    public WeekDays next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
}
