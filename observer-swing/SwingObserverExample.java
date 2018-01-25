package observer_swing;

import java.awt.*;
import javax.swing.*;
	
public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();

		JButton button = new JButton("Click me.");
		JButton button2 = new JButton("Click me instead.");
//		button.addActionListener(new AngelListener());
//		button.addActionListener(new DevilListener());
		
		button.addActionListener(event -> 
			System.out.println("You made the right choice!")
		);
		button2.addActionListener(event ->
			System.out.println("Well done!")
		);
		
		frame.getContentPane().add(BorderLayout.WEST, button);
		frame.getContentPane().add(BorderLayout.EAST, button2);

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 * 
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}
	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/

}