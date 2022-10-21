package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	/**Las pruebas que deberíamos hacer al terminar el programa serían las siguientes:
	*-Introducir una cantidad en horas superior a 23, o una en minutos superior a 59 o una en segundos superior a 59. Y comprobar que me salta un mensaje de error. 
	*-Introducir 59 minutos y 59 segundos. Y comprobar que me incrementa una hora y minutos y segundos pasan a ser 0.
	*-Introducir 23 horas, 59 minutos y 59 segundos. Y comprobar que las horas se convierten en 0 y minutos y segundos pasan a 0.
	*-Introducir 59 segundos y minutos menor a 59. Y comprobar que me incrementa un minuto y segundos pasa a 0*/
	
	public static void main(String[] args) {
		
		//Creo las variables.
		int horas, minutos, segundos;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca una hora, unos minutos y unos segundos. Y declaramos las tres variables, que recogerán las horas, minutos y segundos introducidos por el usuario.
		System.out.print("Introduce las horas:");
		horas = read.nextInt();
		System.out.print("Introduce los minutos:");
		minutos = read.nextInt();
		System.out.print("Introduce los segundos:");
		segundos = read.nextInt();
		
		//Indicamos, que si horas es mayor a 23 o menor a 0, o minutos son mayor a 59 o menor a 0, o segundos son mayor a 59 o menor a 0. Salte un mensaje de error
		if(horas>23||horas<0||minutos>59||minutos<0||segundos>59||segundos<0) {
			System.out.println("¡ERROR! La hora introducida no es correcta");
		}
		
		//En caso contrario
		else {
			
			//Que incremente los segundos en 1
			segundos++;
			
			// Y si segundos son igual a 60. Incrementa los minutos en 1 y segundos pasan a ser 0
			if(segundos==60) {
				segundos=0;
				minutos++;
			}
			
			// Si minutos son igual a 60. Incrementa las horas en 1 y minutos pasan a ser 0
			if(minutos==60){
				minutos=0;
				horas++;
			}
			
			// Si horas son igual a 24. Horas pasará a ser 0
			if(horas==24) {
				horas=0;
			}
			
			//Mostramos la hora final
			System.out.println(horas + "h : " + minutos + "m : " + segundos + "s");
		}
				
		//Cerramos el Scanner
		read.close();

	}

}
