package Ejercicios2;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la primera casilla (separando letra y número por espacio o intro):");
		char letra1=teclado.next().charAt(0);
		int fila1=teclado.nextInt();
		
		System.out.println("Introduce la segunda casilla (separando letra y número por espacio o intro):");
		char letra2=teclado.next().charAt(0);
		int fila2=teclado.nextInt();
		
		int col1=(Character.toUpperCase(letra1)-'A')+1;
		int col2=(Character.toUpperCase(letra2)-'A')+1;

		if (fila1>8 || fila2>8 || fila1<1 || fila2<1 || col1>8 || col2>8 || col1<1 || col2<1) {System.out.print("ERROR: Están fuera del tablero.");}
		else if ((fila1==fila2) && (letra1==letra2)) {System.out.print("ERROR: Ambas son la misma casilla");}
		else if (fila1==fila2) {System.out.print("Están en la misma fila.");}
		else if (letra1==letra2) {System.out.print("Están en la misma columna.");}
		else if (Math.abs(fila1-fila2) == Math.abs(col1-col2)) {System.out.print("Están en la misma diagonal.");}
		else {System.out.print("No tienen coincidencias.");}
		
		teclado.close();
	}
}
