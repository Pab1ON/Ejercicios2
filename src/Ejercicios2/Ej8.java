package Ejercicios2;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el cálculo separado por espacios:\n"
				+ "Valores para el operador:\n"
				+ "suma\n"
				+ "resta\n"
				+ "multiplica\n"
				+ "divide\n"
				+ "raiz\n"
				+ "eleva");
		double num1=teclado.nextDouble();
		String calc=teclado.next();
		double num2=teclado.nextDouble();
		double res = Double.NaN;
		
		
		switch (calc) {
			case "suma":
				res=num1+num2;
				break;
			case "resta":
				res=num1-num2;
				break;
			case "multiplca":
				res=num1*num2;
				break;
			case "divide":
				res=num1/num2;
				break;
			case "raiz":
				res=Math.sqrt(num1);
				break;
			case "eleva":
				res=Math.pow(num1, num2);
				break;
			default:
				System.out.println("ERROR: Operador incorrecto");
				teclado.close();
				return;
		};
		
		if (Double.isNaN(res)) {
			System.out.print("ERROR");
		} else {
			System.out.print(res);
		};
		
		teclado.close();
	}
}
