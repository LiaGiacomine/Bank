package bank;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;

public class RegisterWindow {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstname;
	private String surname;
	public Client client;
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
		mainframe.setLayout(null);
		
		JLabel nameLabel = new JLabel("First Name");
		nameLabel.setBounds(10, 10, 80, 25);
		mainframe.add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setBounds(100, 10, 100, 25);
		//nameTextField.setColumns(10);
		mainframe.add(nameTextField);
		
		JLabel surnameLabel = new JLabel("Last Name");
		surnameLabel.setBounds(10, 10, 80, 25);
		mainframe.add(surnameLabel);
		
		JTextField surnameTextField = new JTextField();
		surnameTextField.setBounds(100, 40, 100, 25);
		//surnameTextField.setColumns(10);
		mainframe.add(surnameTextField);
		
//		JButton registerButton = new JButton("REGISTER");
//		registerButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				firstname = nameTextField.getText();
//				surname =  surnameTextField.getText();
//				client = new Client(firstname, surname);
//				BANKDATA.addClient(client);
//				JOptionPane.showMessageDialog(null, "Welcome here is your login name and pin: " + client.getClientID() + " " + client.getPinNumber());
//				Invest_or_OnlineBank Invest_or_OnlineBank = new Invest_or_OnlineBank();
//				Invest_or_OnlineBank.setVisible(true);
//			}
//		});
//		
//		registerButton.setLayout(null);
//		registerButton.setBounds(100, 100, 100, 100);
//		mainframe.add(registerButton);

//		mainframe.setLayout(null);
//		frame.getContentPane().add(mainframe);
//		//Set frame to show in middle of screen
//		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
//		frame.setVisible(true);

		
	}

}