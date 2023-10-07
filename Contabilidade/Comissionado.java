public class Comissionado extends Empregado {

    protected double valorVendas;

    // contrutor
    public Comissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
        super(nome, sobrenome, numIdent);
        this.valorVendas = valorVendas;
    }

    // get e set
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    // o valor das vendas * 0,6%
    public double getValorAPagar(int diaPag, int mesPag) {
        return valorVendas * 0.6;
    }
}
