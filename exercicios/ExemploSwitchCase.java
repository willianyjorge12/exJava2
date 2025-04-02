package exercicios;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma opção de curso:");
		System.out.println("1- Administração:");
		System.out.println("2- Analise e Desenvolvimento de Sistemas:");
		System.out.println("3- Educação fisica:");
		System.out.println("4- Sair:");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Parabéns, você escolheu o curso de Administração!");
			break;
		case 2:
			System.out.println("Parabéns, você escolheu o curso de Analise e Desenvolvimento de Sistemas!");
			break;
		case 3:
			System.out.println("Parabéns, você escolheu o curso de Analise e Educação Fisica!");
			break;
		case 4:
			System.out.println("Até logo!");
			break;
		default:
			break;
		}
		sc.close();
	}

}
