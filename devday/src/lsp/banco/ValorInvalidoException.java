package lsp.banco;

public class ValorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ValorInvalidoException() {
		System.out.println("Um Valor inválido foi inserido");
	}

    public ValorInvalidoException(String message){
       super(message);
    }
}
