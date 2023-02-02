package views;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test extends JFrame implements ActionListener {

	// define container and elements
	Container container = getContentPane();
	JLabel leftSideImage = new JLabel();

	// Constructor
	test() {
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
	}

	// main method
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Test");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = jFrame.getSize().width;
		int h = jFrame.getSize().height;
		int x = (dim.width-w)/2;
		int y = (dim.height-h)/2;
		jFrame.setLocation(x, y);
		jFrame.setSize(700,700);
		jFrame.setVisible(true);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

	// TODO step1: set layout manager
	public void setLayoutManager() {
		container.setLayout(null);
	}

	// TODO step2: set Location and size
	public void setLocationAndSize() {
		leftSideImage.setBounds(50, 150, 100, 30);
	}

	// TODO step3: add component to container
	public void addComponentsToContainer() {
		container.add(leftSideImage);
	}

	// TODO step4: add action event to elemnt
	public void addActionEvent() {
//		leftSideImage.addActionListener(this);
	}
}
