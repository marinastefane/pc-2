public class SistemaPagamentoTeste {
    public static void main(String[] args) {

        // novo controlepagamento
        ControlePagamento controlePagamento = new ControlePagamento();

        // novos empregados com parametros definidos
        Empregado Assalariado = new Assalariado("Frederico", "Julio", 59, 12);
        Empregado Comissionado = new Comissionado("Raissa", "Vitoria", 65, 27222);
        Empregado Terceirizado = new Terceirizado("Jorge", "Sampaoli", 87, 200);
        Empregado AssalariadoComissionado = new AssalariadoComissionado("Milena", "Santos", 77, 26000, 0.6);
        
        // contas com paramentros definidos
        Conta Concessionaria = new Concessionaria(05, 10, 5000);
        Conta Titulo = new Titulo(15, 9, 1500);

        // adiciona empregados e contas no array pagamentos
        controlePagamento.adicionaPagamentos(Assalariado);
        controlePagamento.adicionaPagamentos(Comissionado);
        controlePagamento.adicionaPagamentos(Terceirizado);
        controlePagamento.adicionaPagamentos(AssalariadoComissionado);
        controlePagamento.adicionaPagamentos(Concessionaria);
        controlePagamento.adicionaPagamentos(Titulo);
        
        // prints
        System.out.println("Total a pagar aos funcionarios: " + controlePagamento.controleFuncionarios());
        System.out.println("Total a pagar de contas: " + controlePagamento.controleContas());
        System.out.println("Total a pagar: " + controlePagamento.controlePagTotal());

    }
}
