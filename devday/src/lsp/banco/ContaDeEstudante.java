package lsp.banco;

public class ContaDeEstudante extends ContaComum{
	public void rende()  {
        try {
			throw new ContaNaoRendeException();
		} catch (ContaNaoRendeException e) {
			e.printStackTrace();
		}
	}
}
