/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.
* 
* @author Raul Martin
*/
import java.util.Scanner;
public class Ejercicio26 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int numeroIntroducido;
		int n = 0;
		int digitoIntroducido;
		int i, j;
		
		System.out.print("Introduce un numero: ");
		numeroIntroducido = S.nextInt();
		
		System.out.print("Introduce un digito que este en el numero anterior: ");
		digitoIntroducido = S.nextInt();
		
		n = numeroIntroducido;
		for(i = 0; n > 0; i++){
			n /= 10;
		}
		for(j = 0; j < i; j++) {
			n = numeroIntroducido % 10;
			numeroIntroducido /= 10;
			if(n == digitoIntroducido) {
				System.out.println("El digito esta en la posicion " + (i - j));
			}
		}
		
		
	}
}
