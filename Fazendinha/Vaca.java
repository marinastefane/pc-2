package fazenda;

public class Vaca{

    private String nome;
    private String corPelo;
    private double consumo;
    private String leite;

    public Vaca(){
        this.nome = "";
        this.corPelo = "";
        this.consumo = 0;
        this.leite = "";
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

    public String getLeite() {
        return leite;
    }

    public void setLeite(String leite) {
        this.leite = leite;
    }




}