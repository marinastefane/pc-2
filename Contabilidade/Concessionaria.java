public class Concessionaria extends Conta {

    //contrutor
    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }
    
    //valor a pagar
    public double getValorAPagar(int diaPag, int mesPag) {
        return this.valor;
    }
}
