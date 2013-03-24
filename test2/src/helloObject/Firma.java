package helloObject;

public class Firma {

	public static void main(String[] args) {
		Pracownik[] osoby= new Pracownik[3];
		
		String[] imiona = {"sd","asda","asfw"};
		String[] nazwiska = {"zsd","xasda","casfw"};
		int[] lata = {12,32,14};
		
		for (int i=0;i<osoby.length;i++)
		{
			osoby[i]= new Pracownik(imiona[i],nazwiska[i],lata[i]);
			
			/*
			osoby[i].setI(imiona[i]);
			osoby[i].setN(nazwiska[i]);
			osoby[i].setW(lata[i]);
			*/
		}
		
		for (int i=0;i<osoby.length;i++)
		{
			System.out.println("pracownicy to: "+osoby[i].getOsoba());

		}
		
		
/*		osoba1.setI("matyldaa");
		osoba1.setN("kowal");
		osoba1.setW(33);
		
		osoba2.setI("martyna");
		osoba2.setN("lolek");
		osoba2.setW(43);
		
		System.out.println("pierwszy pracownik to "+ osoba1.getOsoba());
		System.out.println("drugi pracownik to "+ osoba2.getOsoba());
		*/
	}

}
