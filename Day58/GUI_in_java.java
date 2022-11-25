import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblPassword;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	/**
	 * 
	 */
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 18));
		lblNewLabel.setBounds(63, 94, 90, 20);
		contentPane.add(lblNewLabel);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Candara", Font.BOLD, 18));
		lblPassword.setBounds(63, 149, 90, 20);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(199, 92, 210, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(36, 216, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
//			String Password = txtPassword.getText();
//			String Username = txtUsername.setText();
//			
//			if(Password.contains("HEYboy")) && Username.contains("Shiva01"))) 
			
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(199, 216, 85, 21);
		contentPane.add(btnLogin);
		
		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(359, 216, 85, 21);
		contentPane.add(btnNewButton_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(45, 63, 418, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 204, 418, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("  ENTER CREDENTIALS ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(142, 20, 241, 43);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 147, 210, 22);
		contentPane.add(passwordField);
		
	}
}
