package pizzaria.classes;

public class Cozinheiro extends Funcionarios {
       
    public Cozinheiro(String cargo, double salario, String nome){
        super(cargo,salario,nome);       
    }

    @Override
    public double calculoSalario() {
        double saida;
        saida = super.getSalario() + 400;
        return saida;
    }

}
