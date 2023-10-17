package lab1;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int say1;
		int say2;
		int top;
		int fark;
		int bolum;
		int carpim;
		
		System.out.print("sayıyı giriniz:");
		say1 = input.nextInt();
		
		System.out.print("sayıyı giriniz:");
		say2 = input.nextInt();
		
		top = say1 + say2;
		fark = say1 - say2;
		bolum = say1/say2;
		carpim = say1*say2;
		
		System.out.println("Toplam =" +top);
		System.out.println("Fark =" +fark);
		System.out.println("Bölüm =" +bolum);
		System.out.println("Çarpım =" +carpim);
	}

}
