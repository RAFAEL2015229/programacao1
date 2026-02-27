package Thread.ThreadSemSincronizacao;

public class Principal {

    public static void main(String[] args) {
        ListaNumeros listaNumeros = new ListaNumeros();                         // Cria lista de numeros com 1000 milisegundos de pausa (1s).
        ThreadEstendida1 minhaThread_1 = new ThreadEstendida1(listaNumeros);    // Executa repeticao a partir do 10
        ThreadEstendida2 minhaThread_2 = new ThreadEstendida2(listaNumeros);    // Executa repeticao a partir do 1000
        minhaThread_1.start();
        minhaThread_2.start();

    }
}
