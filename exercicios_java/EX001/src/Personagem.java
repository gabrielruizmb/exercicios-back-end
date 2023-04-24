public class Personagem {
    String nome;
    String categoria;
    int idade;

    public void mostrarStatus(int lvl) {
        System.out.printf("Boa noite %s, você é um(a) %s (lvl %d), tem %d pontos de força e %d anos de idade\n",
                nome, categoria, lvl, lvl * idade, idade);
    }
}
