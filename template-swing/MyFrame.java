import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
		
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		this.setSize(300, 300);
		this.setVisible(true);
		this.setForeground(Color.red);
		this.getContentPane().setBackground(Color.blue);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		String msg = "Yes, have some!";
		g.drawString(msg, 100, 100);		
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame("Vinz Clortho says...");
	}

}
