
public class Pet {

    String nome;
    String animale;
    int eta;

    //	setter
    public void setName(String n) {
        this.nome = n;
    }

    public void setAnimal(String a) {
        this.animale = a;
    }

    public void setAge(int e) {
        this.eta = e;
    }

    //	getter
    public String getName() {
        return this.nome;
    }

    public String getAnimal() {
        return this.animale;
    }

    public int getEta() {
        return this.eta;
    }

    public static void main(String[] args) {

        Pet dog = new Pet();
        dog.nome = "lacky";
        dog.animale = "cane";
        dog.eta = 3;

    }

}
