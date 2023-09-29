public class Triangulo extends Forma {

    public Triangulo(Ponto2D[] pontos) {
        super(pontos);
    }

    @Override
    public double calculaArea() {
        double l1 = pontos[0].calculaDistancia(pontos[1]);
        double l2 = pontos[1].calculaDistancia(pontos[2]);
        double l3 = pontos[2].calculaDistancia(pontos[0]);

        double semiPerimetro = (l1 + l2 + l3) / 2;
        double areaTriangulo = Math
                .sqrt(semiPerimetro * (semiPerimetro - l1) * (semiPerimetro - l2) * (semiPerimetro - l3));

        return areaTriangulo;
    }

    @Override
    public double calculaPerimetro() {
        double l1 = pontos[0].calculaDistancia(pontos[1]);
        double l2 = pontos[1].calculaDistancia(pontos[2]);
        double l3 = pontos[2].calculaDistancia(pontos[0]);

        double perimetroTriangulo = l1 + l2 + l3;

        return perimetroTriangulo;
    }

    public String tipoTriangulo() {
        double l1 = pontos[0].calculaDistancia(pontos[1]);
        double l2 = pontos[1].calculaDistancia(pontos[2]);
        double l3 = pontos[2].calculaDistancia(pontos[0]);

        if (l1 == l2 && l2 == l3 && l1 == l3) {
            return "Equilatero";
        }
        if (l1 == l2 || l2 == l3 || l1 == l3) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }

}
