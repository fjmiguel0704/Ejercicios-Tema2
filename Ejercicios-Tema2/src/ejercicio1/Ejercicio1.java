package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos la variable num  
		int num, invertido,  unidades = 0, decenas = 0, centenas = 0, millares = 0;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que ingrese un número. Comprendido entre 0 y 9999
		System.out.println("Introduce un número comprendido en un rango del 0 al 9999: ");
		
		//Declaramos la variable num, que guardará el número introducido por el usuario
		num = read.nextInt();
		
		//Declaro la variable unidades. Recogerá el resto de la división de la variable num entre 10
		unidades= num%10;
		
		//Declaro la variable decenas. 
		decenas= (num/10) %10;
		centenas= (num/100) %10;
		millares= (num/1000);
		
		if (num<0 || num>9999) {
			System.out.println("ERROR: El número introducido no está comprendido en el rango que se solicita");
		} 
		
		if (num<10000) {
			if(unidades==millares && decenas==centenas) {
				System.out.println(num + " Es un número capicúa");
			} else if (num<1000) {
				if (unidades==centenas) {
					System.out.println(num + " Es un número capicúa");
				} else if (num<100) {
				if(unidades==decenas) {
						System.out.println(num + " Es un número capicúa");
					} else if(num<10) {
						System.out.println(num + " Es un número capicúa");
					}
				} 
			} 
		}
	}

}