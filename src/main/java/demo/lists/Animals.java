package demo.lists;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animals {

    public void say() {
        System.out.println("animal!!!!");
    }

    public static void main(String[] args) {
        List<? extends Animals> someAnimals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        Animals.showAnimals(dogs);
        Animals.showAnimals(cats);
        Animals.test(new ArrayList<Integer>(), new ArrayList<Integer>());
        Animals.test2(new ArrayList<Integer>(), new ArrayList<Double>());
        try {
            Class<?> clazz = Class.forName("java.lang.Integer");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m.getName());
            }
        } catch (Exception ex) {
            System.err.println("class forname error,message:" + ex.getMessage());
        }

    }

    public static void showAnimals(List<? extends Animals> theAnimals) {
        Objects.requireNonNull(theAnimals);
        for (Animals an : theAnimals) {
            an.say();
        }
    }

    public static <T> T getSome(T clazz) {
        return clazz;
    }

    public static void showAnimals1(List<Animals> theAnimals) {

    }

    // public <T> void test(List<? super T> dst, List<T> src) {
    // for (T t : src) {
    // dst.add(t);
    // }
    // }

    public static <T extends Number> void test(List<T> dest, List<T> src) {

    }

    public static void test2(List<? extends Number> dest, List<? extends Number> src) {

    }
}

class Dog extends Animals {

    @Override
    public void say() {
        System.out.println("dog!!!!!!");
    }
}

class Cat extends Animals {
    @Override
    public void say() {
        System.out.println("cat!!!!!!");
    }
}
