import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de pontos: ");
        int quantidade = entrada.nextInt();

        Ponto2D[] pontos = new Ponto2D[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o valor de x do ponto: " + (i + 1));
            double px = entrada.nextDouble();

            System.out.println("Digite o valor de y do ponto: " + (i + 1));
            double py = entrada.nextDouble();

            pontos[i] = new Ponto2D(px, py);

        }
        Espaco2D espaco = new Espaco2D();

        espaco.adicionaForma(espaco.criaForma(pontos));

        System.out.println("\n" + "area " + espaco.areaTotal());
        System.out.println("perimetro " + espaco.perimetroTotal());

        entrada.close();
    }
}
