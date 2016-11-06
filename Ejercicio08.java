/**
 * tablas de multiplicar
 * 
 * @author Raul Martin
 */
public class Ejercicio08 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		int multiplo = Integer.parseInt(System.console().readLine());
		for( int a =0; a <11; a++) {
			System.out.println(a + (" * ") + multiplo + (" = ") + ( a * multiplo));
		}
	}
}
