package servicos;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileApps {

    public TextFileApps() {

    }

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
