public class Eletronico extends Produto{
    public Eletronico(String nome, double preco, int tipo) {
        super(nome, preco, tipo);
    }

    @Override
    public double calcularDesconto(double porcentagem){
        if (preco >= 4500){
            porcentagem = 15;
            return preco - (preco * (porcentagem / 100));
        }else{
            return preco;
        }
    }
}
