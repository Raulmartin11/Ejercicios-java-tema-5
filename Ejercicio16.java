/**
 * Saber si un numero es primo
 * @author Raul Martin
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero para saber si es primo: ");
		int primo = Integer.parseInt(System.console().readLine());
		int resultado = 0;
		boolean esPrimo = true;
		
		for(int n=2; n < primo; n++){
			resultado = primo % n;
			if(resultado == 0){
				esPrimo=false;
			}
		}
		
		if(esPrimo){
			System.out.println("el numero es primo");
		}else{
			System.out.println("el numero no es primo");
		}
	}
}
