public class Alimento extends Produto {

    public Alimento(String nome, double preco, int tipo) {
        super(nome, preco, tipo);
    }
    @Override
    public double calcularDesconto(double porcentagem) {
        porcentagem = 2;
        return preco - (preco * (porcentagem / 100));
    }
}