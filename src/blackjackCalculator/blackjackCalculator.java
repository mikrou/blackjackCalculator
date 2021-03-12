package blackjackCalculator;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class blackjackCalculator extends JPanel implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("flip".equals(e.getActionCommand())) {
			
		} else {
			
		}
	}
	 private static void createAndShowGUI() {
		 JTextField decks = new JTextField();
		 JButton two = new JButton("2");
		 JButton three = new JButton("3");
		 JButton four = new JButton ("4");
		 JButton five = new JButton("5");
		 JButton six = new JButton("6");
		 JButton seven = new JButton("7");
		 JButton eight = new JButton("8");
		 JButton nine = new JButton("9");
		 JButton ten = new JButton("10/J/Q/K");
		 JButton ace = new JButton("A");
		 

		 //Create and set up the window.
		 JFrame frame = new JFrame("Blackjack Calculator");
		 frame.setSize(800,795);
		 two.setBounds(50,40,65,30);
		 three.setBounds(120,40,65,30);
		 four.setBounds(190,40,65,30);
		 five.setBounds(260,40,65,30);
		 six.setBounds(330,40,65,30);
		 seven.setBounds(400,40,65,30);
		 eight.setBounds(470,40,65,30);
		 nine.setBounds(540,40,65,30);
		 ten.setBounds(610,40,65,30);
		 ace.setBounds(680,40,65,30);
		 frame.add(two);
		 frame.add(three);
		 frame.add(four);
		 frame.add(five);
		 frame.add(six);
		 frame.add(seven);
		 frame.add(eight);
		 frame.add(nine);
		 frame.add(ten);
		 frame.add(ace);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		 //Display the window.
		 frame.setLayout(null);
		 frame.setVisible(true);
	    }
	 public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	            
	        createAndShowGUI(); 
	            
	    }
	
}
