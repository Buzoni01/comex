package br.com.comex.main;

import br.com.comex.modelo.ComexExceptionVerificador;
import br.com.comex.modelo.EnumCategStatus;

public class MainTestaExceptionComex {

	public static void main(String[] args) {
// Testa id inválido:
		ComexExceptionVerificador categ1 = new ComexExceptionVerificador(1, "INFORMATICA");
// Testa Categoria Inválida:
//		ComexExceptionVerificador categ1 = new ComexExceptionVerificador(2, "no");
// Testa Categoria ATIVA ou INATIVA:
		ComexExceptionVerificador categ2 = new ComexExceptionVerificador(3, "Livro",EnumCategStatus.INATIVA);

		System.out.println(categ1.toString());

	}
}
