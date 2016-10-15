import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Ivan", new Date(95,11,4));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}
