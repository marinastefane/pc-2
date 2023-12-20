package dominio;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;
import servicos.TextFileApps;

/**
 * Implementa a lógica dos jogos da forca
 *
 * @author Ana Clara Mendonça Franco, Marina Stefane Cândido Delfino, Matheus
 * Santos Barbosa, Pablo Alves Rufino
 */
public class Jogo {

    private ArrayList<String> palavrasDoJogo;
    private String palavra;
    private String palavra2;
    private int Tentativas;
    private boolean venceu;
    private Posicoes posicoes;

    /**
     * Construtor default
     *
     * @param palavrasDoJogo
     * @param palavra - primeira palavra do jogo
     * @param palavra2 - segunda palavra do jogo
     * @param Tentativas - numero de tentativas que o jogodor tem
     * @param venceu - mostra se a vitoria aconteceu
     * @param posicoes - vetor de posicoes de palavras
     */
    public Jogo(ArrayList<String> palavrasDoJogo, String palavra, String palavra2, int Tentativas, boolean venceu, Posicoes posicoes) {
        this.palavrasDoJogo = palavrasDoJogo;
        this.palavra = palavra;
        this.palavra2 = palavra2;
        this.Tentativas = Tentativas;
        this.venceu = venceu;
        this.posicoes = posicoes;
    }

    /**
     * Construtor especializado para as diferentes dificuldades de jogo
     *
     * @param palavra2 - segunda palavra do jogo
     * @param Tentativas - numero de tentativas que o jogodor tem
     * @param tamanhoPalavra - define o tamanho do vetor
     * @param tamanhoPalavra2 - define o tamanho do vetor
     */
    public Jogo(String palavra2, int Tentativas, int tamanhoPalavra, int tamanhoPalavra2) {
        this.palavrasDoJogo = new ArrayList<>();
        this.palavra = "";
        this.palavra2 = palavra2;
        this.Tentativas = Tentativas;
        this.venceu = false;
        this.posicoes = new Posicoes(tamanhoPalavra, tamanhoPalavra2);
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

    public String getPalavra2() {
        return palavra2;
    }

    public void setPalavra2(String palavra2) {
        this.palavra2 = palavra2;
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

    public Posicoes getPosicoes() {
        return posicoes;
    }

    public void setPosicoes(Posicoes posicoes) {
        this.posicoes = posicoes;
    }

    /**
     * Verifica se a condicao para a vitória do jogador ocorreu
     *
     * @param palavraCerta
     * @return boolean e indica se a pessoa venceu (true)
     */
    public boolean verificaFimDeJogo(String palavraCerta) {
        if (this.palavra.toLowerCase().equals(palavraCerta.toLowerCase()) && this.palavra2.toLowerCase().equals(palavraCerta.toLowerCase())) {
            this.venceu = true;
        }
        return venceu;
    }

    /**
     * Serve para tirar os acentos das palavras do arquivo
     *
     * @param str - entra com a palavra com acento
     * @return - palavra sem acento
     */
    public static String tiraacento(String str) {

        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        return pattern.matcher(nfdNormalizedString).replaceAll("");

    }

    /**
     * Sorteia uma palavra aleatória do arquivo
     *
     * @param nome - nome do arquivo desejado
     * @param num - seleciana se palavra1 ou palavra2 que vai receber a palavra
     * aleatória
     */
    public void sorteiaPalavra(String nome, int num) {
        //le o arquivo
        this.palavrasDoJogo = TextFileApps.lerArquivo(nome);
        //gera numeros aleatorios
        Random random = new Random();
        //gera um indice aleatorio ate o tamanho da lista
        int indice = random.nextInt(this.palavrasDoJogo.size());

        if (num == 1) {
            //seleciona a palavra
            this.palavra = this.palavrasDoJogo.get(indice);
            //coloca p maiuscula
            this.palavra = this.palavra.toUpperCase();
            this.palavra = tiraacento(this.palavra);

        }
        if (num == 2) {
            //seleciona a palavra
            this.palavra2 = this.palavrasDoJogo.get(indice);
            //coloca p maiuscula
            this.palavra2 = this.palavra2.toUpperCase();
            this.palavra2 = tiraacento(this.palavra2);
        }

        System.out.println("Palavra 1: " + this.palavra);
        System.out.println("Palavra 2: " + this.palavra2);
    }

    /**
     * Verifica se a letra está em alguma das palavras
     *
     * @param letra - letra a ser verificada
     */
    public void verificaLetra(String letra) {
        boolean achou = false;
        boolean achou2 = false;

        char l = letra.toLowerCase().charAt(0);

        if (palavra2 == null) {
            for (int i = 0; i < palavra.length(); i++) {
                if (l == palavra.toLowerCase().charAt(i)) {
                    posicoes.inserePosicao(i, 1);
                    achou = true;
                }
            }
            if (!achou) {
                Tentativas--;
            }
        } else {
            for (int i = 0; i < palavra.length(); i++) {
                if (l == palavra.toLowerCase().charAt(i)) {
                    posicoes.inserePosicao(i, 1);
                    achou = true;
                }
            }
            for (int j = 0; j < palavra2.length(); j++) {
                if (l == palavra2.toLowerCase().charAt(j)) {
                    posicoes.inserePosicao(j, 2);
                    achou2 = true;
                }
            }
            if (!achou && !achou2) {
                Tentativas--;
            }
        }
    }

}
