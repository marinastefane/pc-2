
import java.util.ArrayList;

public class Espaco2D {

    private ArrayList<Forma> formas;

    public Espaco2D() {
        formas = new ArrayList<>();
    }

    public Espaco2D(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }

    public Forma criaForma(Ponto2D[] pontos) {
        return Forma.criaForma(pontos);
    }

    public void adicionaForma(Forma forma) {
        formas.add(forma);
    }

    public double areaTotal() {
        double total = 0;
        for (Forma areaForma : formas) {
            if (areaForma instanceof Quadrado quadrado) {
                total = total + quadrado.calculaArea();
            } else if (areaForma instanceof Circulo circulo) {
                total = total + circulo.calculaArea();
            } else if (areaForma instanceof Triangulo triangulo) {
                total = total + triangulo.calculaArea();
            }
        }
        return total;
    }

    public double perimetroTotal() {
        double ptotal = 0;
        for (Forma periForma : formas) {
            if (periForma instanceof Quadrado quadrado) {
                ptotal = ptotal + quadrado.calculaPerimetro();
            } else if (periForma instanceof Circulo circulo) {
                ptotal = ptotal + circulo.calculaPerimetro();
            } else if (periForma instanceof Triangulo triangulo) {
                ptotal = ptotal + triangulo.calculaPerimetro();
            }
        }
        return ptotal;
    }

    public String tipoTriangulo() {
        String tipo = "";

        for (Forma tipoT : formas) {
            if (tipoT instanceof Triangulo) {
                tipo = ((Triangulo) tipoT).tipoTriangulo();
            }
        }
        return tipo;
    }
}
