/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
* 
* 
* 
* @author Raul Martin
*/
import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
    System.out.print("Introduzca la altura de la pirámide:");
    int alturaIntroducida = S.nextInt();

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida;
    
    for(altura = 1; altura <= alturaIntroducida; altura++) {
      
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      espacios--;
    } 
  }
}
