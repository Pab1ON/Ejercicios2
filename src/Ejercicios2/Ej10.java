package Ejercicios2;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Yan! Ken! Po!\n"
				+ "Opciones:\n"
				+ "1. Piedra\n"
				+ "2. Papel\n"
				+ "3. Tijeras");
		int num=teclado.nextInt();
		int mach= (int) (Math.random()*3)+1;

		
		switch (mach) {
			case 1:
				switch (num) {
					case 1:
						System.out.print("Piedra vs Piedra ¡Empate!");
						break;
					case 2:
						System.out.print("Papel vs Piedra ¡Ganaste!");
						break;
					case 3:
						System.out.print("Tijeras vs Piedra ¡Perdiste!");
						break;
						} break;
				case 2:
					switch (num) {
						case 1:
							System.out.print("Piedra vs Papel ¡Perdiste!");
							break;
						case 2:
							System.out.print("Papel vs Papel ¡Empate!");
							break;
						case 3:
							System.out.print("Tijeras vs Papel ¡Ganaste!");
							break;
						} break;
				case 3:
					switch (num) {
						case 1:
							System.out.print("Piedra vs Tijeras ¡Ganaste!");
							break;
						case 2:
							System.out.print("Papel vs Tijeras ¡Perdiste!");
							break;
						case 3:
							System.out.print("Tijeras vs Tijeras ¡Empate!");
							break;
						} break;
				}
			
		teclado.close();
	}
}
