package exercicios;

import java.util.Scanner;

public class ExemploJavaRamdon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int randomNum = (int) (Math.random() * 101);
		System.out.println(randomNum);

	}

}
