package Baralho;

public class Cartas {
    private int valor;
    private String naipe;

    public Cartas(){
        this.valor = 0;
        this.naipe = "";

    }

    public Cartas (int valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    public void setValor (int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int comparaValor (Cartas cartaComparada){
        if (this.valor > cartaComparada.getValor()) {
            return 1;
        }
        else if (this.valor < cartaComparada.getValor()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    public int comparaNaipe (Cartas cartaComparada){
        if (this.naipe.equals(cartaComparada.naipe) == true) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
