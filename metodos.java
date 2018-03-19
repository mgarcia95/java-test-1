package ftl;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class metodos {
		// TODO Auto-generated method stub
		static void ejercicio1() {
			Scanner sc = new Scanner (System.in);
			int x=0;
			int y=0;
			int o=0;
			System.out.println("MENU");
			System.out.println("1) Introducir X");
			System.out.println("2) Introducir Y");
			System.out.println("3) Visualizar x+y");
			System.out.println("4) Visualizar x-y");
			System.out.println("5) Visualizar x,y");
			System.out.println("6) Salir");
			// Fin menu
			while(o!=6) {
			System.out.println("Introduce una opcion: ");
			o=sc.nextInt();

			if(o==1) {
			System.out.print("Introduce un numero: ");		
			x=sc.nextInt();
			}
			if(o==2) {
			System.out.print("Introduce un numero: ");		
			y=sc.nextInt();
			}
			if(o==3) {
			int suma=0;
			suma=x+y;
			System.out.println("X+Y: "+suma);		
			}
			if(o==4) {
			int resta=0;
			resta=x-y;
			System.out.println("X+Y: "+resta);		
			}
			if(o==5) {
			System.out.print("X vale: ");		
			System.out.println(x);
			System.out.print("Y vale: ");		
			System.out.println(y);
			}
		}
	}
		static boolean primo(int n) {
			
			boolean pr=true;
			int i=2;
			while(i<=Math.sqrt(n)&&pr) {
				if(n%i==0) {
					pr=false;
				}
				i++;
			}
			return pr;
		}
	
		//static int ejercicio2(String...args) {
		//	int x=Integer.parseInt(args[0]);
		//	while(primo(x)==false) {
		//		x=x-1;
		//	}
		//	return x;
		//}
		static int ejercicio2(int x) {

			while(primo(x)==false) {
				x=x-1;
			}
			return x;
		}
		
	static int[] ejercicio3(String c) {
		int[] x = new int[c.length()+1];
		for(int i=0;i<c.length();i++) {
			x[i]=(c.charAt(i)+ejercicio2(127));
		}
		return x;
	}
	static String ejercicio4(int[] c) {
		String x="";
		for(int i=0;i<c.length;i++) {
			char a=(char) ((char)c[i]-ejercicio2(127));
			x+=a;
		}
		return x;
	}
	static boolean ejercicio5(int[][] n, int [][] j) {
	boolean comprueba=true;
	
		for(int i=0;i<n.length && comprueba==true;i++) {
			for(int a=0;a<n.length;a++) {
				if(n[i][a]==j[i][a]) {
					
				}else {
					comprueba=false;
				}
			}
		}
		return comprueba;
	}	
	
	static int[][] ejercicio6(int n) {
		int k=10;
		int [][]x=new int[n][n];
		for(int i=0;i<n;i++) {
			k+=10;
			for(int a=0;a<n;a++) {
				x[i][a]=new Random().nextInt(k);;
			}
			
		}
		return x;
	}	
}	
        


