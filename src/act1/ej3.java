package act1;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Introduce el numero");
		int numero= x.nextInt();
		int num=0;
		for(int i = 0;i<numero;i++) {
			num+=2;
		}
		System.out.println(num);
	}

}
