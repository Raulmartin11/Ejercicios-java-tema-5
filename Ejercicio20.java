/**
 * piramide en bucle hueca
 * @author Raul Martin
 */
 public class Ejercicio20 {
	 public static void main(String[] args) {
		 
		 System.out.print("Indica el tamaño de la piramide: ");
		 int alturaIntroducida = Integer.parseInt(System.console().readLine());
		 
		 System.out.print("Indica el caracter de la piramide: ");
		 String caracter = System.console().readLine();
		 
		 int i = 0;
		 int altura = 1;
		 int espacios = alturaIntroducida -1;
		 
		 while(altura < alturaIntroducida ) {
			 
			 for(i = 1; i <= espacios; i++) {
				 if(i != espacios) {
					System.out.print("_");
				} else {
					System.out.print(caracter);
				}
			}
			
			 for(i = 1; i < altura * 2 ; i++) {
				System.out.print("-");
			}
			if(altura > 1) {
				System.out.print(caracter);
			}
			System.out.println();
			 altura++;;
			espacios--;
		 }
	 }
 }
