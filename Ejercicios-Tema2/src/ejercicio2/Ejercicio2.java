package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creo la variable DNI. Dato introducido por el usuario
		int dni, resto;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca su dni
		System.out.println("Introduce su DNI: ");
		
		//Declaramos la variable dni, que recogerá el dato introducido por el usuario
		dni = read.nextInt();
		
		//Vamos a sacar el resto que devulve la división de la variable dni entre 23
		resto = dni%23;
		
		//Vamos a indicar que si el dni introducido tiene mas o menos de 8 cifras, muestre un mensaje de error 
		if (dni>=100000000 || dni<10000000) {
			System.out.println("ERROR: El dni introducido no es válido");
		}
		
		//En caso contrario*
		else {
			
		//*El resto de la división*
		switch (resto) {
		
			//En caso de que sea, 0
			case 0 :
				
				//*Me concatene a la variable dni la siguiente letra
				System.out.println(dni + "T");
				
				break;
			
			//Así sucesivamente con todas las soluciones posibles
			case 1 :
				System.out.println(dni + "R");
				break;
			case 2 :
				System.out.println(dni + "W");
				break;
			case 3 :
				System.out.println(dni + "A");
				break;
			case 4 :
				System.out.println(dni + "G");
				break;
			case 5 :
				System.out.println(dni + "M");
				break;
			case 6 :
				System.out.println(dni + "Y");
				break;
			case 7 :
				System.out.println(dni + "F");
				break;
			case 8 :
				System.out.println(dni + "P");
				break;
			case 9 :
				System.out.println(dni + "D");
				break;
			case 10 :
				System.out.println(dni + "X");
				break;
			case 11 :
				System.out.println(dni + "B");
				break;
			case 12 :
				System.out.println(dni + "N");
				break;
			case 13 :
				System.out.println(dni + "J");
				break;
			case 14 :
				System.out.println(dni + "Z");
				break;
			case 15 :
				System.out.println(dni + "S");
				break;
			case 16 :
				System.out.println(dni + "Q");
				break;
			case 17 :
				System.out.println(dni + "V");
				break;
			case 18 :
				System.out.println(dni + "H");
				break;
			case 19 :
				System.out.println(dni + "L");
				break;
			case 20 :
				System.out.println(dni + "C");
				break;
			case 21 :
				System.out.println(dni + "K");
				break;
			case 22 :
				System.out.println(dni + "E");
				break;
		}
		}
		
		//Cerramos el scanner
		read.close();

	}

}


