
//Progettare e realizzare una classe Car(automobile) con le proprietà seguenti.
//Un’automobile ha una determinata resa del carburante (misurata in miglia/galloni o in litri/chilometri: scegliete il sistema che preferite) e una certa quantità di carburante nel serbatoio. La resa è specificata al  momento della creazione dell'istanza e il livello iniziale del carburante è a zero.
//
//Fornire questi metodi:
//un metodo drive per simulare il percorso di un’automobile per una certa distanza, riducendo illivello di carburante nel serbatoio;
//un metodo getGas, per ispezionare il livello corrente del carburante;
//un metodo addGas per far rifornimento.
public class Car {

    private double resa = .07;
    private float carburante = 0;

    // metodo getgas
    public void getgas() {
        if (this.carburante == 0) {
            System.out.println("Il serbatoio è vuoto, fare rifornimento");
        } else {

            System.out.println("Hai ancora " + this.carburante + " lt di carburante");
        }
    }

    // metodo setgas
    public void addGas(int g) {
        this.carburante = this.carburante + g;
    }

    //	metodo drive
    public void drive(int km) {
        for (int i = 0; i < km; i++) {
            this.carburante = (float) (this.carburante - this.resa);
        }
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.getgas();

        bmw.addGas(47);
        bmw.drive(100);
        bmw.getgas();

    }

}
