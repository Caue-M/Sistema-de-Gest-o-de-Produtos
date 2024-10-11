public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();


        Produto notebook = new Eletronico("Notebook Dell", 5000, 1);
        Produto smartphone = new Eletronico("Smartphone Samsung", 3500, 1);
        Produto tablet = new Eletronico("Tablet iPad", 4500, 1);
        Produto tv = new Eletronico("TV LG", 3200, 1);

        estoque.addProduto(notebook);
        estoque.addProduto(smartphone);
        estoque.addProduto(tablet);
        estoque.addProduto(tv);


        Produto arroz = new Alimento("Arroz", 20, 2);
        Produto feijao = new Alimento("Feijão", 8, 2);
        Produto carne = new Alimento("Carne Bovina", 40, 2);
        Produto doceDeLeite = new Alimento("Doce de Leite", 15, 2);

        estoque.addProduto(arroz);
        estoque.addProduto(feijao);
        estoque.addProduto(carne);
        estoque.addProduto(doceDeLeite);



        System.out.println("Preços: ");
        estoque.precoComDesc(15);



    }
}
