package be.intecbrussel.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionSortApp {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("dino");
        stringList.add("kuki");
        stringList.add("lange vinger");
        stringList.add("Nootjes");
        stringList.add("chocolate chip kukis");

        stringList.sort(Comparator.naturalOrder());
        stringList.forEach(System.out::println);
        stringList.sort(Comparator.comparingInt(s-> s.length()));
        stringList.sort(Comparator.comparingInt(String::length));
        System.out.println("*".repeat(15));
        stringList.forEach(System.out::println);
    }
}
