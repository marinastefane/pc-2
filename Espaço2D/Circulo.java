
public class Circulo extends Forma {

    public Circulo(Ponto2D[] pontos) {
        super(pontos);
    }

    @Override
    public double calculaArea() {
        double raio = pontos[0].calculaDistancia(pontos[1]);

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        return areaCirculo;
    }

    @Override
    public double calculaPerimetro() {
        double raio = pontos[0].calculaDistancia(pontos[1]);

        double perimetroQuadrado = 2 * Math.PI * raio;

        return perimetroQuadrado;
    }
}
