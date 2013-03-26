package helloObject;

public class Pracownik {
	String imie;
	String nazwisko;
	int wiek;
	Pracownik(){
		imie="jan";
		nazwisko="kowalski";
		wiek=33;		
	}
	Pracownik (Pracownik x)
	{
		imie=x.imie;
		nazwisko=x.nazwisko;
		wiek=x.wiek;
	}
	
	void setI(String a)
	{
		imie=a;
	}
	void setN(String a)
	{
		nazwisko=a;
	}
	void setW(int a)
	{
		wiek=a;
	}
	Pracownik (String i, String n, int w)
	{
		imie=i;
		nazwisko=n;
		wiek=w;
	}
	String getOsoba()
	{
		return imie+" " + nazwisko + " "+wiek;
	}
	String getImie(){ return imie; }
	String getNazwisko(){ return nazwisko; }
	double getWyplata(){ return wiek; }

}
