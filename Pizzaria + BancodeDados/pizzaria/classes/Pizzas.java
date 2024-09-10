package pizzaria.classes;

public class Pizzas {
    
    //atributos
    private String nome;
    private double valor;
    private String tamanho;
    private int quantidade;
    private boolean borda;
    private Ingredientes inginseridos[] = new Ingredientes[7];

    //getter and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public boolean isBorda() {
        return borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //construtores    
    public Pizzas(String nome, int quantidade, String tamanho, boolean borda) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.borda = borda;
        this.quantidade = quantidade;
        this.inginseridos = new Ingredientes[7];

        calcularValorTotal();
    }

    public Pizzas(String nome,double valor) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = 0;
        this.tamanho = null;
        this.borda = false;
        this.inginseridos = new Ingredientes[7];
    }

    //metodos
    private void calcularValorTotal() {
        this.valor = 0;

        switch (tamanho) {
            case "Pequena":
                this.valor = 30;
                break;
            case "Media":
                this.valor = 45;
                break;
            case "Grande":
                this.valor = 60;
                break;
        }

        for (Ingredientes ingrediente : inginseridos) {
            if (ingrediente != null) {
                this.valor += ingrediente.getValor();
            }
        }
        if (!borda) {
            this.valor -= 3;
        }
        if (quantidade > 1) {
            this.valor *= quantidade;
        }
    }

    public void addIngredientesPizza(Ingredientes ingredienteadicionado) {
        if (ingredienteadicionado == null) {
            System.out.print("");
            return;
        }

        int index = 0;
        while (index < inginseridos.length) {
            if (inginseridos[index] == null) {
                inginseridos[index] = ingredienteadicionado;
                calcularValorTotal();
                return;
            }
            index++;
        }
        System.out.println("Ingrediente nao adicionado: O limite de ingredientes foi atingido!");
    }
    
    public String toString(){
        return this.nome;
    }
    
}
