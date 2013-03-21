package helloObject;


public class UstawPunkt {

	public static void main(String[] args) {
		Punkt punkt = new Punkt();
		punkt.ustawX(2);
		punkt.ustawY(3);
		System.out.println("wsp. punktu to "+punkt.wyswietlX()+" i "+punkt.wyswietlY());
	}

}
