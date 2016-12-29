/**
 * Muestra el numero al reves del introducido
 * 
 * @author Raul Martin
 */
 
 import java.util.Scanner;
 public class Ejercicio25 {
	 public static void main(String[] args) {
		 Scanner S = new Scanner(System.in);
		 
		int n = 0;
		int i, j;
		System.out.println("Introduzca un numero");
		int numeroIntroducido = S.nextInt();
		 
		n = numeroIntroducido;
		for(i = 1; n > 0; i++){
			n /=  10;
		}
		for(j = 1; j < i; j++){
			n = numeroIntroducido % 10;
			numeroIntroducido /= 10;
			System.out.print(n);
		}
		
		
	}
}
