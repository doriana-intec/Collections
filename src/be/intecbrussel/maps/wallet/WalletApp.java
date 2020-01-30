package be.intecbrussel.maps.wallet;

import be.intecbrussel.maps.linkedhashmap.LinkedHashMapApp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WalletApp {
    public static void main(String[] args) {
        Map<Coins,Integer> wallet = new HashMap<>();
        wallet.put(Coins.ONE_CENT,2);
        wallet.put(Coins.TWO_CENT,2);
        wallet.put(Coins.FIVE_CENT,1);
        wallet.put(Coins.TEN_CENT,5);
        wallet.put(Coins.TWENTY_CENT,8);
        wallet.put(Coins.FIFTY_CENT,10);
        wallet.put(Coins.ONE_EURO,1);
        wallet.put(Coins.TWO_EURO,9);

        wallet.entrySet().forEach(System.out::println);
        double sum = 0.0;
        sum = wallet.entrySet()
                .stream()
                .mapToDouble(coin -> coin.getKey().getValue()*coin.getValue())
                .sum();

        System.out.println("the sum of my wallet is: " + sum);

        System.out.println("\nWallet sorted");
        wallet.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);



    }
}
