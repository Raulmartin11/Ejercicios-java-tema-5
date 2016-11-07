/**
 * Calcula un numero multiplicado por el exponencial n
 * @author Raul Martin
 */
public class Ejercicio14Extra {
	public static void main(String[] args) {
		System.out.print("Elige un numero: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.print("Elige su exponencial(positito y entero): ");
		int exponente = Integer.parseInt(System.console().readLine());
		int total=(int)Math.pow(base, exponente);
		System.out.println("El resultado final es: " + total);
	}
}
