/**
 * La cantidad, la media de los impares y el mayor de los pares de los numeros introducidos por teclado
 * @author Raul Martin
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		System.out.println("Haz una media de numeros positivos, finalizalá con un munero negativo"); 
		int a = 0;
		int suma = 0;
		int numero = 0;
		int mayorPar = 0;
		int cantidad = -1;
		do {
			System.out.print("Introduce un numero: ");
			numero = Integer.parseInt(System.console().readLine());
			
			if ((numero >= 0) && (numero % 2 != 0)) {
				a++;
				suma+= numero;
			}
			
			if ((numero >= 0) && (numero % 2 == 0)) {;
				if (numero > mayorPar) {
					mayorPar = numero;
				}
			}
			cantidad++;
		} while (numero >= 0);
		
		if( a != 0) {
			int media = suma/a;
			System.out.println("La media de los numeros impares es: " + media);
		}
		System.out.println("El numero par mayor es: " + mayorPar);
		System.out.println("Hay un total de " + cantidad + " numeros");
	}
}
