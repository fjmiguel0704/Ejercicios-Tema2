package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	/**Las pruebas que deberíamos hacer al terminar el programa serían las siguientes:
	*-Introducir una cantidad en distancia a recorrer superior a 800, y una cantidad en días de Estancia superior a 7. Y comprobar que me devuelve el precio que valdría el billete aplicando un descuento del 30%. 
	*-Introducir una cantidad en distancia a recorrer inferior o igual a 800, y una cantidad en días de Estancia inferior o igual a 7. Y comprobar que me devuelve el precio del billete sin aplicar ningún descuento.*/
	
	public static void main(String[] args) {
		
		//Creo las variables. Una recogerá el precio final del billete, otra el descuento que habrá que aplicar, otra el precio final del billete con el descuento aplicado, otra la distancia a recorrer y otra los días de estancia
		double precioBillete = 0, descuento, precioBilleteDescuento, distancia, diasEstancia;
		
		//Otra variable tipo constante, que será el precio de un billete en caso de recorrer 1km 
		final double precioKm=2.5;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca la distancia a recorrer en km y declaramos la variable distancia. Guardará el dato introducido por el usuario
		System.out.println("¿Qué distancia a recorrer hay desde su salida hacia su destino (km)?: ");
		distancia = read.nextInt();
		
		//Le pedimos al usuario que introduzca los días de estancia y declaramos la variable diasEstancia. Guardará el dato introducido por el usuario
		System.out.println("¿Cuántos días va a durar su estancia?: ");
		diasEstancia = read.nextInt();
		
		//Declaramos la variable precioBillete. Esta guardará el resultado de multiplicar el precio de 1km por la distancia a recorrer
		precioBillete = precioKm * distancia;
		
		//Si los días de estancia es superior a 7 y la distancia a recorrer es superior a 800km. Que aplique un descuento del 30% al precio del billete
		if (diasEstancia>7&&distancia>800) {
			descuento = precioBillete * 0.30;
			precioBilleteDescuento = precioBillete - descuento;
			System.out.println(precioBilleteDescuento + "€ \nSe ha aplicado un descuento del 30%");
		} 
		
		//Y en caso contrario, no aplique ningún descuento
		else {
			System.out.println(precioBillete + "€");
		}
		
		//Cerramos el Scanner
		read.close();
	}

}
