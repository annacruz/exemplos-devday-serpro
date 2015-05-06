package lsp.banco;

import java.util.ArrayList;

public class ProcessadorDeInvestimentos {
	private static ArrayList<ContaComum> contasDoBanco() {
		return null;
	}

	public static void main(String[] args){
		for (ContaComum conta : contasDoBanco()) {
		    conta.rende();
		    System.out.println("Novo Saldo:");
		    System.out.println(conta.getSaldo());
		}
	}
	
}
