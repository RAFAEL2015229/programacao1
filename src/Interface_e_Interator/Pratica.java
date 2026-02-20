package Interface_e_Interator;

import java.util.ArrayList;
import java.util.Collections;

public class Pratica {

    public static void main(String[] args) {

        ArrayList<Produto> s = new ArrayList<Produto>();
        s.add(new Produto(123, "Blusa", 520));
        s.add(new Produto(456, "Calça", 120));
        s.add(new Produto(789, "Sapato", 350));

        System.out.println("Lista antes da Ordenação: ");

        for (Produto shop : s) {
            System.out.println(shop.quantidadeEstoque + " " + shop.nomeProduto + " " + shop.codigoProduto + " " + shop.preco);
        }

        System.out.println();

        System.out.println("Lista depois da Ordenação: ");

        Collections.sort(s, new EstoqueComparator());

        for (Produto shop : s) {
            System.out.println(shop.quantidadeEstoque + " " + shop.nomeProduto + " " + shop.codigoProduto + " " + shop.preco);
        }
    }
}
