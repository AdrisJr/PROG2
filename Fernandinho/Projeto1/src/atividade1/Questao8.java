package atividade1;

import java.util.Scanner;

public class Questao8 {
	public static void main(String[] args) {
		String nome, sobrenome, nomeCompleto;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		sobrenome = teclado.nextLine();
		
		nomeCompleto = nome.concat(" "+sobrenome);
		
		System.out.println(nomeCompleto);
		System.out.println(nomeCompleto.length());
		
		
		
		System.out.printf("%s, %s.%n",sobrenome.toUpperCase(), nome.toUpperCase().charAt(0)+nome.toLowerCase().substring(1));
		
		
		teclado.close();
	}
}
