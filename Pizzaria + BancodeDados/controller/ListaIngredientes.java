/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import pizzaria.classes.Ingredientes;

/**
 *
 * @author usuario
 */
public class ListaIngredientes {

    private ArrayList<Ingredientes> listaIngredientes = new ArrayList<Ingredientes>();

    public ArrayList<Ingredientes> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingredientes> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public void inserirIngredientes(Ingredientes i) {

        listaIngredientes.add(i);

    }

    public void removerIngredientes(int index) {

        listaIngredientes.remove(index);

    }

    public void insereIngredientesPos(int index, Ingredientes i) {
        listaIngredientes.add(index, i);
    }

}
