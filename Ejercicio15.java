/**
 * mostrar n numero multiplicado por el exponencial 
 * @author Raul Martin
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		System.out.print("Elige un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		System.out.print("Elige su exponencial(positito y entero): ");
		int exponente = Integer.parseInt(System.console().readLine());
		for(int n = 1; n <= exponente; n++) {
			System.out.println(numero + "^" + n);
		}
	}
}
