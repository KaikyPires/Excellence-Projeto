package pizzaria.classes;

public class Pedidos {
    
    private int numPedido;
    private Pizzas pizzaPedido;
    private Bebidas bebidaPedido;
    private double valorPedido;

    public Pedidos(int numPedido, Pizzas pizzaPedido, Bebidas bebidaPedido) {
        this.numPedido = numPedido;
        this.pizzaPedido = pizzaPedido;
        this.bebidaPedido = bebidaPedido;
        this.valorPedido = pizzaPedido.getValor() + bebidaPedido.getValor();
    }

    public Pedidos() {
    }

    public int getNumPedidos() {
        return numPedido;
    }

    public void setNumPedidos(int numPedido) {
        this.numPedido = numPedido;
    }

    public Pizzas getPizzaPedidos() {
        return pizzaPedido;
    }

    public void setPizzaPedidos(Pizzas pizzaPedido) {
        this.pizzaPedido = pizzaPedido;
    }

    public Bebidas getBebidaPedidos() {
        return bebidaPedido;
    }

    public void setBebidaPedidos(Bebidas bebidaPedido) {
        this.bebidaPedido = bebidaPedido;
    }

    public double getValorPedidos() {
        return valorPedido;
    }

    public void setValorPedidos(double valorPedido) {
        this.valorPedido = valorPedido;
    }
    
    
}