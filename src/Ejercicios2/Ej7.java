package Ejercicios2;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un año:");
		int num=teclado.nextInt();
		

		if (num%4 == 0) {
			if ((num%100 == 0) && (num%400 != 0)) System.out.print("Año sin siestas.");
			else System.out.print("Año de dos siestas.");
		} else System.out.print("Año sin siestas.");
		
		teclado.close();
	}
}
