package act1;

import java.util.Scanner;

public class ej8 {

	static boolean Primo(int numero) {
		
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			if (numero % x == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
         
		Scanner x = new Scanner(System.in);
		System.out.println("Dime el primer numero ");
		int num1= x.nextInt();
		System.out.println("Dime el segundo numero ");
		int num2= x.nextInt();
		for(int i=num1;i<num2;i++) {
	boolean b =Primo(i);
	if(b==true) {System.out.println(i + " Es primo");}else {System.out.println(i + " No es primo");
		}
	 
     
    
} long fin = System.currentTimeMillis();
double tiempo = (double) ((fin - inicio)/1000);
     System.out.println("Ha tardado "+tiempo);}}