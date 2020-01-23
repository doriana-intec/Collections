package be.intecbrussel.lottery_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LotteryApp {
    public static void main(String[] args) {
Scanner kbd = new Scanner(System.in);
Set<Integer> setList = new HashSet<>();
int lotteryNumber;

do {
    System.out.println("Give me a few numbers: ");
    lotteryNumber = Integer.parseInt(kbd.next());
    if (!(lotteryNumber < 1 || lotteryNumber > 45) ) {
        setList.add(lotteryNumber);
        System.out.println("Thanks for the numbers.");
    } else{
        System.out.println("Invalid number");
    }
}while (setList.size() < 6);

        System.out.println("setlist:");
      setList.forEach(System.out::println);

        Random random = new Random();
        int min = 1;
        int max = 45;
        Set<Integer> setListRandom = new HashSet<>();
        while (setListRandom.size()<6){
            setListRandom.add(random.nextInt(max)+1);
        }

        setList.retainAll(setListRandom);
        System.out.println("\nsetlist after retailAll");
        System.out.println("correct numbers : " + setList.size());
        setList.forEach(System.out::println);
    }
}
