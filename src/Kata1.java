import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1995, 11, 4);

        Person person = new Person("Ivan", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }

}
