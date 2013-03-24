package helloObject;


public class UstawPunkt {

	public static void main(String[] args) {
		Punkt punkt2D = new Punkt();
		punkt2D.ustawX(2);
		punkt2D.ustawY(3);
		System.out.println("wsp. punktu to "+punkt2D.wyswietlX()+" i "+punkt2D.wyswietlY());
		punkt2D.zmienX(5);
		punkt2D.zmienY(3);
		System.out.println(punkt2D.wyswietl());
		punkt2D.zwiekszX();
		punkt2D.zwiekszY();
		System.out.println(punkt2D.wyswietl());
		DziedziczeniePunkt3D punkt3D = new DziedziczeniePunkt3D(punkt2D);
		punkt3D.ustawZ(7);
		System.out.println(punkt3D.wyswietl());
		//DziedziczeniePunkt3D punkt3D1 = new DziedziczeniePunkt3D(1,2);
		//System.out.println(punkt3D1.wyswietl());
	}

}
