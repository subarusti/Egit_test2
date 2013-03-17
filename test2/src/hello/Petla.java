package hello;

import java.util.Scanner;

public class Petla {
	public static void main(String[] args) {
		System.out.println("podaj iloœæ sec. do wybuchu bomby");
		Scanner wejscie =  new Scanner(System.in);
		//int sec = wejscie.nextInt();
//		for (int i=sec;i>=0;i--)
		for (int sec = wejscie.nextInt(); sec>=0;sec--)
		{
			System.out.println("bomba wybucnie za "+sec);
		}		
		System.out.println("BUM!");
		wejscie.close();
	}

}
