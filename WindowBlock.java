import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowBlock extends JFrame implements KeyListener{
	
	int xLoc;
	int yLoc;
	String blockColor;
	boolean listenToKey;
	MainRunner gameWindow;
	public WindowBlock(int x, int y, String color,boolean listen,MainRunner w)
	{
		gameWindow = w;
		xLoc = x;
		yLoc = y;
		this.setLocation(x,y);
	//	addKeyListener(this);
		setSize(50,100);
		blockColor = color;
		listenToKey=listen;
		if(blockColor == "RED")
		{
			this.setForeground(Color.red);
		}
		else if(blockColor == "GREEN")
		{
			this.setBackground(Color.green);
		}
		else if(blockColor == "BLUE")
		{
			this.setBackground(Color.blue);
		}
		else if(blockColor == "PURPLE")
		{
			this.setBackground(Color.pink);
		}
		if(listenToKey)
		{
			addKeyListener(this);
			requestFocus();
		}
		show();
	}
	public void paint(Graphics g)
	{
		
		//this.setBackground(Color.red);
	}
	public void move(int direction)
	{
		if(direction == 1)
		{
			
			setLocation(getLocation().x,getLocation().y+100);
		}
		else if(direction == -1)
		{
			setLocation(getLocation().x - 121,getLocation().y);
		}
		else if(direction == 2)
		{
			setLocation(getLocation().x+121,getLocation().y);
			
		}
		else if(direction == 10)
		{
			//setLocation(xLoc,yLoc);
		}
	}
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			gameWindow.tryToMoveShape(-1);
		}
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			gameWindow.tryToMoveShape(2);
		}
		if(arg0.getKeyCode() == KeyEvent.VK_SPACE)
		{
			gameWindow.frameSpeed = 0;
		}
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER)
		{
			gameWindow.tryToMoveShape(10);
		}
		if(arg0.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
			System.exit(10);
		}
		
	}
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
