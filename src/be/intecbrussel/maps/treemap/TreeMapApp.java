package be.intecbrussel.maps.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapApp {
    public static void main(String[] args) {
        SortedMap<String,Person> personTreeMap = new TreeMap<>();

        Person person1 = new Person("Jos",5);
        Person person2 = new Person("Jef", 70);

        personTreeMap.put(person1.getName(),person1);
        personTreeMap.put(person2.getName(),person2);
        System.out.println("Method reference | consumer");
        personTreeMap.entrySet().forEach(System.out::println);
        System.out.println("Lambda | Biconsumer");
        personTreeMap.forEach((k,v)-> System.out.println(k + " " + v));


        System.out.println(personTreeMap.get("Jef"));
        System.out.println(personTreeMap.firstKey());
        System.out.println(personTreeMap.lastKey());


    }
}
