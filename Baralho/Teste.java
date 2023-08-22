package Baralho;

public class Teste {
    public static void main(String[] args) {
        Cartas carta1 = new Cartas();
        carta1.setValor(9);
        carta1.setNaipe("Espadas");

        Cartas carta2 = new Cartas(6, "Paus");
        Cartas carta3 = new Cartas(8, "Copas");
        Cartas carta4 = new Cartas(10, "Copas");
        
        System.out.println("Carta 1 comparada com a carta 2: ");
        System.out.println(carta1.comparaValor(carta2));
        System.out.println(carta1.comparaNaipe(carta2));
        System.out.println("Carta 3 comparada com a carta 4: ");
        System.out.println(carta3.comparaValor(carta4));
        System.out.println(carta3.comparaNaipe(carta4));

    }
}
