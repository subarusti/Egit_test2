package hello;
import java.util.Scanner;
public class Warunek {

	public static void main(String[] args) {
		int x=-11;
		if (x>0)
		{
			System.out.println("x jest wieksze od 0");
		}
		else if (x<0) {
			System.out.println("x jest mniejsze od 0");
		}
		else if (x==0){
			System.out.println("x jest równe 0");
		}
		
		int cond = (x>0)?1:0;
		System.out.println(cond);
		
		
		System.out.println("podaj pierwsza liczbê");
		Scanner strumien = new Scanner(System.in);
		int a = strumien.nextInt();
		System.out.println("podaj drug¹ liczbê");
		int b = strumien.nextInt();
		
		if (a>b)
			System.out.println("pierwsza liczba jest wieksza od drugiej");
		else if (a<b)
			System.out.println("druga liczba jest wieksza od pierwszej");
		else 
			System.out.println("obie liczby s¹ równe");
		
		System.out.println("podaj imie");
		String imie = strumien.nextLine();
		switch (imie)
		{
		case "marek":
			System.out.println("czesc marek");
			break;
		case "jarek":
			System.out.println("czesc jarek");
			break;
		case "darek":
			System.out.println("czesc darek");
			break;
		default:
		    System.out.println(imie + "? nie znam Cie!");
		}
	}

}
