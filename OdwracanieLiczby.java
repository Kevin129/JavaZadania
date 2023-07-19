package Zadania;

public class OdwracanieLiczby {
    public static void main(String[] args) {

        int[] tab = new int[] {1,2,3,4,5};
        int[] arr = new int[tab.length];

        for (int i = 0; i < tab.length; i++)
            arr[i] = tab[tab.length - 1 - i];

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
