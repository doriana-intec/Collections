package be.intecbrussel.oefeningen_cursisten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        ArrayList<Integer> numbers = new ArrayList<>();
//        int answer=0;
//
//        System.out.println("How many numbers do you want to add ? ");
//        int amount = scan.nextInt();
//        System.out.println("Please Enter numbers");
//        for (int i = 0; i < amount; i++){
//             answer= scan.nextInt();
//            numbers.add(answer);
//        }
//        numbers.stream().forEach(System.out::println);
//
////        int sum = 0;
////        for (int i =0; i< numbers.size(); i++){
////            sum +=numbers.get(i);
////        }
//        System.out.println("Sum :" + numbers.stream()
//                .mapToInt(Integer::intValue)
//                .sum());
//        System.out.println("Average :" + numbers.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//        .getAsDouble());

        ArrayList<String> words = new ArrayList<>();
        String input = "";

//        do{
//            System.out.println("enter word: ");
//            String word = scan.next();
//            words.add(word);
//        }while (!words.get(   words.size()-1    ).endsWith(".")   );

        System.out.println("Please enter a sentence ending with a .");
        while (!input.endsWith(".")) {
            input = scan.next();
            for (String s: input.split(" ")) {
                words.add(s);
                if (s.endsWith(".")) {
                    scan.close();
                    break;
                }
            }
        }

        Collections.reverse(words);
        System.out.println(words);



    }
}
