package lab1;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		float boy;
		float agırlık;
		float sonuc;
	
		System.out.print("boyunuzu giriniz(santimetre):");
		boy = input.nextInt();
		
		System.out.print("kilonuzu giriniz(kilogram):");
		agırlık = input.nextInt();
		
		sonuc = (agırlık / (boy * boy))*10000;
		
		System.out.println(sonuc);
		
		
		if (sonuc < 18){
		System.out.println("zayıf");
		}
		else if(sonuc>=18 && sonuc<=25) {
			System.out.println("normal");
			
		}
		else if(sonuc>=30) {
			System.out.println("obez");}

	}

}
