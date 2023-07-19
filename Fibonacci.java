package Zadania;
//Wypisz enty wyraz ciągu Fibonacciego
//n1=1 n2=1 n3 i każdy kolejny = n2+n1

//metoda poniżej wypisuje enty wyraz ciągu Fibonacciego

public class Fibonacci {
    public static void main(String[] args) {
        fibo(1);                               //wywołujemy metody dla wybranego wyrazu
        fibo(2);
        fibo(5);


    }
    public static void fibo(int n) {             //metoda statyyczna, nie zwraca wartości, wypisuje enty wyraz ciągu
        long n1 = 1;                             //deklarujemy dwie zmienne typu long (bo wartosci moga byc duże)
        long n2 = 1;
        for (int i = 3; i <= n; i++) {
            long temp = n2 + n1;                 //zmienna temp przechowuje sumę dwóch poprzednich wyrazów
            n1 = n2;                             //nadpisujemy n1 i  ustawiamy wartośc n2 (przesuwamy wartość)
            n2 = temp;

            System.out.println(temp);              // n2 będzie wynosił temp
        }
    }
}
