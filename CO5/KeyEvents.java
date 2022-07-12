import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="KeyEvents" width=350 height=400>
</applet>
*/

public class KeyEvents extends Applet 
implements KeyListener{

	String msg="";
	//int x=20,y=30;

	public void init(){
		addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent ke){
		showStatus("key down");
	}

	public void keyReleased(KeyEvent ke){
		showStatus("key up");
	}

	public void keyTyped(KeyEvent ke){
		msg += ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}
