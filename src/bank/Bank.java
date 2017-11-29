package bank;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;




public class Bank {

	public Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Creates a frame with a login button and a register button
		JFrame frame = new JFrame("Bank App");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainframe = new JPanel();
		frame.add(mainframe);
		placeComponents(mainframe);
		
		frame.setVisible(true);
	}

	private static void placeComponents(JPanel mainframe) {
		// Add components to to mainframe
		mainframe.setLayout(null);
		
		//If the login button is clicked open the login frame
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(160, 130, 200, 80);
		mainframe.add(btnLogin);
	
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You will need to enter your login id and pin");
				ClientLoginFrame clientLogin = new ClientLoginFrame();
				clientLogin.setVisible(true);
			}
		});
		
		//If the register button is clicked open the register frame
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(160, 230, 200, 80);
		mainframe.add(btnRegister);
		
		
		btnRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "This app allows new clients to be created. Once you are registered you can use: Online Banking and Invest");
				RegisterWindow registerWindow = new RegisterWindow();
				registerWindow.main(args);
				
			}
		});
		
	}

}

