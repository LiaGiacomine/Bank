package bank;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class ClientLoginFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private String login;
	private int pin;
	private JFrame frame;
	BankData BankData;
	RegisterWindow RegisterWindow;
	Client client = RegisterWindow.client;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientLoginFrame window = new ClientLoginFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientLoginFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginId = new JLabel("Login ID");
		lblLoginId.setBounds(54, 73, 53, 16);
		contentPane.add(lblLoginId);
		
		textField = new JTextField();
		textField.setBounds(174, 68, 178, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPinNumber = new JLabel("Pin Number");
		lblPinNumber.setBounds(54, 123, 73, 16);
		contentPane.add(lblPinNumber);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(0, 0, 0, 0);
		contentPane.add(btnEnter);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 118, 178, 26);
		contentPane.add(textField_2);

			
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(203, 180, 117, 29);
		contentPane.add(btnConfirm);
		
		
		btnConfirm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				login = textField.getText();
				pin =  Integer.parseInt(textField_2.getText());
				
				if (BankData.getNumberOfClients() != 0)
				{
				for (Client client: BankData.clientlist)
				{
					if (client.getClientID() == login && client.getPinNumber() == pin)
					{
						JOptionPane.showMessageDialog(null, "You're in");
						Invest_or_OnlineBank Invest_or_OnlineBank = new Invest_or_OnlineBank();
						Invest_or_OnlineBank.setVisible(true);
						frame.dispose();
					}
				JOptionPane.showMessageDialog(null, "You're not registered with");
				}
				}
			}});
		}
}
		
		
