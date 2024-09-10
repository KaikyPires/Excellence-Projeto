package controller;

import java.util.ArrayList;
import pizzaria.classes.Pedidos;

public class ListaPedidos {

    private ArrayList<Pedidos> listaPedidos = new ArrayList<Pedidos>();

    public ArrayList<Pedidos> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedidos> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void inserirPedidos(Pedidos pe) {

        listaPedidos.add(pe);

    }

    public void removerPedidos(int index) {

        listaPedidos.remove(index);

    }

    public void inserePedidosPos(int index, Pedidos pe) {
        listaPedidos.add(index, pe);
    }

}
