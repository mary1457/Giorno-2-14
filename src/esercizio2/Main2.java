package esercizio2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int N = scanner.nextInt();

        List<Integer> numeri = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < N; i++) {
            int numeroCasuale = random.nextInt(101); // Numero casuale tra 0 e 100
            numeri.add(numeroCasuale);
        }


        System.out.print("Numeri in ordine crescente: ");
        stampaNumeri(numeri);


        System.out.print("Numeri al contrario: ");
        stampaInverso(numeri);

        scanner.close();
    }


    public static void stampaNumeri (List<Integer> numeri) {
        Collections.sort(numeri);
        System.out.println(numeri);
    }


    public static void stampaInverso(List<Integer> numeri) {
        List<Integer> numeriInvertiti = new ArrayList<>(numeri);
        Collections.reverse(numeriInvertiti);

        System.out.println(numeriInvertiti);
    }
}


