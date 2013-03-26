package helloObject;

public class Lekarz extends Pracownik{
	private double premia;

	public Lekarz(String imie, String nazwisko,int wiek){
		super(imie,nazwisko, wiek);
		this.premia=0;
	}
	public double getPremia(){return premia;}
	public void setPremia(double n) {
		this.premia+=n;
	}
}
