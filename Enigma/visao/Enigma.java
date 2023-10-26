package visao;

import dominio.Chave;
import dominio.CifraDeCesar;
import dominio.DecifragemInvalidaException;
import java.util.Scanner;

public class Enigma {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o deslocamento da Cifra de Cesar: ");
        int deslocamento = s.nextInt();

        Chave chave = new Chave(deslocamento);
        
        CifraDeCesar cdc = new CifraDeCesar(chave);
        
        System.out.println("Informe a mensagem a ser cifrada");
        String mensagem = s.nextLine();

        String menCrifrada = cdc.cifrar(mensagem);

        System.out.print("Essa é a mensagem cifrada    ");
        System.out.println(menCrifrada);

        System.out.println("Tente decifrá-la");
        String tentativa = s.nextLine();

        try {  
            String menDecifrada = cdc.decifrar(tentativa);
            System.out.println("Mensagem decifrada: " + menDecifrada);
            
        } catch (DecifragemInvalidaException ex) {
            System.err.print(ex.getMessage());
        }
    }

}
