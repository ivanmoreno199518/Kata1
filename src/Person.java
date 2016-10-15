import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private final static long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getAge() {
        return (int) (milliSecondsToYear(GregorianCalendar.getInstance().getTimeInMillis() - birthdate.getTimeInMillis()));
    }

    private long milliSecondsToYear(long milles) { return milles / MILLISECONDS_PER_YEAR; }

}
