package Thread.ThreadComSincronizacao2;

public class MinhaClassComun {

    synchronized public void exibir(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }

}
