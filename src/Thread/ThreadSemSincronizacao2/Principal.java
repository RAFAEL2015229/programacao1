package Thread.ThreadSemSincronizacao2;

public class Principal {

    public static void main(String[] args) {
        MinhaClassComun minhaClassComun = new MinhaClassComun();
        MinhaThread minhaThread_1 = new MinhaThread(minhaClassComun, "Welcome");
        MinhaThread minhaThread_2 = new MinhaThread(minhaClassComun, "new");
        MinhaThread minhaThread_3 = new MinhaThread(minhaClassComun, "PROGRAMMER");
    }

}
