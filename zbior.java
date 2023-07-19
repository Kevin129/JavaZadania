package Zadania;

import java.util.HashSet;
import java.util.Set;

public class zbior {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("Orange");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
