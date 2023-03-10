package views;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame implements ActionListener {

	public static void main(String[] a) throws IOException {
		LoginFrame frame = new LoginFrame();
		frame.setTitle("Login Form");
//		frame.setContentPane(new JLabel(
//				new ImageIcon(ImageIO.read(new File(System.getProperty("user.dir") + "//assets//companyImage.jpg")))));
		frame.setVisible(true);
//		frame.setBounds(10, 10, 370, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	Container container = getContentPane();
	JLabel userLabel = new JLabel("USERNAME");
	JLabel passwordLabel = new JLabel("PASSWORD");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("RESET");
	JCheckBox showPassword = new JCheckBox("Show Password");
	JLabel label = new JLabel(); // JLabel Creation
	Dimension size = label.getPreferredSize(); // Gets the size of the image

	LoginFrame() {
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();

	}

	public void setLayoutManager() {
		container.setLayout(null);
	}

	public void setLocationAndSize() {
		userLabel.setBounds(50, 150, 100, 30);
		passwordLabel.setBounds(50, 220, 100, 30);
		userTextField.setBounds(150, 150, 150, 30);
		passwordField.setBounds(150, 220, 150, 30);
		showPassword.setBounds(150, 250, 150, 30);
		loginButton.setBounds(50, 300, 100, 30);
		resetButton.setBounds(200, 300, 100, 30);
		ImageIcon imgThisImg = new ImageIcon(System.getProperty("user.dir") + "//assets//companyImage.jpg");
		label.setIcon(imgThisImg);
		label.setBounds(250, 350, size.width, size.height); // Sets the location of the image
	}

	public void addComponentsToContainer() {
		container.add(userLabel);
		container.add(passwordLabel);
		container.add(userTextField);
		container.add(passwordField);
		container.add(showPassword);
		container.add(loginButton);
		container.add(resetButton);
	}

	public void addActionEvent() {
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Coding Part of LOGIN button
		if (e.getSource() == loginButton) {
			String userText;
			String pwdText;
			userText = userTextField.getText();
			pwdText = passwordField.getText();
			if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
				JOptionPane.showMessageDialog(this, "Login Successful");
			} else {
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}

		}
		// Coding Part of RESET button
		if (e.getSource() == resetButton) {
			userTextField.setText("");
			passwordField.setText("");
		}
		// Coding Part of showPassword JCheckBox
		if (e.getSource() == showPassword) {
			if (showPassword.isSelected()) {
				passwordField.setEchoChar((char) 0);
			} else {
				passwordField.setEchoChar('*');
			}
		}
	}
}