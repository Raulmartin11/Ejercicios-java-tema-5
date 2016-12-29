/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.
* 
* @author Raul Martin
*/
import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String[]args) {
		Scanner S = new Scanner(System.in);
		
		int numeroIntroducido;
		int cuenta = 0;
		int suma = 0;
		int i;
		
		System.out.print("Introduce un numero: ");
		numeroIntroducido = S.nextInt();
		
		System.out.print("Los multiplos de 3 entre el 1 y el " + numeroIntroducido + " son: ");
		for(i = 3; i < numeroIntroducido; i+=3) {
			System.out.print(i + ", ");
			
			suma += i;
			cuenta ++;
		}
		System.out.println();
		System.out.println("La suma de estos es igual a: " + suma);
		System.out.print("En total son: " + cuenta + " multiplos de 3");
		
		
	}
}
