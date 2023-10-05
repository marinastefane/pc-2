
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

            total = total + areaForma.calculaArea();

        }
        return total;
    }

    public double perimetroTotal() {
        double ptotal = 0;
        for (Forma periForma : formas) {

            ptotal = ptotal + periForma.calculaPerimetro();

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
