/**
 * muestra los numeros de 7 en 7 comprendidos entre dos numeros introducidos
 * @author Raul Martin
 */
public class Ejercicio18 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		int primero = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce un numero mayor al anterior: ");
		int segundo = Integer.parseInt(System.console().readLine());
		if(primero != segundo) {
			System.out.println("Se indicará numeros de 7 en 7 comprendidos entre ambos numeros");
			while( primero < segundo) {
				System.out.print(primero+" ");
				primero+=7;
			}
		}
	}
}
