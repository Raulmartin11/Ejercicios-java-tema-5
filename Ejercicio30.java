/**
 * Calcula las horas transcurridas entre dos dia de la semana introducidos por teclado
 * 
 * @author Raul Martin
 */
import java.util.Scanner;
public class Ejercicio30 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int suma1 = 0;
		int suma2 = 1;
		int hora1 = 0;
		int hora2 = 1;
		String dia1;
		int dian1 = 0;
		String dia2;
		int dian2 = 1;
		boolean sigue = true;
		int total;
		
		System.out.print("Introduce un dia de la semana: ");
		dia1 = System.console().readLine().toLowerCase();
		
		switch(dia1) {
			case("lunes"):
			dian1 = 0;
			break;
			case("martes"):
			dian1 = 24;
			break;
			case("miercoles"):
			dian1 = 48;
			break;
			case("juebes"):
			dian1 = 72;
			break;
			case("viernes"):
			dian1 = 96;
			break;
			case("sabado"):
			dian1 = 120;
			break;
			case("domingo"):
			dian1 = 144;
			break;
			default:
			sigue = false;
		}
		System.out.print("Introduce una hora ( 0 - 23 ): ");
		hora1 = S.nextInt();
		
		System.out.print("Introduce otro dia de la semana: ");
		dia2 = System.console().readLine().toLowerCase();
		
		switch(dia2) {
			case("lunes"):
			dian2 = 0;
			break;
			case("martes"):
			dian2 = 24;
			break;
			case("miercoles"):
			dian2 = 48;
			break;
			case("juebes"):
			dian2 = 72;
			break;
			case("viernes"):
			dian2 = 96;
			break;
			case("sabado"):
			dian2 = 120;
			break;
			case("domingo"):
			dian2 = 144;
			break;
			default:
			sigue = false;
		}
		System.out.print("Introduce una hora ( 1 - 24 ): ");
		hora2 = S.nextInt();
		
		suma1 = dian1 + hora1;
		suma2 = dian2 + hora2;
		if(sigue == false) {
			System.out.println("Te has inventado alguno de los dias");
		} else if(suma1 > suma2) {
			System.out.print("la primer dia debe ser anterior al segundo");
			sigue = false;
		}
		if(sigue) {
			total = suma2 - suma1;
			System.out.print("Las horas Transcurridas desde el "+ dia1 +" a las "+ hora1 +" \nhasta el "+ dia2 +" a las "+ hora2+" \nson: "+ total+" horas");
		}
		
	}
}
		
		
