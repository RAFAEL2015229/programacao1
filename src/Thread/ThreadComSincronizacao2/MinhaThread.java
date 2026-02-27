package Thread.ThreadComSincronizacao2;

public class MinhaThread extends Thread {

    String mensagem;
    MinhaClassComun minhaClassComun;

    MinhaThread(MinhaClassComun classeComum, String msg) {
        minhaClassComun = classeComum;
        mensagem = msg;
        start();
    }

    public void run() {
        minhaClassComun.exibir(mensagem);
    }
}
