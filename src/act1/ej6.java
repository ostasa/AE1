package act1;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int[] num = new int[5];
		int suma=0;
		for(int i=0;i<num.length;i++) {
		System.out.println("Dime un numero");
		num[i]=x.nextInt();
		suma+=num[i];
		}
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[num.length-i-1]);
		}
		System.out.println("La suma es "+suma);
}}