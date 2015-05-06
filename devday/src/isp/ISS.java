package isp;

public class ISS implements Imposto{
    
	public double imposto(double valorCheio) {
        return 0.1 * valorCheio;
    }
    public NotaFiscal geraNota() {
        return new NotaFiscal("Loja do zé", "Rua das pedras, 175"); 
    }
}
