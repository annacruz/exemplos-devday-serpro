package lsp.banco;

public class ContaNaoRendeException extends Exception {
	private static final long serialVersionUID = 1L;

	public ContaNaoRendeException() {
		System.out.println("Um Valor inválido foi inserido");
	}

    public ContaNaoRendeException(String message){
       super(message);
    }
}
