package demo.abouthash.models;

import java.util.Objects;

public class Person {

    private String name;
    private String salary;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSalary() {
        return salary;
    }

    public Person setSalary(String salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(salary, person.salary);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
    

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", salary='" + getSalary() + "'" +
                "}";
    }

}
