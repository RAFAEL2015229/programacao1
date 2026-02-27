package Thread.ThreadComSincronizacaoBloco;

public class MinhaThread extends Thread {

    String mensagem;
    MinhaClassComun minhaClassComun;

    MinhaThread(MinhaClassComun classeComum, String msg) {
        minhaClassComun = classeComum;
        mensagem = msg;
        start();
    }

    synchronized public void run() {
        minhaClassComun.exibir(mensagem);
    }
}
