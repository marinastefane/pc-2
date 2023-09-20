
import java.util.HashSet;


public class Interpretadora {
    private HashSet <String> PalavraChave;
    private String[] frase;
    
    //construtor
    public Interpretadora (){
        this.PalavraChave = new HashSet<String>();
    }
    
    //get e set
    public HashSet<String> getPalavraChave() {
        return PalavraChave;
    }

    public void setPalavraChave(HashSet<String> PalavraChave) {
        this.PalavraChave = PalavraChave;
    }
    // INTERPRETAÇÃO
    public void interpretar(String str){
        PalavraChave.clear(); //limpa o ArrayList
        String[] frase = str.split("[,.;] *| +"); //tira (,.; " " // retira repeticoes)
        for(int i = 0; i < frase.length; i++){ //percorre o vetor ate o tamanho i da frase
            PalavraChave.add(frase[i]); //insere no ArrayList frase
        }
    }
}
