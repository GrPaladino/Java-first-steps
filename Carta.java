
//Si realizzi una classe Carta che rappresenta una carta da gioco.
//Tale classe ha due attributi: valore e seme di tipo String.
//La classe ha un metodo che prende in ingresso due argomenti che
//rappresentano valore e seme, e li confronta con valore e seme contenuti
//nella classe.
public class Carta {

    private String valore;
    private String seme;

    public boolean confrontaCarta(String valoreConfronto, String semeConfronto) {
        return this.valore.equals(valoreConfronto) && this.seme.equals(semeConfronto);
    }

    public static void main(String[] args) {
        Carta carta = new Carta();
        carta.valore = "7";
        carta.seme = "cuori";

        System.out.println("Carta creata: " + carta.valore + " di " + carta.seme);
        System.out.println("Confronto con 7 di cuori: " + carta.confrontaCarta("7", "cuori"));
    }

}
