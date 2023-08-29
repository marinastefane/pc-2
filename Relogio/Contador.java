package Relogio;

public class Contador {
    private int valor;
    private int limite;

    public Contador() {
        valor = 0;
        limite = 60;
    }
    public Contador(int valor, int limite) {
        this.valor = valor;
        this.limite = limite;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
    public int getLimite() {
        return limite;
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }
    public void contar() {
        valor++;
        if (valor == limite) {
            valor = 0;
        }
    }
}
