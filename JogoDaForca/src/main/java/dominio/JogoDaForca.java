package dominio;

import java.util.ArrayList;
import java.util.Random;
import servicos.TextFileApps;

public class JogoDaForca {

    private ArrayList<String> palavrasDoJogo;
    private String palavra;
    private int Tentativas;
    private boolean venceu;

    public JogoDaForca(ArrayList<String> palavrasDoJogo, String palavra, int Tentativas, boolean venceu) {
        this.palavrasDoJogo = palavrasDoJogo;
        this.palavra = palavra;
        this.Tentativas = Tentativas;
        this.venceu = venceu;
    }

    public JogoDaForca() {
        this.palavrasDoJogo = new ArrayList<>();
        this.palavra = "";
        this.Tentativas = 15;
        this.venceu = false;
    }

    public ArrayList<String> getPalavrasDoJogo() {
        return palavrasDoJogo;
    }

    public void setPalavrasDoJogo(ArrayList<String> palavrasDoJogo) {
        this.palavrasDoJogo = palavrasDoJogo;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getTentativas() {
        return Tentativas;
    }

    public void setTentativas(int Tentativas) {
        this.Tentativas = Tentativas;
    }

    public boolean isVenceu() {
        return venceu;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public boolean verificaFimDeJogo(String palavraCerta) {
        if (this.palavra.toLowerCase().equals(palavraCerta.toLowerCase())) {
            this.venceu = true;
        }
        return venceu;
    }

    public void sorteiaPalavra() {
        //le o arquivo
        this.palavrasDoJogo = TextFileApps.lerArquivo("palavras7letras");
        //gera numeros aleatorios
        Random random = new Random();
        //gera um indice aleatorio ate o tamanho da lista
        int indice = random.nextInt(this.palavrasDoJogo.size());
        //seleciona a palavra
        this.palavra = this.palavrasDoJogo.get(indice);
        //coloca p maiuscula
        this.palavra = this.palavra.toUpperCase();

        System.out.println(this.palavra);
    }

    public int[] verificaLetra(String a) {
        int[] retorno = new int[7];
        boolean achou = false;
        char l = a.toLowerCase().charAt(0);
        for (int i = 0; i < palavra.length(); i++) {
            if (l == palavra.toLowerCase().charAt(i)) {
                retorno[i] = 1;
                achou = true;
            }
        }
        if (!achou) {
            Tentativas--;
        }
        return retorno;
    }
    
}
