package hello;
import java.util.Scanner;
public class Wczytaj {

	public static void main(String[] args) {
		double x,y,c;
		@SuppressWarnings("resource")
		Scanner wczytaj = new Scanner(System.in);
		System.out.println("podaj pierwsza liczbê zmiennoprzecinkowa");
		x= wczytaj.nextDouble();
		System.out.println("podaj drug¹ liczbê zmiennoprzecinkowa");
		y= wczytaj.nextDouble();
		c=(x+y);
		System.out.println("Wynik dodawania "+x +" i "+y+" wynosi " + c);
		System.out.println("Wynik odejmowania "+x +" i "+y+" wynosi " +(x-y));
		System.out.println("Wynik mno¿enia "+x +" i "+y+" wynosi " +x*y);
		System.out.println("Wynik dzielenia "+x +" i "+y+" wynosi " +(x/y));
	}

}
