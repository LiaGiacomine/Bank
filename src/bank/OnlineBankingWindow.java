package bank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OnlineBankingWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	RegisterWindow RegisterWindow;
	Client client = RegisterWindow.client;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineBankingWindow frame = new OnlineBankingWindow();
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
	public OnlineBankingWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Print Balance");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				client.getBalance();
				JOptionPane.showMessageDialog(null,"Current Balance: " + client.getBalance());
			}
		});
		btnNewButton.setBounds(175, 169, 125, 43);
		contentPane.add(btnNewButton);
		
		JButton btnReturnToMain = new JButton("Return to Main Screen");
		btnReturnToMain.setForeground(Color.BLUE);
		btnReturnToMain.setBackground(Color.RED);
		btnReturnToMain.setBounds(137, 235, 206, 37);
		contentPane.add(btnReturnToMain);
		
		JLabel lblCashInput = new JLabel("Cash Input");
		lblCashInput.setBounds(44, 39, 125, 16);
		contentPane.add(lblCashInput);
		
		JLabel lblCashOutput = new JLabel("Cash Output");
		lblCashOutput.setBounds(44, 107, 125, 16);
		contentPane.add(lblCashOutput);
		
		textField = new JTextField();
		textField.setBounds(170, 34, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setForeground(new Color(0, 102, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = Integer.parseInt(textField.getText());
				RegisterWindow.client.moneyIn(amount);
				JOptionPane.showMessageDialog(null,"New Balance: " + client.getBalance());
			}
		});
		btnNewButton_1.setBounds(327, 34, 117, 29);
		contentPane.add(btnNewButton_1);
		textField_1 = new JTextField();
		textField_1.setBounds(170, 102, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Withdraw");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = Integer.parseInt(textField_1.getText());
				client.moneyOut(amount);
				JOptionPane.showMessageDialog(null,"New Balance: " + client.getBalance());
			}
		});
		btnNewButton_2.setBounds(327, 102, 117, 29);
		contentPane.add(btnNewButton_2);
	}
}
