package servicos;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ana Clara Mendonça Franco, Marina Stefane Cândido Delfino, Matheus
 * Santos Barbosa, Pablo Alves Rufino
 */
public class TextFileApps {

    /**
     * Construtor vazio
     */
    public TextFileApps() {

    }

    /**
     * Lê as palavras do arquivo selecionado
     *
     * @param nomeArquivo - nome do arquivo selecionado
     * @return retorna um ArrayList de Strings com todas as palavras do arquivo
     * selecionado
     */
    public static ArrayList<String> lerArquivo(String nomeArquivo) {
        ArrayList<String> retorno = new ArrayList<>();
        try {
            Scanner leitor = new Scanner(Paths.get(nomeArquivo));
            while (leitor.hasNext()) {
                retorno.add(leitor.next());
            }
            leitor.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
}
