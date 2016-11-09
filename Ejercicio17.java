/**
 * Suma los 100 numeros siguientes al intruducido
 * @author Raul Martin
 */
public class Ejercicio17 {
	public static void main(String[] args) {
		System.out.print("Introduce un numero para sumarle los 100 siguientes: ");
		int numero = Integer.parseInt(System.console().readLine());
		int resultado = 0;
		if(numero >= 0) {
			for(int correlativo = 0; correlativo < 100; correlativo++) {
				resultado+= numero + correlativo;
				System.out.print(resultado+" ");
			}
			System.out.print("La suma total de los siguientes 100 numeros son: "+resultado);
		}else{
			System.out.print("Debe ser positivo");
		}
	}
}
