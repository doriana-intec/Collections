package be.intecbrussel.comparator_comparable;

import java.util.*;
import java.util.function.ToIntFunction;

public class BoxSortingApp {
    public static void main(String[] args) {
        Box box = new Box(5, 7, 4);//140
        Box box1 = new Box(8, 6, 8);//384
        Box box2 = new Box(9, 3, 4);//108

        SortedSet<Box> boxes =
                new TreeSet<>(new BoxComparedByLength());

        boxes.add(box);
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(new Box(10, 5, 12));//600

        boxes.forEach(System.out::println);


        ToIntFunction<Box> boxToIntFunction = b -> b.getLength();
        Comparator<Box> comparator =
                Comparator.comparingInt(boxToIntFunction);

        Comparator<Box> comparator1 = comparator.thenComparingInt(b -> b.getWidth());
        Comparator<Box> comparator2 = comparator1.thenComparingInt(b -> b.getHeight());

        SortedSet<Box> boxSortedSet = new TreeSet<>(comparator2);

        SortedSet<Box> boxSortedSet2 = new TreeSet<>(
                Comparator.comparingInt(Box::getLength)
                        .thenComparingInt(Box::getWidth)
                        .thenComparingInt(Box::getHeight));


        boxSortedSet2.addAll(boxes);
        boxSortedSet2.forEach(System.out::println);



    }
}
