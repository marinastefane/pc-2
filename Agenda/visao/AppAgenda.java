package visao;

import java.util.ArrayList;

import negocio.Agenda;
import negocio.Contato;
import negocio.ContatoInexistenteException;
import servicos.ManArqTexto;

public class AppAgenda {
    public static void main(String[] args) throws ContatoInexistenteException {

        Agenda AgendaPessoal = new Agenda();

        ManArqTexto man = new ManArqTexto("AgendaPessoal.txt");

        Contato contato1 = new Contato("German Cano", "11111-1111", "fazoL@gmail.com", "Maracana");
        Contato contato2 = new Contato("Givanildo Hulk", "22222-2222", "hulkhulkhulk@gmail.com", "Arena MRV");

        AgendaPessoal.incluirContato(contato1);
        AgendaPessoal.incluirContato(contato2);

        man.abrirArquivoParaGravacao();
        man.gravarArquivo(AgendaPessoal.getContatos());

        man.abrirArquivoLeitura();
        ArrayList<Contato> conts = man.lerArquivo();
        for (Contato aux : conts) {
            System.out.println("Nome: " + aux.getNome() + " - Telefone: " + aux.getTelefone() + " - Email: "
                    + aux.getEmail() + " - Endereco: " + aux.getEndereco());
        }

        AgendaPessoal.existeContato("Guilherme Arana ");
    }

}
