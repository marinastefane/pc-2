import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {

        Scanner scannerTeclado = new Scanner(System.in);

        Produto p1 = new Produto(11111, "Detergente", 1.00);
        Produto p2 = new Produto(22222, "Sabao em Po", 6.50);
        Produto p3 = new Produto(33333, "Shampoo", 12.00);
        Produto p4 = new Produto(44444, "Creme Dental", 3.50);
        Produto p5 = new Produto(55555, "Sabonete Nivea", 1.80);
        Produto p6 = new Produto(66666, "Biscoito Maizena", 2.00);
        Produto p7 = new Produto(77777, "Leite Desnatado", 3.00);

        Estoque estoque = new Estoque();
        estoque.addItemdeProduto(new ItemdeProduto(p1, 10));
        estoque.addItemdeProduto(new ItemdeProduto(p2, 15));
        estoque.addItemdeProduto(new ItemdeProduto(p3, 15));
        estoque.addItemdeProduto(new ItemdeProduto(p4, 20));
        estoque.addItemdeProduto(new ItemdeProduto(p5, 29));
        estoque.addItemdeProduto(new ItemdeProduto(p6, 25));
        estoque.addItemdeProduto(new ItemdeProduto(p7, 15));

        System.out.println("Bem vindo ao Supermercado!");
        System.out.println("PRODUTOS");
        System.out.println("Codigo  - Descricao  -  Valor");
        System.out.println(p1.getCodigo() + " - " + p1.getDescricao() + " - " + p1.getValor());
        System.out.println(p2.getCodigo() + " - " + p2.getDescricao() + " - " + p2.getValor());
        System.out.println(p3.getCodigo() + " - " + p3.getDescricao() + " - " + p3.getValor());
        System.out.println(p4.getCodigo() + " - " + p4.getDescricao() + " - " + p4.getValor());
        System.out.println(p5.getCodigo() + " - " + p5.getDescricao() + " - " + p5.getValor());
        System.out.println(p6.getCodigo() + " - " + p6.getDescricao() + " - " + p6.getValor());
        System.out.println(p7.getCodigo() + " - " + p7.getDescricao() + " - " + p7.getValor());
        System.out.println("");
        System.out.println("0 para sair");

        int codigo;
        Venda venda = new Venda();

        do {
            System.out.println("Digite o código do produto: ");
            codigo = scannerTeclado.nextInt();
            ItemdeProduto produto = estoque.verificaCodigo(codigo);

            if (produto != null) {
                System.out.println("Digite a quantidade: ");
                int quantidade = scannerTeclado.nextInt();
                ItemdeProduto compra = new ItemdeProduto(produto.getProduto(), quantidade);

                if (estoque.verificaProdutoEstante(compra)) {
                    venda.adicionarNoCarrinho(compra); // Adicione a compra ao carrinho da venda
                    estoque.retireItemdeProduto(codigo, quantidade);
                } else {
                    System.out.println("Estoque insuficiente.");
                }
            } else {
                System.out.println("Código inválido.");
            }

        } while (codigo != 0);

        System.out.println("Valor total da compra: " + venda.calculaTotal());

        scannerTeclado.close();
    }

}
