public class Estoque {
    private ItemdeProduto[] estante;
    private int limite;
    private int inseridos;

    public Estoque() {
        this.limite = 30;
        this.estante = new ItemdeProduto[limite];
        this.inseridos = 0;
    }

    public Estoque(ItemdeProduto[] estante, int limite, int inseridos) {
        this.limite = limite;
        this.estante = estante;
        this.inseridos = inseridos;
    }

    public Estoque(ItemdeProduto[] estante) {
        this.estante = estante;
    }

    public ItemdeProduto[] getEstante() {
        return estante;
    }

    public void setEstante(ItemdeProduto[] estante) {
        this.estante = estante;
    }

    public boolean addItemdeProduto(ItemdeProduto it) {
        if (inseridos < limite) {
            estante[inseridos] = it;
            inseridos++;
            return true;
        }
        return false;
    }

    public boolean verificaProdutoEstante(ItemdeProduto it) {
        for (int i = 0; i < estante.length; i++) {
            if (estante[i] != null && estante[i].verificaItemdeProduto(it)) {
                return true;
            }
        }
        return false;
    }

    public boolean retireItemdeProduto(int codigo, int quantidade) {
        int novaQuantidade;
        for (int i = 0; i < estante.length; i++) {
            if (estante[i] != null && estante[i].getProduto().getCodigo() == codigo) {
                novaQuantidade = estante[i].getQuantidade() - quantidade;
                estante[i].setQuantidade(novaQuantidade);
                return true;
            }
        }
        return false;
    }

    public ItemdeProduto verificaCodigo(int codigo) {
        for (int i = 0; i < estante.length; i++) {
            if (estante[i] != null && estante[i].getProduto().getCodigo() == codigo) {
                return estante[i];
            }
        }
        return null;
    }

}
