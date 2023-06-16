package Ejercicios2;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce los tres lados del triángulo");
		int num1=teclado.nextInt(),num2=teclado.nextInt(),num3=teclado.nextInt();

		if ((num1+num2>num3) && (num1+num3>num2) && (num2+num3>num1)){System.out.print("Ese triángulo existe");}
		else {System.out.print("Ese triángulo no existe");}
		teclado.close();
	}
}
