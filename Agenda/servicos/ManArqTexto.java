package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import negocio.Contato;

public class ManArqTexto {
    private String arquivo;
    private Formatter gravador;
    private Scanner leitor;

    public ManArqTexto(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public void abrirArquivoParaGravacao() {
        try {
            gravador = new Formatter(arquivo);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        }
    }

    public void gravarArquivo(HashMap<String, Contato> contatos) {

        Set<String> chaves = contatos.keySet();

        for (String k : chaves) {
            Contato contato = contatos.get(k);
            gravador.format("%s;%s;%s;%s\n",
                    contato.getNome(),
                    contato.getTelefone(),
                    contato.getEmail(),
                    contato.getEndereco());
        }
        fecharArquivoGravacao();

    }

    public void fecharArquivoGravacao() {
        gravador.close();
    }

    public void abrirArquivoLeitura() {
        try {
            leitor = new Scanner(new File(arquivo));
        } catch (FileNotFoundException ex) {
            System.err.print("O arquivo " + arquivo + " nao pode ser aberto!");
        }
    }

    public ArrayList<Contato> lerArquivo() {
        ArrayList<Contato> retorno = new ArrayList<>();

        while (leitor.hasNext()) {
            String[] txt = leitor.nextLine().split(";");
            Contato aux = new Contato(txt[0], txt[1], txt[2], txt[3]);
            retorno.add(aux);
        }
        fecharArquivoLeitura();
        return retorno;
    }

    public void fecharArquivoLeitura() {
        if (leitor != null) {
            leitor.close();
        }
    }

}
