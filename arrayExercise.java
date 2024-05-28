
public class arrayExercise {

    public static void main(String[] args) {
//         Esercizi Array
// - Memorizzare in un array di dieci posizioni i primi dieci numeri naturali.
// - Dato un array di interi già valorizzato, stampare il contenuto.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

// - Dato un array di interi già valorizzato, stampare tutti gli elementi maggiori di 10
        int[] array2 = {1, 2, 5, 76, 87, 3, 6, 76, 12, 9};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 10) {
                System.out.println(array2[i]);

            }
        }

// - Dato un array di interi già valorizzato, stampare la somma di tutti gli elementi
        int[] array3 = {1, 3, 45, 6, 8, 9, 54, 3, 2};
        int result = 0;
        for (int i = 0; i < array3.length; i++) {
            result = result + array3[i];
        }
        System.out.println("La somma dei numeri dell'array è " + result);

// - Dato un array di interi già valorizzato, stampare la media.
        int[] array4 = {1, 3, 45, 6, 8, 9, 54, 3, 2};
        int result1 = 0;
        for (int i = 0; i < array4.length; i++) {
            result1 = result1 + array4[i];
        }
        System.out.println("La media dei numeri dell'array è " + (result1 / array4.length));

// - Dato un array di interi già valorizzato, contare quante volte è presente il numero 10
        int[] array5 = {1, 3, 10, 6, 10, 9, 54, 10, 2};
        int result2 = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] == 10) {
                result2++;
            }
        }
        System.out.println("Il numero 10 è presente " + result2 + " volte nell'array.");

        // - Memorizzare in un array di 100 posti i primi cento numeri interi in ordine inverso.
        int[] cento = new int[100];
        int n = 100;

        for (int i = 0; i < 100; i++) {
            cento[i] = n;
            n--;

            System.out.println(cento[i]);
        }
    }

}
