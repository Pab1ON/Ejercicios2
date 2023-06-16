package Ejercicios2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tres números");
		int num1=teclado.nextInt(),num2=teclado.nextInt(),num3=teclado.nextInt();

		if (num1==num2 || num1==num3 || num2==num3){System.out.print("Hay números repetidos");}
		else if (num1>num2 && num1>num3) {System.out.print(num1+" es el mayor");}
		else if (num1<num2 && num3<num2){System.out.print(num2+" es el mayor");}
		else if (num3>num1 && num3>num2){System.out.print(num3+" es el mayor");}
		teclado.close();
	}
}