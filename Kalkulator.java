package Zadania;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj druga liczbę");
        int liczb2 = scanner.nextInt();

        int suma = liczba1 + liczb2;
        System.out.println("Suma: " + suma);
    }
}
