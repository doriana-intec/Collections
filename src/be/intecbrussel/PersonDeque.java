package be.intecbrussel;

import java.util.ArrayDeque;
import java.util.Deque;
//Author Lieve
public class PersonDeque {
    public static void main(String[] args) {


    Deque<String> personList=new ArrayDeque<>();
    personList.offerLast("Man1");
        personList.offerLast("Man2");
        personList.offerLast("Man3");
        personList.offerFirst("Vrouw1");
        personList.offerFirst("Vrouw2");
        personList.offerFirst("Vrouw3");

    String female = personList.pollFirst();
    String male = personList.pollLast();
    int count=0;

    while (female !=null) {
        System.out.println("couple "+ ++count +" : " + female +
                " and " + male );
        female = personList.pollFirst();
        male = personList.pollLast();
    }
//    personList=personList.stream().sorted()
//            .collect(Collectors.toCollection(ArrayDeque::new));
//    while (personList.size() >0){
//        String couple = personList.pollFirst()+" - " +personList.pollLast();
//        System.out.println(couple);
//    }


    }
}
