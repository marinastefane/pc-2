public class Titulo extends Conta {

    public Titulo(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    public double getValorAPagar(int diaPag, int mesPag) {

        // verifica se o dia e o mes é menor ou igual ao dia que foi pago
        if (diaPag <= this.dia && mesPag <= this.mes) {
            return this.valor;
        } else { 
            // se o dia e o mes passarem da data de vencimento, calcula o valor da conta * 0,1%
            return this.valor + (this.valor * 0.1);
        }
    }
}
