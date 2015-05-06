package ocp;

public class Frete {

	public double para(String cidade) {
		if("RIO DE JANEIRO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30; }

}
