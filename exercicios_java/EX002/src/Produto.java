import java.math.BigDecimal;

public class Produto {
    String categoria;
    String marca;
    String nome;
    BigDecimal preco;
    int quantidade;

    void mostrarProduto() {
        System.out.printf("%s %s da marca %s, preço: %s, possui %d unidades em estoque.\n",
                categoria, nome, marca, preco, quantidade);
    }
}
