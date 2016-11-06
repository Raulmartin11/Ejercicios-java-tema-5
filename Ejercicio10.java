/**
 * media de cantidad de numeros indefinidos
 * @author Raul Martin
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		System.out.println("Haz una media de numeros positivos, finalizalá con un munero negativo"); 
		int a = 0;
		int suma = 0;
		int numero = 0;
		do {
			System.out.print("Introduce un numero: ");
			numero = Integer.parseInt(System.console().readLine());
			if (numero >= 0) {
				a++;
				suma+= numero;
			}
		} while (numero >= 0);
		int media = suma/a;
		System.out.print("La media es: " + media);
	}
}
