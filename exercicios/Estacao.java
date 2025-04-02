package exercicios;

import java.util.Scanner;

public class Estacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Estações do Ano:");
		System.out.println("1-Verão");
		System.out.println("2-Outono");
		System.out.println("3-Inverno");
		System.out.println("4-Primavera");		
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("A estação selecionada é verão");
			break;
		case 2:
			System.out.println("A estação selecionada é Outono");
			break;
		case 3:
			System.out.println("A estação selecionada é Inverno");
			break;
		case 4:
			System.out.println("A estação selecionada é Primavera");
			break;

		default:
			System.out.println("Não existe estação do ano correspondente a esse numero:");
			break;
	
			
		}
		sc.close();

	}

}
