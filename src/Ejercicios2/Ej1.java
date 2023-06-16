package Ejercicios2;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce dos números");
		int num1=teclado.nextInt(),num2=teclado.nextInt();

		if (num1>num2) {System.out.print(num1+" es mayor");}
		else if (num1<num2){System.out.print(num2+" es mayor");}
		else if (num1==num2) {System.out.print("Ambos son iguales");}
		teclado.close();
	}
}
