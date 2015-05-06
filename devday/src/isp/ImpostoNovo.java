package isp;

public class ImpostoNovo implements Imposto{
	
	public double imposto(double valorCheio) {
		return 0.2 * valorCheio;
	}
	public NotaFiscal geraNota() {
		return null;
	}
}
