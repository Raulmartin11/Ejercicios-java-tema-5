/**
 * Serie Fibonaci
 * @author Raul Martin
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.print("Indica la cantidad de los numeros que se mostraran de la serie fibonaci: ");
		int n = Integer.parseInt(System.console().readLine());
		int serie = 0;
		int fibonaci = 1;
		int cantidad = 0;
		while(n >= cantidad) {
			fibonaci+=serie;
			System.out.println(serie);
			System.out.println(fibonaci);
			serie+=fibonaci;
			cantidad++;
		}
	}
}
