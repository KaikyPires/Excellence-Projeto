/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import pizzaria.classes.Pizzas;

/**
 *
 * @author usuario
 */
public class ListaPizzas {

    private ArrayList<Pizzas> listaPizzas = new ArrayList<Pizzas>();

    public ArrayList<Pizzas> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizzas> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public void inserirPizzas(Pizzas p) {

        listaPizzas.add(p);

    }

    public void removerPizzas(int index) {

        listaPizzas.remove(index);

    }

    public void inserePizzasPos(int index, Pizzas p) {
        listaPizzas.add(index, p);
    }

}
