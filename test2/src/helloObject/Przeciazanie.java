package helloObject;

public class Przeciazanie {

	public static void main(String[] args) {
		PrzeciazanieDodawanie dod = new PrzeciazanieDodawanie();
		System.out.println(dod.dodaj((double)2,3));
		System.out.println(dod.dodaj((short)2, 3));
		System.out.println(dod.dodaj(2, 3));
		System.out.println(dod.dodaj(2, 3, 4));
	}

}
