package helloObject;

public class Pracownik {
	String imie;
	String nazwisko;
	int wiek;
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
	void setOsoba(String i, String n, int w)
	{
		imie=i;
		nazwisko=n;
		wiek=w;
	}
	String getOsoba()
	{
		return imie+" " + nazwisko + " "+wiek;
	}
}
