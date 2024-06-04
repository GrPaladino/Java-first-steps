
import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        // Esercizio 1
        // Scrivere un programma Java per trovare tutte le coppie di elementi in un array la cui somma è uguale a un numero specificato.

        int[] array = {60, 2, 4, 56, 90, 10, 40};
        int sommaDesiderata = 100;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sommaTemp = array[i] + array[j];
                if (sommaTemp == sommaDesiderata) {
                    System.out.println(array[i] + " + " + array[j] + " = " + sommaDesiderata);
                }
            }
        }

        // Esercizio 2
        // Scrivere un programma Java per inserire un elemento (posizione specifica) in un array.
        int[] array2 = new int[3];
        int elemento = 3;
        int posizione = 2;
        array2[posizione] = elemento;
        System.out.println(array2[2]);

        // Esercizio 3
        // Scrivere un programma Java per ottenere la differenza tra i valori più grandi e più piccoli in un array di numeri interi. La lunghezza della matrice deve essere 1 e superiore.
        int[] arrayNumeri = {5, 7, 2, 4, 9};

        // Stampa l'array originale
        System.out.println("Array originale: " + Arrays.toString(arrayNumeri));

        // Inizializza le variabili per il valore massimo e minimo
        int maxValore = arrayNumeri[0];
        int minValore = arrayNumeri[0];

        // Trova il valore massimo e minimo nell'array
        for (int i = 1; i < arrayNumeri.length; i++) {
            if (arrayNumeri[i] > maxValore) {
                maxValore = arrayNumeri[i];
            } else if (arrayNumeri[i] < minValore) {
                minValore = arrayNumeri[i];
            }
        }

        // Calcola e stampa la differenza tra il valore massimo e minimo
        int differenza = maxValore - minValore;
        System.out.println("Differenza tra il valore più grande e il valore più piccolo: " + differenza);

        // Esercizio 4
        // Scrivere un programma Java per trovare il secondo elemento più grande in un array.
        int[] arrayNumeri2 = {5, 7, 2, 4, 9};

        int firstBig = 0;
        int secondBig = 0;
        for (int i = 0; i < arrayNumeri2.length; i++) {
            if (arrayNumeri2[i] > firstBig) {
                secondBig = firstBig;
                firstBig = arrayNumeri2[i];
            } else if (arrayNumeri2[i] > secondBig) {
                secondBig = arrayNumeri2[i];
            }
        }
        System.out.println("L'elemento maggiore è " + firstBig + " e il secondo elemento maggiore è " + secondBig);

        // Esercizio 5
        // Scrivere un programma Java per sommare i valori di un array.
        int[] arr = {1, 5, 10, 25}; // Esempio di array
        int somma = 0;

        // Itera attraverso gli elementi dell'array e accumula la somma
        for (int i = 0; i < arr.length; i++) {
            somma += arr[i];
        }

        System.out.println("La somma degli elementi dell'array è: " + somma);

        // Esercizio 6
    }
}
