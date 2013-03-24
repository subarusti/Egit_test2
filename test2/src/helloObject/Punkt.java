package helloObject;

public class Punkt {
int wspX;
int wspY;
public Punkt(int a, int b){
	wspX = a;
	wspY = b;
}
public Punkt(){
	wspX = 0;
	wspY = 0;
}


String wyswietl()
{
	return wyswietlX() + "," + wyswietlY();
}
void ustawX(int a)
{
wspX=a;	
}
void ustawY(int a)
{
wspY=a;	
}
int wyswietlX()
{
	return wspX;
}
int wyswietlY()
{
	return wspY;
}
void zwiekszX()
{
	wspX++;
}
void zwiekszY()
{
	wspY++;
}
void zmienX(int a)
{
	wspX=wspX+a;
}
void zmienY(int a)
{
	wspX=wspY+a;
}
}
