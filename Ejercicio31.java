/**
 * Pinta por pantalla una L en la que introduce la altura y el ancho es la mitad
 * 
 * @author Raul Martin
 */
import java.util.Scanner;
public class Ejercicio31 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = 0;
		int ancho = 0;
		System.out.print("Introduce la altura de la L (debe ser mayor de 1): ");
		int altura = S.nextInt();
		n = altura;
		if(altura % 2 != 0) {
			n = altura - 1;
		}
		ancho = n / 2;
		
		for(int i = 0; i < altura; i++) {
			System.out.println();
			
			System.out.print("*");
		}
		for(int j = 0; j < ancho; j++) {
			System.out.print(" *");
		}
		
	}
}
