package pizzaria.classes;

public class Barista extends Funcionarios {

    public Barista(String cargo, double salario, String nome) {
        super(cargo, salario, nome);

    }

    @Override
    public double calculoSalario() {
        double saida;
        saida = super.getSalario() + 200;
        return saida;
    }

}
