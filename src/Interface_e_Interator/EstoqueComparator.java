package Interface_e_Interator;

import java.util.Comparator;

public class EstoqueComparator implements Comparator<Produto> {

    public int compare(Produto p1, Produto p2) {
        if (p1.quantidadeEstoque == p2.quantidadeEstoque) {
            return 0; // p1 vem antes de p2
        } else if (p1.quantidadeEstoque > p2.quantidadeEstoque) {
            return 1; // p1 vem depois de p2
        } else {
            return -1; // p1 vem antes de p2
        }
    }

}
