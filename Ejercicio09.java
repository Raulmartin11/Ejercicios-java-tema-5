/**
 * cuantos digitos tiene un numero
 * 
 * @author
 */
public class Ejercicio09 {
	public static void main(String[] args) {
		System.out.println("Introduce un numero");
		int numero = Integer.parseInt(System.console().readLine());
		int digito=0;
		while(numero >= 1) {
			numero/=10;
			digito++;
			System.out.println("El numero introducido tiene " + digito + " digitos");
		}
	}
}
