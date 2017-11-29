package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;


public class Bank {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank window = new Bank();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(250, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(0, 0, 100, 50);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You will need to enter your login id and pin");
				ClientLoginFrame clientLogin = new ClientLoginFrame();
				clientLogin.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(0, 100, 100, 50);
		frame.getContentPane().add(lblNewLabel1);
		frame.getContentPane().add(btnLogin);
		
		
		JButton btnRegister = new JButton("Register");
		JLabel lblNewLabel2 = new JLabel("");
		btnRegister.setBounds(0, 200, 100, 50);
		frame.getContentPane().add(lblNewLabel2);
		frame.getContentPane().add(btnRegister);
		
		
		btnRegister.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "This app allows new clients to be created. Once you are registered you can use: Online Banking and Invest");
				RegisterWindow registerWindow = new RegisterWindow();
				registerWindow.setVisible(true);
				frame.dispose();
			}
		});
		
		
	}

}
