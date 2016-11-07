/**
 * Control de acceso a caja fuerte
 * 
 * @author Raul Martin
 */
public class Ejercicio07 {
	public static void main(String[] args) {
		int intentos = 4;
		int combinacion = 0;
		do {
			System.out.print("Introduce la contraseña: ");
			combinacion = Integer.parseInt(System.console().readLine());
			if(combinacion == 1234) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			} else {
				intentos--;
				System.out.println("Lo siento, esa no es la combinacion\nLe quedan " + intentos + " intentos");
			}
		} while (intentos >0 || combinacion == 1234);
	}
}
