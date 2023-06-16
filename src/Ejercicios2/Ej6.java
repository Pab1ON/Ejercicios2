package Ejercicios2;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce los parametros a b c de la primera recta:");
		double a1=teclado.nextDouble();
		double b1=teclado.nextDouble();
		double c1=teclado.nextDouble();
		
		System.out.println("Introduce los parametros a b c de la segunda recta:");
		double a2=teclado.nextDouble();
		double b2=teclado.nextDouble();
		double c2=teclado.nextDouble();
		

		if (a1/a2 != b1/b2) {
			if (a1/b1 == -b2/a2) System.out.print("Rectas perpendiculares.");
			else System.out.print("Rectas secantes.");
		} else {
			if ((a1/a2 == b1/b2) && (a1/a2 == c1/c2)) System.out.print("Rectas coincidentes.");
			else System.out.print("Rectas paralelas.");
		};
		
		teclado.close();
	}
}
