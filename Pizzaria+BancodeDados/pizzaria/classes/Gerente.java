package pizzaria.classes;

import java.util.ArrayList;

public class Gerente extends Funcionarios {

    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Gerente(int senha, String cargo, double salario, String nome) {
        super(cargo, salario, nome);
        this.senha = senha;
    }

    public Gerente() {
        super();
        this.senha = 0;
    }

    public void addFuncionario(ArrayList<Funcionarios> listaFuncionarios) {
        Funcionarios novoFuncionario = new Gerente(this.senha, this.getCargo(), this.getSalario(), this.getNome());

        listaFuncionarios.add(novoFuncionario);
    }

    public void removerFuncionario(ArrayList<Funcionarios> listaFuncionarios, String nome) {
        boolean encontrado = false;

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            Funcionarios funcionario = listaFuncionarios.get(i);

            if (funcionario.getNome().equals(nome)) {
                listaFuncionarios.remove(i);
                System.out.println("Funcionario(a) removido com sucesso.\n");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionario nao encontrado");
        }
    }

    @Override
    public double calculoSalario() {
        double saida;
        saida = super.getSalario() + 1000;
        return saida;
    }

}
