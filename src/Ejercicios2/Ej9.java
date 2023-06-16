package Ejercicios2;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuál es el sueldo bruto de Paquito?");
		double sueldo=teclado.nextDouble();
		System.out.println("¿Cuántos hijos tiene Paquito?");
		double hijos=teclado.nextDouble();
		double impuesto=0;
		

		if (sueldo>4600) {
			impuesto=20;
			hijos=hijos*1.5;
			if (hijos>15) hijos=15;			
		} else if (sueldo>3000){
			impuesto=15;
			if (hijos>10) hijos=10;
		} else if (sueldo>1600){
			impuesto=10;
			if (hijos>10) hijos=10;
		} else if (sueldo>1000){
			impuesto=5;
			if (hijos>10) hijos=10;
		};
		
		if (impuesto==0) {System.out.print("No se le aplican impuestos.");		
		} else {
			double resultado=(sueldo*(impuesto/100))-(sueldo*(impuesto/100)*(hijos/100));
			System.out.printf("Paquito tiene que pagar %.2f€ de impuestos, quedándole un sueldo de %.2f€.",resultado,sueldo-resultado);
		};
		
		teclado.close();
	}
}
