
//Creare una classe Triangolo con gli attributi base e altezza rappresentati come interi.
//
//Inoltre deve avere i seguenti metodi:
//Calcola Area
//Calcola Perimetro
public class Triangolo {

    static int base;
    static int altezza;

    public int calcolaArea(int b, int a) {
        int aria = (b * a) / 2;
        return aria;
    }

    public int calcolaPerimetro(int b, int a, int i) {
        int perimetro = b + a + i;
        return perimetro;
    }

    public static void main(String[] args) {
        Triangolo scaleno = new Triangolo();
        scaleno.base = 10;
        scaleno.altezza = 3;

        // Calcolo dell'ipotenusa
        int ipotenusa = (int) Math.sqrt(base * base + altezza * altezza);

        // Calcolo dell'area del triangolo
        int aria = scaleno.calcolaArea(base, altezza);
        System.out.println("L'aria del triangolo è: " + aria);

        // Calcolo del perimetro del triangolo
        int perimetro = scaleno.calcolaPerimetro(base, altezza, ipotenusa);
        System.out.println("Il perimetro del triangolo è: " + perimetro);

    }

}
