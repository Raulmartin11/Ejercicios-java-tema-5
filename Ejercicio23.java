/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
* 
* @author Raul Martin
*/
import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		
		int numero,suma,n = 0;
		
		Scanner S = new Scanner(System.in);
		
		System.out.print("Introduce numeros hasta que la suma supere 10000: ");
		
		
		for(suma = 0; suma <= 10000; suma+= numero) {
			numero = S.nextInt();
			n++;
		}
		System.out.print("Numeros introducidos: "+ n +"\nSuma total: " + suma);
	}
}
