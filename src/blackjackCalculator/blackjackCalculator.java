package blackjackCalculator;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class blackjackCalculator extends JPanel implements ActionListener {
	public void run() {
		JButton two;
		JButton three;
		JButton four;
		JButton five;
		JButton six;
		JButton seven;
		JButton eight;
		JButton nine;
		JButton ten;
		JButton ace;
	two = new JButton("2");
	two.setVerticalTextPosition(AbstractButton.CENTER);
	two.setMnemonic(KeyEvent.VK_2);
	two.setActionCommand("flip");
	two.addActionListener(this);
	three = new JButton("3");
	three.setVerticalTextPosition(AbstractButton.CENTER);
	three.setMnemonic(KeyEvent.VK_3);
	four = new JButton("4");
	four.setVerticalTextPosition(AbstractButton.CENTER);
	five = new JButton("5");
	five.setVerticalTextPosition(AbstractButton.CENTER);
	six = new JButton("6");
	six.setVerticalTextPosition(AbstractButton.CENTER);
	seven = new JButton("7");
	seven.setVerticalTextPosition(AbstractButton.CENTER);
	eight = new JButton("8");
	eight.setVerticalTextPosition(AbstractButton.CENTER);
	nine = new JButton("9");
	nine.setVerticalTextPosition(AbstractButton.CENTER);
	ten = new JButton("10/J/Q/K");
	ten.setVerticalTextPosition(AbstractButton.CENTER);
	ace = new JButton("A");
	ace.setVerticalTextPosition(AbstractButton.CENTER);
	
	add(two);
	add(three);
	add(four);
	add(five);
	add(six);
	add(seven);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("flip".equals(e.getActionCommand())) {
			
		} else {
			
		}
	}
	 private static void createAndShowGUI() {
		 
	        //Create and set up the window.
	        JFrame frame = new JFrame("Blackjack Calculator");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        blackjackCalculator newContentPane = new blackjackCalculator();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	 public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI(); 
	            }
	        });
	    }
	
}
