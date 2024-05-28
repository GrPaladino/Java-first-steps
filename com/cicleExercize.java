package com;

import java.util.Scanner;

public class cicleExercize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Esercizio     1
        // Scrivere un programma in Java per visualizzare la tabella di moltiplicazione di un dato numero intero.
        // Dati di test
        // Immettere il numero (Tabella da calcolare): Immettere il numero di termini: 5
        // Uscita prevista:
        // 5 X 0 = 0
        // 5 X 1 = 5
        // 5 X 2 = 10
        // 5 X 3 = 15
        // 5 X 4 = 20
        // 5 X 5 = 25
        int n = 5;
        String x = "X";
        for (int i = 0; i < 5; i++) {
            System.out.println(n + " " + x + " " + i + " = " + (n * i));
        }

// Esercizio 2
// Scrivi un programma in Java per visualizzare i primi 10 numeri naturali.
// Esempio
// Uscita prevista: I primi 10 numeri naturali sono: 1 2 3 4 5 6 7 8 9 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
//         Esercizio 3
// Scrivi un programma in Java per visualizzare i primi n numeri naturali e la loro somma. n è preso in input
// Esempio
// Dati di test
// Inserisci il numero: 2
// Uscita prevista:
// Numero di input: 2
// I primi n numeri naturali sono: 2, 1
        System.out.println("inserisci un numero");
        int number = scanner.nextInt();
        System.out.println("Il tuo numero è " + number);

        System.out.print("I tuo numeri naturali sono: ");
        for (int i = number; i > 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println("");

//         Esercizio 4
// Scrivi un programma in Java per visualizzare gli n, con n preso in input, numeri dispari e la loro somma.
// Esempio
// Dati di test
// Il numero di input inserito è: 5
// Uscita prevista:
// I numeri dispari sono:
// 1
// 3
// 5
// 7
// 9
// La somma del numero naturale dispari fino a 5 termini è: 25
        int num = 5;
        int num2 = 10;
        int num3 = 0;
        for (int i = 0; i < num2; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
                num3 = num3 + i;
            }
        }
        System.out.println("La somma del numero naturale dispari fino a 5 termini è: " + num3);

//         Esercizio 5
// Scrivi un programma in Java per visualizzare il cubo del numero fino a un intero preso in input.
// Esempio
// Dati di test
// Inserire il numero di termini: 4
// Uscita prevista:
// Il numero è: 1 e il cubo di 1 è: 1
// Il numero è: 2 e il cubo di 2 è: 8
// Il numero è: 3 e il cubo di 3 è: 27
// Il numero è: 4 e il cubo di 4 è: 64
        System.out.print("Inserire il numero di termini: ");
        int imput = scanner.nextInt();

        for (int i = 1; i <= imput; i++) {
            int cubo = i * i * i;
            System.out.println("Il numero è: " + i + " e il cubo di " + i + " è: " + cubo);
        }

    }

}
