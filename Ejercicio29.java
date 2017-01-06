/**
 * Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.
* 
* @author Raul Martin
*/

import java.util.Scanner;
public class Ejercicio29 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int i = 0;
		boolean pinta = true;
		
		System.out.print("Introduce el numero limite: ");
		int tope = S.nextInt();
		
		System.out.print("Introduce un numero (menor al limite): ");
		int divisor = S.nextInt();
		
		for(i = 1; i < tope; i++) {
			if(i % divisor == 0) {
				pinta = false;
			}
			if(pinta) {
				System.out.print(i + " ");
			}
			pinta = true;
		}
		
	}
}
			
