package POO;

public class Professor extends Pessoa {

    double salario;

    public double getSalario(double salario) {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    double getInss() {
        return salario * 0.11;
    }

    double getSalarioLiquido() {
        return salario - getInss();
    }
}
