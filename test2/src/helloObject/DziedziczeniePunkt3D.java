package helloObject;

public class DziedziczeniePunkt3D extends Punkt {
	int wspz;

	DziedziczeniePunkt3D(Punkt pkt) {
		wspX = pkt.wspX;
		wspY = pkt.wspY;
	}

	void ustawZ(int a) {
		wspz = a;
	}

	String wyswietl() {
		return wyswietlX() + "," + wyswietlY() + "," + wyswietlZ();
	}

	int wyswietlZ() {
		return wspz;
	}

}
