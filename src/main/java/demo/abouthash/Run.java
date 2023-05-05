package demo.abouthash;

import java.util.HashSet;

import demo.abouthash.models.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Run {
    
    public static void main(String[] args) {
        HashSet<Person> pset = new HashSet<>();
        Person p1 = new Person().setName("Daming").setSalary("100");
        Person p2 = new Person().setName("Daming").setSalary("100");
        Person p3 = new Person().setName("Hanmeimei").setSalary("200");
        pset.add(p1);
        pset.add(p2);
        pset.add(p3);
        log.info("set -> [{}]",pset.toString());
    }
}
