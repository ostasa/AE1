package act1;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Dime los años que lleva ");
		int num= x.nextInt();
		System.out.println("Dime tu nombre ");
		if (num<1){System.out.println("Desarrollador Junior L1 – 15000-18000");
	}else if(num<=2){System.out.println("Desarrollador Junior L2 – 18000-22000");}
	else if(num<=5){System.out.println("Desarrollador Senior L1 – 22000-28000");}
	else if(num<=8){System.out.println("Desarrollador Senior L2 – 28000-36000");}
	else {System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");}
}
}