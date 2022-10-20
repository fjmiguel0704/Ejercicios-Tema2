package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	/**Las pruebas que deberíamos hacer al terminar el programa serían las siguientes:
	*-Introducir una cantidad en horas superior a 24, una en minutos superior a 60 o una en segundos superior a 60. Y comprobar que me salta un mensaje de error. 
	*-Introducir 60 minutos y 60 segundos. Y comprobar que me incrementa una hora.
	*-Introducir 24 horas, 60 minutos y 60 segundos. Y comprobar que las horas se convierten en 1 y no 25
	*-Introducir 60 segundos. Y comprobar que me incrementa un minuto*/
	
	public static void main(String[] args) {
		
		//Creo las variables.
		int horas, minutos, segundos;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca una hora, unos minutos y unos segundos. Y declaramos las tres variables, que recogerán las horas, minutos y segundos de una hora
		System.out.print("Introduce las horas:");
		horas = read.nextInt();
		System.out.print("Introduce los minutos:");
		minutos = read.nextInt();
		System.out.print("Introduce los segundos:");
		segundos = read.nextInt();
		
		//Mostramos la que sería la hora introducida por el usuario
		System.out.println(horas + "h : " + minutos + "m : " + segundos + "s");
		
		//Indicamos, que si horas es mayor a 24, o minutos son mayor a 60 o segundos son mayor a 60. Salte un mensaje de error
		if(horas>24||minutos>60||segundos>60) {
			System.out.println("¡ERROR! La hora introducida no es correcta");
		}
		
		//En caso contrario, si las horas son 24 y segundos son 60 y minutos son 60. La hora pasará a ser 1 y minutos y segundos 0
		else if(horas==24&&segundos==60&&minutos==60) {
			segundos=0;
			minutos=0;
			horas=1;
			System.out.println(" -> " + horas + "h : " + minutos + "m : " + segundos + "s");
		} 
		
		//En caso contrario, si segundos son 60 y minutos son 60. Incremente la hora en 1 y segundos y minutos pasen a ser 0
		else if(segundos==60&&minutos==60) {
			segundos=0;
			minutos=0;
			horas++;
			System.out.println(" -> " + horas + "h : " + minutos + "m : " + segundos + "s");
		}
		
		//En caso contrario, si segundos son 60. Incremente los minutos en 1 y segundos pasen a ser 0
		else if (segundos==60) {
			segundos=0;
			minutos++;	
			System.out.println(" -> " + horas + "h : " + minutos + "m : " + segundos + "s");
		}
			
		//Cerramos el Scanner
		read.close();
		
	
	}

}
