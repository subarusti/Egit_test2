package helloObject;

public class Pielegniarka  extends Pracownik{
private int nadgodziny;

Pielegniarka(String imie, String nazwisko,int wiek){
	super(imie,nazwisko, wiek);
	this.nadgodziny=0;
}
public int getNadgodziny(){return nadgodziny;}
public void setNadgodziny(int n) {
	this.nadgodziny+=n;
}
}
