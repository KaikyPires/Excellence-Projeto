package controller;

import java.util.ArrayList;
import pizzaria.classes.Funcionarios;

public class ListaFuncionarios {
    
    private ArrayList<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();

    public ArrayList<Funcionarios> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionarios> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    
    public void inserirFuncionarios(Funcionarios f){
        
        listaFuncionarios.add(f);
        
    }
    
    public void removerFuncionarios(int index){
        
        listaFuncionarios.remove(index);
        
    }
    
    public void insereFuncionarioPos(int index, Funcionarios f){
        listaFuncionarios.add(index,f);
    }
    
}
