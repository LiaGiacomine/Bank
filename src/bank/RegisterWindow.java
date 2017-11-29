package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class RegisterWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private BankData BANKDATA = new BankData();
	private String firstname;
	private String surname;
	public Client client;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow frame = new RegisterWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(56, 46, 115, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(56, 99, 115, 28);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname = textField.getText();
				surname =  textField_1.getText();
				client = new Client(firstname, surname);
				BANKDATA.addClient(client);
				JOptionPane.showMessageDialog(null, "Welcome here is your login name and pin: " + client.getClientID() + " " + client.getPinNumber());
				Invest_or_OnlineBank Invest_or_OnlineBank = new Invest_or_OnlineBank();
				Invest_or_OnlineBank.setVisible(true);
			}
		});
		
		btnNewButton.setBounds(215, 168, 131, 38);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(207, 47, 172, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 100, 172, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
