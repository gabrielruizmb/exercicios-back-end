import java.math.BigDecimal;

public class Produto {
    String categoria;
    String marca;
    String nome;
    BigDecimal preco;
    BigDecimal quantidade;

    void mostrarProduto() {
        System.out.printf("%s %s da marca %s, preço: %s, possui %s unidades em estoque.\n\n",
                categoria, nome, marca, preco, quantidade);
    }
    public void venderProduto(String unidadesVendidas) {

        BigDecimal unidades = new BigDecimal(unidadesVendidas);

        System.out.printf("Você vendeu %s unidades de %s por %s R$\n",
                unidadesVendidas, nome, preco.multiply(unidades));
        System.out.printf("Seu estoque atual de %s é de %s unidades.\n",
                nome, quantidade.subtract(unidades));
    }
}
