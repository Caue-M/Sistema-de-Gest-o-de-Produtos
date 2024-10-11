public abstract class Produto {
    protected String nome;
    protected double preco;
    protected int tipo;

    public Produto(String nome, double preco, int tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double calcularDesconto(double porcentagem){
        return preco - ((preco * porcentagem)/100);
    }
}
