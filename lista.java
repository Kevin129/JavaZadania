package Zadania;

import java.util.ArrayList;
import java.util.List;

public class lista {
    public static void main(String[] args) {

        //Lista z imionami
        List<String> names = new ArrayList<>();
        names.add("Paweł"); //id = 0
        names.add("Kasia"); //id = 1
        names.add("Ola");   //id = 2
        names.add("Paweł"); //id = 3

        System.out.println(names.get(0)); //wypisuje rekord po indexie

        for (String name : names) {      //wypisuje wszystkie dane z listy
            System.out.println(name);
        }
    }
}
