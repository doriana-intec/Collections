package be.intecbrussel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();

        strings.add(new String("First"));
        strings.add("Second");
        strings.add(2, "Third");

        strings.set(0, "Updated");

        strings.remove(1);
        strings.add("Replacing at index 1");
        strings.add(3, null);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Element  " + i + ": "
                    + strings.get(i));
        }

    }
}
