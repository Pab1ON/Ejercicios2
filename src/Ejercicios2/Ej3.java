package Ejercicios2;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tres números");
		float num1=teclado.nextFloat(),num2=teclado.nextFloat(),num3=teclado.nextFloat();

		if (num1==num2 || num1==num3 || num2==num3){System.out.print("Hay números repetidos");}
		else if ((num2<num1 && num1<num3) || (num2>num1 && num1>num3)) {System.out.print(num1+" es el de en medio");}
		else if ((num1<num2 && num2<num3) || (num1>num2 && num2>num3)) {System.out.print(num2+" es el de en medio");}
		else if ((num1<num3 && num3<num2) || (num1>num3 && num3>num2)) {System.out.print(num3+" es el de en medio");}
		teclado.close();
	}
}