package Execao_Aula5;

public class ExecaoCustomizada extends Exception {

    String mensagem;

    public ExecaoCustomizada() {
        super("Opção Invalida. ");
    }

}
