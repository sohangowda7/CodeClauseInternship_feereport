
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class AdminLogin extends JFrame {
	static AdminLogin frame;
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
					frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setBackground(new Color(230, 230, 250));
		lblAdminLogin.setBounds(226, 10, 207, 39);
		lblAdminLogin.setForeground(new Color(255, 0, 0));
		lblAdminLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 0, 0));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblName.setBounds(131, 95, 160, 39);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 0, 0));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(144, 176, 160, 39);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		textField.setBounds(373, 97, 218, 39);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		passwordField.setBounds(373, 178, 218, 39);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnLogin.setBackground(new Color(230, 230, 250));
		btnLogin.setForeground(new Color(255, 0, 0));
		btnLogin.setBounds(281, 280, 119, 57);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			char ch[]=passwordField.getPassword();
			String password=String.valueOf(ch);
			if(name.equals("ganesh")&&password.equals("ganesh")){
				String s[]={};
				AdminSection.main(s);
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
				textField.setText("");passwordField.setText("");
			}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblAdminLogin);
		contentPane.add(lblName);
		contentPane.add(lblPassword);
		contentPane.add(passwordField);
		contentPane.add(textField);
		contentPane.add(btnLogin);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[] {});
				frame.dispose();
				
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(481, 295, 105, 28);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setForeground(new Color(255, 0, 0));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		if(chckbxNewCheckBox.isSelected()) {
			passwordField.setEchoChar((char)0);
			
		}
			}
		}
		
		
			);
			
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		
		chckbxNewCheckBox.setBounds(509, 236, 142, 25);
		contentPane.add(chckbxNewCheckBox);
	}
}
