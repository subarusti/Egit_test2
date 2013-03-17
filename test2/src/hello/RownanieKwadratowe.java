package hello;
import java.util.Scanner;
public class RownanieKwadratowe {
	public static void main(String[] args) {
		System.out.println("podaj parametry");
		Scanner  wejscie = new Scanner(System.in);
		double a =wejscie.nextDouble();
		double b =wejscie.nextDouble();
		double c =wejscie.nextDouble();
		double delta =b*b-4*a*c;
		if (delta>0)
		{
			delta =Math.sqrt(delta);
			double x1=(-b-delta)/(2*a);
			double x2=(-b+delta)/(2*a);
			System.out.println("pierwiatki to " + x1 +" i "+x2);
		}
		else if (delta==0)
		{
			double x0 = -b/(2*a);
			System.out.println("pierwiatek to " + x0);
		}
		else if (delta<0)
			System.out.println("nie ma pierwiatków rzeczywistych");
	
	}

}
