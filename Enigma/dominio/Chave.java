package dominio;

public class Chave {
    private int deslocamento;
    private String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","w","z"};

    public Chave(int deslocamento) {
        this.deslocamento = deslocamento;
    }
    
    public int getDeslocamento() {
        return deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public String[] getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(String[] alfabeto) {
        this.alfabeto = alfabeto;
    }
    
    public String cifraLetra(String letra){
        String retorno = null;
        for(int i = 0; i < alfabeto.length; i++){
            if (letra.equals(alfabeto[i])){
                retorno = alfabeto[(i+deslocamento)%alfabeto.length];
            }
        }
        return retorno;
    }
    
    public String decifraLetra(String letra){
        String retorno = null;
        for(int i = 0; i < alfabeto.length; i++){
            if (letra.equals(alfabeto[i])){
                retorno = alfabeto[(i-deslocamento)%alfabeto.length];
            }
        }
        return retorno;
    }
    
}
