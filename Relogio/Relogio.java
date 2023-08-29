package Relogio;

public class Relogio {
    private Contador hora;
    private Contador minuto;
    private boolean displayFormatado;


    public Relogio(){
        this.hora = new Contador(0,24);
        this.minuto = new Contador(0,60);
        this.displayFormatado = true;

    }
    public void setHora (Contador hora){
        this.hora = hora;
    }
    public Contador getHora(){
        return hora;
    }
    public Contador getMinuto() {
        return minuto;
    }
    public void setMinuto(Contador minuto) {
        this.minuto = minuto;
    }
    public boolean getDisplayFormatado() {
        return displayFormatado;
    }
    public void setDisplayFormatado(boolean displayFormatado) {
        this.displayFormatado = displayFormatado;
    }
    public void ticTac(){
        minuto.contar();
        if(minuto.getValor() == 0){
            hora.contar();
        }
    }
    public String mostrarHora(){
        
        String retorno = "";

        if (displayFormatado) {
            retorno = hora.getValor()%12+":"+minuto.getValor();
            if(hora.getValor()>=12) {
                retorno=retorno+" p.m";
                
            }
            else
                retorno = retorno + " a.m";
                
        } 
            return retorno;
    }
}
