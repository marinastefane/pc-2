public class AssalariadoComissionado extends Comissionado {

    private double percentualBonus;

    // contrutor
    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas,
            double percentualBonus) {
        super(nome, sobrenome, numIdent, valorVendas);
        this.percentualBonus = percentualBonus;
    }

    // get e set
    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    // o salario + 10% + valor das vendas * 0,6%
    public double getValorAPagar(int diaPag, int mesPag) {
        return Passivo.Salario + Passivo.Salario * 0.1 + valorVendas * 0.6;
    }
}
