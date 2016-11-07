/**
 * Saber si son positivos o negativos
 * @author Raul Martin
 */
public class Ejercicio13 {
	public static void main(String[] args) {
		System.out.println("Escribe 10 numeros para saber cuantos son positivos y cuantos negativos");
		int positivo = 0;
		int negativo = 0;
		for(int lista = 0; lista < 10; lista++) {
			System.out.print("Escribe un numero: ");
			int numero = Integer.parseInt(System.console().readLine());
			if(numero < 0) {
				negativo++;
			} else {
				positivo++;
			}
		}
		System.out.print(positivo + " numeros positivos y " + negativo + " numeros negativos");
	}
}
