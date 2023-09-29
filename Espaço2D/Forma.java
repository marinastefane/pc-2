
public abstract class Forma {

    protected Ponto2D[] pontos;

    public Forma(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    public Ponto2D[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto2D[] pontos) {
        this.pontos = pontos;
    }

    public abstract double calculaArea();

    public abstract double calculaPerimetro();

    public static int contaPosicoes(Ponto2D[] pontos) {
        int contador = 0;
        for (Ponto2D ponto : pontos) {
            if (ponto != null) {
                contador++;
            }
        }
        return contador;
    }

    public static Forma criaForma(Ponto2D[] pontos) {
        Forma retorno = null;

        // circulo
        if (pontos != null) {
            if (contaPosicoes(pontos) == 2) {
                if (pontos[0].calculaDistancia(pontos[1]) != 0) {
                    retorno = new Circulo(pontos);
                }
            }

        }
        // triangulo
        if (pontos != null) {
            if (contaPosicoes(pontos) == 3) {
                double d1 = pontos[0].calculaDistancia(pontos[1]);
                double d2 = pontos[1].calculaDistancia(pontos[2]);
                double d3 = pontos[2].calculaDistancia(pontos[0]);

                if (d1 != 0 && d2 != 0 && d3 != 0) {
                    double contador = 0;
                    if ((d1 + d2) > d3) {
                        contador++;
                    }
                    if ((d1 + d3) > d2) {
                        contador++;
                    }
                    if ((d2 + d3) > d1) {
                        contador++;
                    }
                    if (contador == 3) {
                        retorno = new Triangulo(pontos);
                    }
                }
            }

        }
        // quadrado
        if (pontos != null) {
            double d1 = pontos[0].calculaDistancia(pontos[1]);
            double d2 = pontos[1].calculaDistancia(pontos[2]);
            double d3 = pontos[2].calculaDistancia(pontos[3]);
            double d4 = pontos[3].calculaDistancia(pontos[0]);
            if (d1 == d2 && d2 == d3 && d3 == d4) {
                retorno = new Quadrado(pontos);
            }
        }
        return retorno;
    }
}
