package pizzaria.classes;

public class Entregador extends Funcionarios implements FuncionariosTercerizado {

    public Entregador(String cargo, double salario, String nome) {
        super(cargo, salario, nome);
    }

    @Override
    public double calculoSalario() {
        double saida;
        saida = (super.getSalario() + 300) - this.calculoSalarioTercerizado();
        return saida;
    }

    @Override
    public double calculoSalarioTercerizado() {
        return 200;
    }

}
