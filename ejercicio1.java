package ftl;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJ 1
		
		metodos.ejercicio1();

		//EJ 2
		
		int x=100;
		System.out.println(metodos.ejercicio2(x));

		//EJ 3
		
		String palabra="frase";
		int[] encriptado = metodos.ejercicio3(palabra);
		for(int i=0;i<palabra.length();i++) {
			System.out.println(encriptado[i]);
		}
		
		//EJ 4
		
		int[] encriptado = metodos.ejercicio3(palabra);
		
		for(int i=0;i<palabra.length();i++) {
			System.out.println(encriptado[i]);
		}

		System.out.println(metodos.ejercicio4(encriptado));
		
		//EJ 5
		
		int [][]matriz=metodos.ejercicio6(5);
		int [][]matrizdos=metodos.ejercicio6(5);
		
		for(int i=0;i<5;i++) {
			for(int a=0;a<5;a++) {
				System.out.print("[");
				System.out.print(matriz[i][a]);	
				System.out.print("]");
			}
			System.out.println(" ");
		}  
			
		for(int i=0;i<5;i++) {
			for(int a=0;a<5;a++) {
				System.out.print("[");
				System.out.print(matrizdos[i][a]);	
				System.out.print("]");
			}
			System.out.println(" ");
		} 
			
		if(metodos.ejercicio5(matriz, matrizdos)) {
			System.out.println("Las matrices son iguales");
		}else {
			System.out.println("Las matrices no son iguales");
		}
		
		//EJ 6
           
		
		int [][]matriz=metodos.ejercicio6(5);
		
		
		for(int i=0;i<5;i++) {
			for(int a=0;a<5;a++) {
				System.out.print("[");
				System.out.print(matriz[i][a]);	
				System.out.print("]");
			}
			System.out.println(" ");
		} 
	}

}
