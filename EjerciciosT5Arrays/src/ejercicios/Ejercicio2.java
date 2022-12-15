package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num[]= new int[55];
		int aux=1, x=0, y=1;
		
		while(aux!=11) {
			y=x+aux;
			Arrays.fill(num, x, y, aux);
			x=y;
			aux++;
		}
		
		for(int i:num) {
			System.out.print(i+", ");
		}
		
	}

}
