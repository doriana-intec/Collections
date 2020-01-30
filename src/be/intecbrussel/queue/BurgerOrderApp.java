package be.intecbrussel.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerOrderApp {
    public static void main(String[] args) {

        Queue<BurgerOrder> burgerOrders = new PriorityQueue<>();

          //Method reference - comparator
//      //Comparator.comparing(BurgerOrder::getName));

        //A geneste klasse
//                new Comparator<BurgerOrder>() {
//                    @Override
//                    public int compare(BurgerOrder o1, BurgerOrder o2) {
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                }
//        );


        burgerOrders.offer(new BurgerOrder("Bicky Cheese",2));
        burgerOrders.offer(
                new BurgerOrder("Cheese Burger",7));
        burgerOrders.offer(
                new BurgerOrder("Vegan Burger", 1));

        while (burgerOrders.peek() != null){
            System.out.println("Handling " + burgerOrders.poll());
            //burgerOrders.poll().getName() => als je geen toString hebt
        }
    }
}
