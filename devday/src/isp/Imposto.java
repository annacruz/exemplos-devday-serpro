package isp;

public interface Imposto {
	NotaFiscal geraNota();
	double imposto(double valorCheio);
}
