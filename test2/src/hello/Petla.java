package hello;

import java.util.Scanner;

public class Petla {
	public static void main(String[] args) {
		System.out.println("podaj iloœæ sec. do wybuchu bomby");
		Scanner wejscie =  new Scanner(System.in);
		//int sec = wejscie.nextInt();
//		for (int i=sec;i>=0;i--)
/*		for (int sec = wejscie.nextInt(); sec>=0;sec--)
		{
			System.out.println("bomba wybucnie za "+sec);
		}		
		System.out.println("BUM!");

		
// for each		
		String[] tab = new String[5];
		for (int i=0;i<5;i++)
		{
			System.out.println("podaj imie nr"+i);
			tab[i]=wejscie.next();
			
		}
		
		for (String i:tab)
			System.out.println("witaj "+i);
*/		
		System.out.println("podaj liczbe elementow tablicy");
		
		
		int n=wejscie.nextInt();
		int[] tab1 = new int[n];
		for (int i=0;i<n;i++)
			tab1[i]=i+1;		
		
		int i=0;
		while (i<tab1.length)
			{
			System.out.println(tab1[i]);
			i++;
			}
		
		wejscie.close();
	}

}
