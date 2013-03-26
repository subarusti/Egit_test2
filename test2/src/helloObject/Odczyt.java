package helloObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odczyt {

	public static void main(String[] args) {
		int tab[] = { 1, 2, 3, 4, 5 };
		BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
		int indeks = -1;

		System.out.println("Podaj indeks tablicy, ktory chcesz zobaczyæ:");
		boolean czyPoprawnie=false;
		
		while(!czyPoprawnie){
			try{
			indeks = Integer.parseInt(odczyt.readLine());
			}
			catch(NumberFormatException n){
				System.out.println("Niepoprawne dane! " +
				  		"\n Który element tablicy chcesz zobaczyæ: ");}
			catch(IOException e){System.out.println("B³¹d odczytu danych");	}
			czyPoprawnie = indeks == -1? false:true;
			}
		try{
		System.out.println(tab[indeks-1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);}
		

	}

}
