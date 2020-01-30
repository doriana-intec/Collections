package be.intecbrussel.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapApp {
    public static void main(String[] args) {
        Map<String,Integer> ingredients = new HashMap<>();
        ingredients.put("Patatoes",5);
        ingredients.put("Carrots",4);
        ingredients.put("Beans", 2);
        ingredients.put("Chicken", 1);

        System.out.println(ingredients.get("Chicken"));

        for(String s: ingredients.keySet()){
            System.out.println(s + " : " + ingredients.get(s));
        }
    }
}
