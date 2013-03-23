package helloObject;

public class PrzeciazanieDodawanie {
int dodaj(int a, int b)
{
	System.out.println("int(int,int)");
	return a+b;
}
int dodaj(int a, int b, int c)
{
	System.out.println("int(int,int,int)");
	return a+b+c;
}
int dodaj(short a, short b)
{
	System.out.println("int(short,short)");
	return a+b;
}
double dodaj(double a, double b)
{
	System.out.println("double(double,double)");
	return a+b;
}



}
