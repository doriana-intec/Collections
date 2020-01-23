package be.intecbrussel.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> setOfStrings = new TreeSet<>();

        setOfStrings.add(7);
        setOfStrings.add(6);
        setOfStrings.add(3);

        setOfStrings.forEach(System.out::println);

        System.out.println(((TreeSet<Integer>) setOfStrings).first());
        System.out.println(((TreeSet<Integer>) setOfStrings).last());

        System.out.println(((TreeSet<Integer>) setOfStrings).ceiling(5));
        System.out.println(((TreeSet<Integer>) setOfStrings).floor(8));
        System.out.println(((TreeSet<Integer>) setOfStrings).higher(1));
        System.out.println(((TreeSet<Integer>) setOfStrings).lower(10));

    }
}
