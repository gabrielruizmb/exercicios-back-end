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

        System.out.printf("Boa noite %s, você é um(a) %s e tem %d anos de idade\n",
                personagem001.nome, personagem001.categoria, personagem001.idade);

        System.out.printf("Boa noite %s, você é um(a) %s e tem %d anos de idade\n",
                personagem002.nome, personagem002.categoria, personagem002.idade);

        System.out.printf("Boa noite %s, você é um(a) %s e tem %d anos de idade\n",
                personagem003.nome, personagem003.categoria, personagem003.idade);
    }
}