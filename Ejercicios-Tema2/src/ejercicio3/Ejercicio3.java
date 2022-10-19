package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/**Creo las variables. Estas recogerán los kg de comida comprados, 
		*el número de animales,
		*kg que comen los animales, 
		*kg totales que comen 
		*y racion que corresponde a cada animal*/
		double kgComidaCompra = 0, numAnimales, kgComenAnimales, kgComenAnimalesTotal, racion;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario los kg de comida comprado
		System.out.println("¿Cuántos kg de comida ha comprado?: ");
		
		//Declaramos la variable kgComidaCompra. Esta guardará la cantidad introducida por el usuario (kg comida comprada)	
		kgComidaCompra = read.nextDouble();
		
		//Le pedimos al usuario que indique el número de animales que tiene
		System.out.println("¿Cuántos animales tiene?: ");
		
		//Declaramos la variable numAnimales. Esta guardará la cantidad introducida por el usuario (número de animales)	
		numAnimales = read.nextDouble();
		
		//Le pedimos al usuario los kg de comida que come cada animal al dia
		System.out.println("¿Cúantos kilos come al día cada animal?: ");
		
		//Declaramos la variable kgComenAnimales. Esta guardará la cantidad introducida por el usuario (kg que come cada animal al día)
		kgComenAnimales = read.nextDouble();
		
		//Declaramos la variable kgComenAnimalesTotal. Esta recogerá el resultado del número de animales por los kg que come cada uno (kg que comen en total los animales)
		kgComenAnimalesTotal = numAnimales * kgComenAnimales;
		
		
		//Indicamos, que si los kg de comida comprados son mayor o igual a los kg totales que comen los animales, muestre que si hay suficientes kg
		if(kgComidaCompra>=kgComenAnimalesTotal) {
			System.out.println("Dispone de los suficientes kg de comida para alimentar a los animales");
		}
		
		//En caso contrario, si los kg de comida comprados es menor que los kg totales que comen los animales
		else if (kgComidaCompra<kgComenAnimalesTotal){
			
			//Divida los kg de comida comprados entre el número de animales para calcular la ración que le corresponde a cada animal
			racion = kgComidaCompra / numAnimales;
			System.out.println("A cada animal le corresponde " + racion + " KG de comida");
		}
		
		//Cerramos el Scanner
		read.close();

	}

}
