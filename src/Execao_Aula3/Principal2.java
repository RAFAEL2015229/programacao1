package Execao_Aula3;

public class Principal2 {

    public static void main(String[] args) {
        try {
            throw new ExecaoCustomizada("Minha Exeção");

        } catch (ExecaoCustomizada execaoCustomizada) {

            System.out.println("Ocorreu uma Execao. ");
            System.out.println(execaoCustomizada.getMessage());
        }
    }
}
