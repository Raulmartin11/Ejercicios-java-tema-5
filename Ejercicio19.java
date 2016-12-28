/**
 * piramide en bucle
 * @author Raul Martin
 */
 public class Ejercicio19 {
	 public static void main(String[] args) {
		 
		 System.out.print("Indica el tamaño de la piramide: ");
		 int alturaIntroducida = Integer.parseInt(System.console().readLine());
		 
		 
		 int i = 0;
		 int altura = 1;
		 int espacios = alturaIntroducida;
		 
		 while(altura < alturaIntroducida ) {
			 for(i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
			 for(i = 1; i < altura * 2; i++) {
				System.out.print("*");
			}
			System.out.println();
			
			altura++;
			espacios--;
		 }
	 }
 }
