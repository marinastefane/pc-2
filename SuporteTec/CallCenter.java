

import java.util.HashSet;
import java.util.Scanner;


public class CallCenter {
    public static void main(String[] args) {
        String problema;
        String resposta;
        
        //aloca as respostas do banco de respostas especificas e padroes
        SuporteTec suporteCliente = new SuporteTec();
        //armazena o metodo interpretar
        Interpretadora interpretadora = new Interpretadora();
        
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de Suporte Tecnico!");
        
        do{
        System.out.println("Pressione enter para continuar ou digite 'sair' para sair do sistema:");
        System.out.println(" ");
        resposta = scanner.nextLine(); //quebra de linha
        if(resposta.equals("sair")){
            
            break;
        }
        else{
            System.out.println("Descreva seu problema:");
            problema = scanner.nextLine();

            interpretadora.interpretar(problema);
            HashSet<String> palavrasChavesUsuario = interpretadora.getPalavraChave();

            String retorno = suporteCliente.SolucaoEspecifica(palavrasChavesUsuario);

            if (retorno != null)
                System.out.println(retorno);
            else
                System.out.println(suporteCliente.SolucaoPadrao());
            }    
        }
    while (true);
    }
 
}
