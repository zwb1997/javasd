package demo.aboutlambd;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface DemoInterface {
    void doSomething();
}

public class Run {

    public static void main(String[] args) {
        Person p1 = new Person("Daming", LocalDate.of(2000, Month.JULY, 1), Person.Sex.MALE, "asdas@qq.com");
        Person p2 = new Person("Hanmeimei", LocalDate.of(2001, Month.AUGUST, 12), Person.Sex.FAMALE, "asdas@qq.com");
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);

        Supplier<Integer> c = p1::getAge;
        System.out.println(c.get());

        // 1
        // RosterTest.printPersons(persons, new RosterTest.CheckPerson() {

        // @Override
        // public boolean test(Person p) {

        // return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <=
        // 25;
        // }

        // });

        // 2
        RosterTest.printPersons(persons, p -> {
            return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
        });
        Function<Double, Double> square = Hey::square;
        double ans = square.apply(23d);
        System.out.println(ans);
    }

}

class Hey {
    public static double square(double num) {
        return Math.pow(num, 2);
    }
}

/**
 * @author
 */
class Person {

    public static void playSoul() {
        System.out.println("gonna to play soul");
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String email;

    public Person() {

    }

    public Person(String name, LocalDate birthday, Sex gender, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public enum Sex {
        /**
         * a man
         */
        MALE,
        /**
         * a woman
         */
        FAMALE
    }

    public int getAge() {

        int age = LocalDate.now().getYear()
                - Objects.requireNonNull(this.birthday, "the person without birthday").getYear();
        System.out.println("this person :" + this.name + " the age :" + age);
        return age;
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", birthday='" + getBirthday() + "'" + ", gender='" + getGender()
                + "'" + ", email='" + getEmail() + "'" + "}";
    }

}

class RosterTest {
    // interface CheckPerson {
    // boolean test(Person p);
    // }

    // public static void printPersons(List<Person> roster, CheckPerson<Person>
    // tester) {
    // for (Person p : roster) {
    // if (tester.test(p)) {
    // p.printPerson();
    // }
    // }
    // }

    public static void printPersons(List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> action) {
        for (Person p : roster) {
            if (tester.test(p)) {
                action.accept(p);
            }
        }
    }
}
