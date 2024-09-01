package exceptions;


public class NumberNotFoundException extends RuntimeException {
    /**
     * Construtor da exceção que recebe uma mensagem.
     * 
     * @param msg Mensagem de erro a ser exibida.
     */
    public NumberNotFoundException(String msg) {
        super(msg);
    }
}