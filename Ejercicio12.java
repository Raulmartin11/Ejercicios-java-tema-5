/**
 * Serie Fibonacci
 * @author Raul Martin
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.print("Indica la cantidad de los numeros que se mostraran de la serie fibonaci: ");
		int n = Integer.parseInt(System.console().readLine());
		long serie = 0;
		long fibonacci = 1;
		int cantidad = 1;
		while(n >= cantidad) {
			fibonacci+=serie;
			System.out.print(" "+serie);
			cantidad++;
			if(n >= cantidad) {
				System.out.print(" "+fibonacci);
				serie+=fibonacci;
				cantidad++;
			}
		}
	}
}
