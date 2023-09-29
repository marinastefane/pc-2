
public class Venda {

    private ItemdeProduto[] produtos;
    private double preco_total_venda;
    private int limite;

    public Venda() {
        this.limite = 30;
        this.preco_total_venda = 0;
        this.produtos = new ItemdeProduto[limite];
    }

    public void adicionarNoCarrinho(ItemdeProduto it) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = it;
                break; // Pare o loop após adicionar o item
            }
        }
    }

    public double calculaTotal() {
        for (ItemdeProduto produto : produtos) {
            if (produto != null) {
                preco_total_venda += produto.getQuantidade() * produto.getProduto().getValor();
            }
        }
        return preco_total_venda;
    }
}
