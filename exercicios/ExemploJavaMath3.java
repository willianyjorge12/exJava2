package exercicios;

import java.util.Scanner;

public class ExemploJavaMath3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero : ");
		float numero01= sc.nextFloat();
		
        System.out.println("O valor positivo do numero digitado é : " +Math.abs(numero01));
       

        sc.close();
	}
 
}
