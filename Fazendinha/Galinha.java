package fazenda;

public class Galinha{

    private String nome;
    private String corPelo;
    private double consumo;
    private double ovosB;

    public Galinha(){
        this.nome = "";
        this.corPelo = "";
        this.consumo = 0;
        this.ovosB = 0;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
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

    public double getOvosB() {
        return ovosB;
    }

    public void setOvosB(double ovosB) {
        this.ovosB = ovosB;
    }




}