package exercicios;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero correspondente ao mes do ano:");
		int mesesdoAno = sc.nextInt();
		switch (mesesdoAno) {
		
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("junho");
			break;
		case 7:
			System.out.println("julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default: System.out.println("Opção invalida");
			break;
			}

		sc.close();
	}
}
