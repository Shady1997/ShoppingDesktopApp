package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test2 extends JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = frame.getSize().width;
		int h = frame.getSize().height;
		int x = (dim.width - w) / 2;
		int y = (dim.height - h) / 2;
		frame.setSize(x, y);
		//Creating a JPanel for the JFrame
        JPanel panel=new JPanel();
        //setting the panel layout as null
        panel.setLayout(null);
        //adding a label element to the panel
        JLabel label=new JLabel("HELLO  I  AM  SUBHOJEET");
        label.setBounds(70,100,200,50);
        panel.add(label);
        // changing the background color of the panel to yellow
        panel.setBackground(Color.yellow);
        panel.setBounds(100,50,300,200);

		// set JFrame in center of the screen
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
	}
}
