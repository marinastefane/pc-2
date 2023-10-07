public class Assalariado extends Empregado {

    private double horasExtras;

    // contrustor
    public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras) {
        super(nome, sobrenome, numIdent);
        this.horasExtras = horasExtras;
    }

    // get e set
    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    // o salario + horas extras * a quantidade de horas do funcionario
    public double getValorAPagar(int diaPag, int mesPag) {
        return Passivo.Salario + Passivo.Hora * horasExtras;
    }
}
