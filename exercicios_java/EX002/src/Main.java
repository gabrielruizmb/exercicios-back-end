import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de estoque de produtos!");

        Produto produto001 = new Produto();
        produto001.marca = "Natura";
        produto001.categoria = "Sabonete";
        produto001.nome = "Sabonete de morango";
        produto001.preco = (new BigDecimal("10"));
        produto001.quantidade = 5;

        produto001.mostrarProduto();
    }
}