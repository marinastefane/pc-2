package fazenda;

public class Cavalo{

    private String nome;
    private String corPelo;
    private double consumo;
    private double peso;

    public Cavalo(){
        this.nome = "";
        this.corPelo = "";
        this.consumo = 0;
        this.peso = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
