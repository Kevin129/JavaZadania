package Zadania;

import java.util.HashMap;
import java.util.Map;

public class mapa {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Basia");
        students.put(2, "Tomek");
        students.put(3, "Basia");

        for (String student : students.values()) {   //wypisuje wszystkie wartośći z naszej mapy
            System.out.println(students);
        }
    }
}
