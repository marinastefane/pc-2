package dominio;

public class CifraDeCesar {
    private Chave chave;

    public CifraDeCesar(Chave chave) {
        this.chave = chave;
    }

    public String cifrar(String mensagem) {
        String retorno = null;

        return retorno;
    }

    public String decifrar(String mensagem) throws DecifragemInvalidaException {
        String retorno = null;
        boolean decifrou = false;
        if (!decifrou) {
            throw new DecifragemInvalidaException();
        }

        return retorno;
    }
}
