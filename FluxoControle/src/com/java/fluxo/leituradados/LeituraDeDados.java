package com.java.fluxo.leituradados;

import java.util.Scanner;

public class LeituraDeDados {
	
	public static void main(String[] args) {
	
	int  idade = 0;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite a nome: ");
	String nome = sc.nextLine();
	
	System.out.println("Digite a idade: ");
	idade = sc.nextInt();

	if (idade < 0)
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


