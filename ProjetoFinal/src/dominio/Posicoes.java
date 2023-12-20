package dominio;

/**
 *
 * @author Ana Clara Mendonça Franco, Marina Stefane Cândido Delfino, Matheus
 * Santos Barbosa, Pablo Alves Rufino
 */
public class Posicoes {

    private int[] posicoesPalavra1;
    private int[] posicoesPalavra2;

    /**
     * Construtor default
     *
     * @param posicoesPalavra1 - vetor que registra posiçõoes
     * @param posicoesPalavra2 - vetor que registra posiçõoes
     */
    public Posicoes(int[] posicoesPalavra1, int[] posicoesPalavra2) {
        this.posicoesPalavra1 = posicoesPalavra1;
        this.posicoesPalavra2 = posicoesPalavra2;
    }

    /**
     * Construtor que usa o tamanho dos vetores para criá-los
     *
     * @param tamanhoPalavra - registra o tamanho do vetor a ser criado
     * @param tamanhoPalavra2 - registra o tamanho do vetor a ser criado
     */
    public Posicoes(int tamanhoPalavra, int tamanhoPalavra2) {
        this.posicoesPalavra1 = new int[tamanhoPalavra];
        this.posicoesPalavra2 = new int[tamanhoPalavra2];
    }

    public int[] getPosicoesPalavra1() {
        return posicoesPalavra1;
    }

    public void setPosicoesPalavra1(int[] posicoesPalavra1) {
        this.posicoesPalavra1 = posicoesPalavra1;
    }

    public int[] getPosicoesPalavra2() {
        return posicoesPalavra2;
    }

    public void setPosicoesPalavra2(int[] posicoesPalavra2) {
        this.posicoesPalavra2 = posicoesPalavra2;
    }

    /**
     * Insere 1 nas posicoes em que o índice determina
     *
     * @param indice - seleciona em qual posição do arquivo vai ser colocado o
     * número 1
     * @param qualPalavra - seleciona se irá registrar na posicoesPalavra1 ou na
     * posicoesPalavra2
     */
    public void inserePosicao(int indice, int qualPalavra) {
        if (qualPalavra == 1) {
            posicoesPalavra1[indice] = 1;
        }
        if (qualPalavra == 2) {
            posicoesPalavra2[indice] = 1;
        }
    }

    /**
     * Zera todas as posições do vetor selecionado (posicoesPalavra1 ou na
     * posicoesPalavra2)
     *
     * @param qualPalavra - seleciona qual vetor vai ser zerado
     */
    public void apagaPosicoes(int qualPalavra) {
        if (qualPalavra == 1) {
            for (int i = 0; i < posicoesPalavra1.length; i++) {
                posicoesPalavra1[i] = 0;
            }
        }
        if (qualPalavra == 2) {
            for (int i = 0; i < posicoesPalavra2.length; i++) {
                posicoesPalavra2[i] = 0;
            }
        }
    }
}
