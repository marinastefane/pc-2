public class Quadrado extends Forma {

    public Quadrado(Ponto2D[] pontos) {
        super(pontos);
    }

    @Override
    public double calculaArea() {
        double l1 = pontos[0].calculaDistancia(pontos[1]);

        double areaQuadrado = Math.pow(l1, 2);

        return areaQuadrado;
    }

    @Override
    public double calculaPerimetro() {
        double l1 = pontos[0].calculaDistancia(pontos[1]);

        double perimetroQuadrado = 4 * (l1);

        return perimetroQuadrado;
    }

}
