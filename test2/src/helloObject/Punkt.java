package helloObject;

public class Punkt {
int wspX;
int wspY;
String wyswietlXY()
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
