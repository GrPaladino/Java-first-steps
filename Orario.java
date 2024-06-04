
//Creare  una classe Orario che contiene un orario valido, quindi ore, minuti e secondi.
//Definire i seguenti metodi:
//validaOrario - verifica se l'orario impostato è valido.
//aggiungiOrario - aggiunge un nuovo orario all'orario contenuto nella classe
//sottraiOrario - sottrae un nuovo orario all'orario contenuto nella classe.
public class Orario {

    private int ore;
    private int minuti;
    private int secondi;

//	    validazione ora
    public boolean validaOrario() {
        return ore >= 0 && ore < 24 && minuti >= 0 && minuti < 60 && secondi >= 0 && secondi < 60;
    }

//	    aggiungi orario
    public void aggiungiOrario(int oreAggiunte, int minutiAggiunti, int secondiAggiunti) {
        ore += oreAggiunte;
        minuti += minutiAggiunti;
        secondi += secondiAggiunti;

        if (secondi >= 60) {
            minuti += secondi / 60;
            secondi %= 60;
        }
        if (minuti >= 60) {
            ore += minuti / 60;
            minuti %= 60;
        }
        ore %= 24;

    }

//	    sottrai orario
    public void sottraiOrario(int oreSottratte, int minutiSottratti, int secondiSottratti) {
        ore -= oreSottratte;
        minuti -= minutiSottratti;
        secondi -= secondiSottratti;

        if (secondi < 0) {
            minuti -= Math.abs(secondi) / 60 + 1;
            secondi = 60 - Math.abs(secondi) % 60;
        }
        if (minuti < 0) {
            ore -= Math.abs(minuti) / 60 + 1;
            minuti = 60 - Math.abs(minuti) % 60;
        }
        if (ore < 0) {
            ore = 24 - Math.abs(ore) % 24;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Orario orario = new Orario();
        System.out.println("Orario valido? " + orario.validaOrario());

        orario.aggiungiOrario(2, 15, 20);
        System.out.println("Nuovo orario dopo l'aggiunta: " + orario.ore + ":" + orario.minuti + ":" + orario.secondi);

        orario.sottraiOrario(1, 45, 30);
        System.out.println("Nuovo orario dopo la sottrazione: " + orario.ore + ":" + orario.minuti + ":" + orario.secondi);
    }

}
