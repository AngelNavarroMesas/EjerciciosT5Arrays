package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num[]= new int[55];
		int aux=1;
		
		while(aux<num.length) {
			int i=0;
			
			Arrays.fill(num, i, aux, i);
			aux+=aux;
			i++;
		}
		
		for(int i:num) {
			System.out.print(i+", ");
		}
		
	}

}
