package learning;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Resturant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame("Fun & Coffee Mug");
		frame.setSize(300,300);
		frame.setVisible(true);
		
		JLabel header= new JLabel("24/7 Available at your service");
		frame.add(header);
	}

}
