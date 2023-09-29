public class ItemdeProduto {
    private Produto produto;
    private int quantidade;

    public ItemdeProduto(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean verificaItemdeProduto(ItemdeProduto it) {
        if (it.getProduto().equals(this.getProduto()) &&
                (it.getQuantidade() <= this.getQuantidade())) {
            return true;
        }
        return false;
    }
}
