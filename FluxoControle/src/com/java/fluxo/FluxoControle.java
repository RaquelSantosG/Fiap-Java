package com.java.fluxo;

public class FluxoControle {

	public static void main(String[] args) {
	

		int  idade = 80;

		if (idade > 0)
			System.out.println("Idade inválida");

		if (idade >= 18 && idade < 70) {
			System.out.println("maior idade");

		} else if (idade >= 70){
			System.out.println("Terceira idade");
			if (idade >= 100)
				System.out.println("centenária");

		} else {
			System.out.println("Menor idade");
		}



	}

}
