package ejercicios;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Importamos el escaner
		Scanner sc = new Scanner(System.in);
		//Declaramos las dos variables que usaremos luego en el array
		int N, M;
		
		//Le pedimos al usuario que introduzca valores a las variables y lo escaneamos
		System.out.println("Introduzca un numero para el tamaño del array");
		N = sc.nextInt();
		System.out.println("Introduzca un numero para rellenar el array");
		M = sc.nextInt();
		
		//Creamos el array
		int num[]= new int[N];
		//Llenamos el array con el valor indicado anteriormente
		Arrays.fill(num, M);
		
		//Mostramos el contenido del array
		System.out.println(Arrays.toString(num));
		//Cerramos el escaner
		sc.close();
	}

}
