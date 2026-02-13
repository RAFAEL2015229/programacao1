package POO;

public class objetos {

    public static void main(String[] args) {

        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();

        alunoEnsinoMedio.nome = "JOSE";
        alunoEnsinoMedio.teste = 8;
        alunoEnsinoMedio.prova = 9;

        System.out.println("Aluno do ensino medio: ");
        System.out.println("Nome: " + alunoEnsinoMedio.getNome());
        System.out.println("Media: " + alunoEnsinoMedio.getMedia());

//------------------------------------------------------------------------
        alunoEnsinoSuperior.nome = "Carlos";
        alunoEnsinoSuperior.teste = 8;
        alunoEnsinoSuperior.prova = 9;

        System.out.println("Aluno do ensino superior: ");
        System.out.println("Nome: " + alunoEnsinoSuperior.getNome());
        System.out.println("Media: " + alunoEnsinoSuperior.getMedia());

    }
}
/*        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        Professor professor = new Professor();

        aluno.setNome("Rafael");
        aluno.teste = 10;
        aluno.prova = 5;

        System.out.println("O nome do aluno é: " + aluno.getNome());
        System.out.println("A media do aluno é: " + aluno.getMedia());

        professor.setNome("RAFA");
        professor.setSalario(781);

        System.out.println(professor.getNome());
        System.out.println(professor.getInss());
        System.out.println(professor.getSalarioLiquido());

    }
 */
