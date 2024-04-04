package ex3;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nomeCientifico = "Canis lupus familiaris";
        animal.familia = "Canidae";
        animal.reino = "Animalia";
        animal.nomesPopulares[0] = "Cachorro";
        animal.nomesPopulares[1] = "Doguinho";
        animal.nomesPopulares[2] = "cadela";
        animal.nomesPopulares[3] = "perrito";
        animal.nomesPopulares[4] = "dogao";

        System.out.println("Nome Cientifico: " + animal.nomeCientifico);
        System.out.println("Familia: " + animal.familia);
        System.out.println("Reino: " + animal.reino);
        System.out.println("Nomes Populares: ");
        for (String nome : animal.nomesPopulares) {
            System.out.println(nome);
        }
    }
}
