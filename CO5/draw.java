import java.awt.*;
import java.applet.*;

/*
<applet code="draw" width=350 height=400>
</applet>
*/

public class draw extends Applet{
	public void paint(Graphics g){
		g.drawOval(125,30,85,80);
		g.drawLine(50,125,250,125);
		g.drawRect(125,145,70,75);
	}
}