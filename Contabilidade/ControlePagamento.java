import java.util.ArrayList;

public class ControlePagamento {

    private ArrayList<Passivo> pagamentos;

    // contrutores
    public ArrayList<Passivo> getPagamentos() {
        return pagamentos;
    }

    public ControlePagamento() {
        this.pagamentos = new ArrayList<Passivo>();
    }

    // get e set
    public void setPagamentos(ArrayList<Passivo> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public void adicionaPagamentos(Passivo pagamento) {
        this.pagamentos.add(pagamento);
    }

    public double controleContas() {
        double totalContas = 0;
        // percorre um array de pagamentos
        for (Passivo pagarContas : pagamentos) {
            // verifica se é uma conta
            if (pagarContas instanceof Conta) {
                // verifica se é um titulo e calcula o valor
                if (pagarContas instanceof Titulo) {
                    totalContas += ((Titulo) pagarContas).getValorAPagar(0, 0);
                    // verifica se é uma concessionaria e calcula o valor
                } else {
                    totalContas += ((Concessionaria) pagarContas).getValorAPagar(0, 0);

                }
            }
        }
        // retorna o valor total
        return totalContas;
    }

    public double controleFuncionarios() {
        double totalFunc = 0;
        // percorre um array de pagamentos
        for (Passivo pagarFunc : pagamentos) {
            // verifica se é um assalariado e calcula o valor a pagar
            if (pagarFunc instanceof Assalariado) {
                totalFunc += ((Assalariado) pagarFunc).getValorAPagar(0, 0);
                // verifica se é um terceirizado e calcula o valor a pagar
            } else if (pagarFunc instanceof Terceirizado) {
                totalFunc += ((Terceirizado) pagarFunc).getValorAPagar(0, 0);
            } // verifica se é um comissionado e calcula o valor a pagar
            else if (pagarFunc instanceof Comissionado) {
                totalFunc += ((Comissionado) pagarFunc).getValorAPagar(0, 0);
                // verifica se é um assalariadoComissionado e calcula o valor a pagar
            } else if (pagarFunc instanceof AssalariadoComissionado) {
                totalFunc += ((AssalariadoComissionado) pagarFunc).getValorAPagar(0, 0);
            }
        }
        // retorna o valor total
        return totalFunc;
    }

    public double controlePagTotal() {
        // retorna o pagamento total da empresa
        return controleContas() + controleFuncionarios();
    }
}
