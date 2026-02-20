package Interface_e_Interator;

public class Produto {

    int codigoProduto;
    String nomeProduto;
    double preco;
    int quantidadeEstoque;

    Produto(int codigoProduto, String nomeProduto, double preco) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidadeEstoque = 0; // Inicializa a quantidade em estoque como 0
    }
}
