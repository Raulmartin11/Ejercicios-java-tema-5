/**
 * Calcula un numero multiplicado por el exponencial n
 * @author Raul Martin
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.print("Elige un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		int apoyo = numero;
		System.out.print("Elige su exponencial(positito y entero): ");
		int exponente = Integer.parseInt(System.console().readLine());
		for(int n = 2; n <= exponente; n++) {
			numero*= apoyo;
		}
		System.out.println("el resultado es: " + numero);
	}
}
