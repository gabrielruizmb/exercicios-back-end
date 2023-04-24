public class Main {
    public static void main(String[] args) {
        Personagem personagem001 = new Personagem();
        personagem001.nome = "Elesis";
        personagem001.categoria = "Espadachim";
        personagem001.idade = 20;

        Personagem personagem002 = new Personagem();
        personagem002.nome = "Lire";
        personagem002.categoria = "Arqueira";
        personagem002.idade = 22;

        Personagem personagem003 = new Personagem();
        personagem003.nome = "Arme";
        personagem003.categoria = "Maga";
        personagem003.idade = 23;

        personagem001.mostrarStatus(20);
        personagem002.mostrarStatus(34);
        personagem003.mostrarStatus(53);
    }
}