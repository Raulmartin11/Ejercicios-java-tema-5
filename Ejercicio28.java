/**
 * Escribe un programa que calcule el factorial de un número entero leído por
teclado
* 
* @author Raul Martin
*/
import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String[]args) {
		Scanner S = new Scanner(System.in);
		
		int numeroIntroducido;
		int i = 1;
		int factor = 1;
		
		System.out.print("Introduce un numero para calcular su factorial: ");
		numeroIntroducido = S.nextInt();
		i = numeroIntroducido - 1;
		System.out.print(numeroIntroducido + "! = " + numeroIntroducido);
		while(numeroIntroducido > 1) {
			factor *= numeroIntroducido;
			numeroIntroducido--;
			System.out.print(" * " + numeroIntroducido);
		}
		
		System.out.print(" = " + factor);
	}
}
