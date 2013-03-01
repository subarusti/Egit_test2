package hello;
import java.awt.*;
import java.applet.*;
public class Hello extends Applet
{
	public void paint (Graphics g)
	{
		g.drawString("hi Ian T. zmiana", 20, 20 );	
		// komentarze
		/*mozna zastosowac
		  dluzsze komenty
		 */
		System.out.println("inny sposob wyswietlania");
	}
}