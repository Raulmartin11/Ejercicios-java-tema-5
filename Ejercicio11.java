/**
 * Cuadrado y cubo de los 5 siguientes números al introducido
 * @author Raul Martin
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		for(int pronumero = 0; pronumero < 5; pronumero++) {
				System.out.println("Numero     Cuadrado     Cubo");
				System.out.printf("%-6d     %-6d       %-6d\n", numero+pronumero, (numero+pronumero)*(numero+pronumero), (numero+pronumero)*(numero+pronumero)*(numero+pronumero));
			}
		}
	}
