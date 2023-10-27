public class Modalidade {
    
    private String nome;
    private String dia;
    private String hora;

    public Modalidade(String nome, String dia, String hora) {
        this.nome = nome;
        this.dia = dia;
        this.hora = hora;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
