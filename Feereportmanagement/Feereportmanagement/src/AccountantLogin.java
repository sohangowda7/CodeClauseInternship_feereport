import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AccountantLogin extends JFrame {
	static AccountantLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AccountantLogin();
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
	public AccountantLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAccountantLogin = new JLabel("Accountant Login");
		lblAccountantLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountantLogin.setBounds(139, 15, 401, 65);
		lblAccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblAccountantLogin.setForeground(new Color(255, 20, 147));
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(75, 0, 130));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblName.setBounds(104, 164, 207, 49);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 139));
		textField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		textField.setBounds(382, 168, 264, 49);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblPassword.setForeground(new Color(75, 0, 130));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBackground(new Color(255, 255, 255));
		lblPassword.setBounds(104, 275, 207, 49);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 139));
		passwordField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		passwordField.setBounds(382, 279, 264, 49);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setForeground(new Color(255, 0, 0));
		btnLogin.setBackground(new Color(230, 230, 250));
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		btnLogin.setBounds(267, 383, 142, 72);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			boolean status=AccountantDao.validate(name, password);
			if(status){
				AccountantSection.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AccountantLogin.this,"Sorry, username or password !","Login error!",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(230, 230, 250));
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setBounds(512, 400, 83, 40);
		contentPane.setLayout(null);
		contentPane.add(lblPassword);
		contentPane.add(lblName);
		contentPane.add(lblAccountantLogin);
		contentPane.add(passwordField);
		contentPane.add(textField);
		contentPane.add(btnLogin);
		contentPane.add(btnBack);
	}
}

