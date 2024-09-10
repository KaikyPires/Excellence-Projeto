package pizzaria.classes;

public class Garcom extends Funcionarios {

    public Garcom(String cargo, double salario, String nome) {
        super(cargo, salario, nome);

    }

    @Override
    public double calculoSalario() {
        double saida;
        saida = super.getSalario() + 300;
        return saida;
    }

}
