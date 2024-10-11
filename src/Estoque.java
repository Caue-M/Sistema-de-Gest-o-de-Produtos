import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
    public void precoComDesc(double porcentagem) {
        System.out.println("Eletrônicos com desconto de " + porcentagem + "% (acima de R$ 4500):");
        for (Produto produto : produtos) {
            if (produto instanceof Eletronico) {
                if (produto.getPreco() > 4500) {
                    double precoComDesconto = produto.calcularDesconto(15);
                    System.out.println("Produto: " + produto.getNome() + " - Preço com desconto: R$ " + precoComDesconto);
                } else {
                    System.out.println("Produto: " + produto.getNome() + " - Preço sem desconto: R$ " + produto.getPreco());
                }
            }
        }

        System.out.println("\nDurante esta semana, todos os alimentos terão um desconto de 2%:");
        for (Produto produto : produtos) {
            if (produto instanceof Alimento) {
                double precoComDesconto = produto.calcularDesconto(2);
                System.out.println("Produto: " + produto.getNome() + " | Preço com desconto: R$ " + precoComDesconto);
            }
        }
    }
}

