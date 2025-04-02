package exercicios;

import java.util.Scanner;

public class VerificarAprovacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota do Aluno (0 a 100):");
		
		int nota = sc.nextInt();
		
		if (nota >= 60) {
			System.out.println("Aprovado");
			
		} else {
			System.out.println("Reprovado");
		}
     sc.close();
	}

}
