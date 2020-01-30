package be.intecbrussel.maps.linkedhashmap;

import be.intecbrussel.comparator_comparable.Box;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, Box> boxes = new LinkedHashMap<>();
        boxes.put("Pictures childhood",new Box());
        boxes.put("Books from School",new Box());
        boxes.put("My old vinyl records",new Box(12,25,36));
        boxes.put("Love Letters",new Box());

        System.out.println("Content of my Loft");
        boxes.keySet().forEach(System.out::println);

        System.out.println("Let' listen to old records.");
        Box records = boxes.get("Books from School");

        System.out.println("length of records box = " + records.getLength());

    }
}
