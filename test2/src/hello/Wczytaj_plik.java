
package hello;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Wczytaj_plik {

	public static void main(String[] args) throws FileNotFoundException{
		//@SuppressWarnings("resource")
		Scanner klawiatura= new Scanner(System.in);
		String imie = klawiatura.nextLine();

		File file = new File("ala.txt");
		
		PrintWriter zapis = new PrintWriter(file);
		zapis.println(imie);
		zapis.close();


		Scanner in = new Scanner(file);
		
		// String zdanie = in.nextLine();
		System.out.println(in.nextLine());
		
	}

}
