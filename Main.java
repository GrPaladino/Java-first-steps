// package javaproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // int x = 32;
        // x = 288;
        Scanner scanner = new Scanner(System.in);
        //
        // System.out.println("Come ti chiami?");
        // String nome = scanner.nextLine();
        //
        // System.out.println("Il tuo cognome?");
        // String cognome = scanner.nextLine();
        //
        // System.out.println("La tua etá?");
        // int eta = scanner.nextInt();
        // scanner.nextLine();
        //
        // System.out.println("Dove vivi?");
        // String citta = scanner.nextLine();
        //
        // System.out.println("Ciao " + nome + " " + cognome);
        // System.out.println("Hai " + eta + " anni");
        // System.out.println("Vivi a " + citta);

        //// variabile per effettuare una media matematica
        // double mediaAritmetica;
        // int[] numeri = {1, 2, 3, 4, 5};
        // double somma = 0;
        //
        // for (int numero : numeri) {
        // somma += numero;
        // }
        //
        // mediaAritmetica = somma / numeri.length;
        // System.out.println(mediaAritmetica);
        //
        //// variabile per calcolare una potenza del due
        // double potenzaDelDue;
        // int base = 2;
        // int esponente = 10;
        //
        // potenzaDelDue = (long) Math.pow(base, esponente);
        // System.out.println(potenzaDelDue);
        //
        //
        //// variabile per calcolare una frazione
        // double frazione;
        // int numeratore = 3;
        // int denominatore = 4;
        //
        // if (denominatore != 0) {
        // frazione = (double) numeratore / denominatore;
        // System.out.println(frazione);
        // } else {
        // System.out.println("Errore: Il denominatore non può essere zero.");
        // }
        //
        //// variabile per contenere il peso di una persona in kg
        // double peso = 70.5;
        //
        //// creare una variabile intera con valore 30
        // int trenta = 30;

        // Scrivi un programma Java che prende due numeri da tastiera
        // e stampa quello è più grande.

        // int a = 10;
        // int b = 28;
        //
        // if (a > b) {
        // System.out.println("Il numero più grande è " + a);
        // } else {
        // System.out.println("Il numero più grande è " + b);
        // }

        // Scrivi un programma Java che prende due numeri da tastiera e stampa
        // “I numeri inseriti sono uguali”
        // se i due numeri sono uguali e viceversa stampa
        // “I numeri inseriti sono diversi”.

        //

        // Scrivi un programma Java che prende tre numeri da tastiera
        // e stampi il maggiore.

        // Scanner scanner = new Scanner(System.in);
        //
        // System.out.println("Inserisci il primo numero");
        // int primo = scanner.nextInt();
        //
        // System.out.println("Inserisci il secondo numero");
        // int second = scanner.nextInt();
        //
        // System.out.println("Inserisci il terzo numero");
        // int terzo = scanner.nextInt();
        //
        // if (primo > second && primo > terzo) {
        // System.out.println("Il numero maggiore è " + primo);
        // }
        //
        // if (second > primo && second > terzo) {
        // System.out.println("Il numero maggiore è " + second);
        // }
        //
        // if (terzo > primo && terzo > second) {
        // System.out.println("Il numero maggiore è " + terzo);
        // }

        // Scrivi un programma Java che restituisce il numero di giorni di un mese dato
        // in input dall’utente.
        // Il mese è dato sotto forma di intero, ad esempio 3 corrisponde a marzo.
        // Ignorare gli anni bisestili.
        //
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Inserisci il numero del mese (1 = gennaio, 2 = febbraio,
        // ..., 12 = dicembre): ");
        // int month = sc.nextInt();
        //
        // int days;
        //
        // switch (month) {
        // case 1: // Gennaio
        // case 3: // Marzo
        // case 5: // Maggio
        // case 7: // Luglio
        // case 8: // Agosto
        // case 10: // Ottobre
        // case 12: // Dicembre
        // days = 31;
        // break;
        // case 4: // Aprile
        // case 6: // Giugno
        // case 9: // Settembre
        // case 11: // Novembre
        // days = 30;
        // break;
        // case 2: // Febbraio
        // days = 28; // Ignoriamo gli anni bisestili
        // break;
        // default:
        // System.out.println("Numero di mese non valido. Inserisci un valore tra 1 e
        // 12.");
        // return;
        // }
        //
        // System.out.println("Il mese " + month + " ha " + days + " giorni.");
        // }

        // Scrivi un programma Java che,
        // dati in input da tastiera due numeri che rappresentano base e altezza,
        // stampi il valore dell'area di un triangolo (base*altezza/2)

        System.out.println("Inserisci il primo numero");
        int base = scanner.nextInt();

        System.out.println("Inserisci il secondo numero");
        int altezza = scanner.nextInt();

        System.out.println("L'aria del tuo triangolo è " + (base * altezza) / 2);

    }
}