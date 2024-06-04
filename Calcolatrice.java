
//Crea un programma dotato di una classe calcolatrice
//con due attributi chiamati a e b.
//
//La classe deve avere i seguenti metodi:
//- somma: stampa la somma di a e b
//- moltiplicazione: stampa la moltiplicazione di a e b
//- divisione
//-sottrazione
public class Calcolatrice {

    private int a;
    private int b;

//	calcola somma
    public int somma() {
        return a + b;
    }

//	calcola moltiplicazione
    public int moltiplicazione() {
        return a * b;
    }

//	calcola divisione
    public int divisione() {
        return a / b;
    }

//	calcola sottrazione
    public int sottrazione() {
        return a - b;
    }

    public static void main(String[] args) {
        Calcolatrice gino = new Calcolatrice();
        gino.a = 13;
        gino.b = 75;

        System.out.println("La somma di gino è: " + gino.somma());
        System.out.println("La moltiplicazione di gino è: " + gino.moltiplicazione());
        System.out.println("La divisione di gino è: " + gino.divisione());
        System.out.println("La sottrazione di gino è: " + gino.sottrazione());

    }

}
