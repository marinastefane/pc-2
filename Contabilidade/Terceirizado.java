public class Terceirizado extends Empregado {

    private double horasTrabalhadas;

    // contrutor
    public Terceirizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // get e set
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // horas trabalhadas
    public double getValorAPagar(int diaPag, int mesPag) {
        return Passivo.Hora * horasTrabalhadas;
    }

}
