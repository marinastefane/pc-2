package dominio;

public class DecifragemInvalidaException extends Exception {
    public DecifragemInvalidaException() {
        super("Não está correta a decifragem feita!");
    }
}
