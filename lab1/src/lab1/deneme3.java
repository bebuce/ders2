package lab1;

import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		float yaricap;
		double alan;
		double pi = 3.14;
		
		
		
		System.out.print("yarıçapı giriniz:");
		yaricap = input.nextInt();
		
		alan = pi * (yaricap * yaricap);
		
		System.out.println(alan);
	}

}
