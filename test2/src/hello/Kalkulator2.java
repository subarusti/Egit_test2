package hello;
import static java.lang.Math.*;
import java.math.BigInteger;
public class Kalkulator2 {

	public static void main(String[] args) {

		BigInteger a = new BigInteger("-123456789");
		BigInteger b = new BigInteger("5123456789");
//		int a=-411, b=711;
System.out.println(a.add(b));
System.out.println(a.subtract(b));
System.out.println(a.multiply(b));
System.out.println(a.pow(4));
System.out.println(a.abs());
	}

}