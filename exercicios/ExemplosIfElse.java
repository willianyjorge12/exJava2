package exercicios;

import java.util.Scanner;

public class ExemplosIfElse {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = sc.nextInt();
		
		if(numero<10) {
			System.out.println("É menor que 10");
		}else 
		if (numero>10){
			System.out.println("É maior que 10");
		} else{
			System.out.println("É igual 10");
		}

		sc.close();
	}
     
}
