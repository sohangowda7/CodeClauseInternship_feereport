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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AddAccountant extends JFrame {
	static AddAccountant frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddAccountant();
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
	public AddAccountant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 524);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setForeground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddAccountant = new JLabel("Add Accountant");
		lblAddAccountant.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAccountant.setBounds(215, 10, 242, 50);
		lblAddAccountant.setForeground(new Color(255, 0, 0));
		lblAddAccountant.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(new Color(255, 0, 0));
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblName.setBounds(122, 87, 164, 43);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 0, 0));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPassword.setBounds(122, 157, 164, 50);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(new Color(255, 0, 0));
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblEmail.setBounds(122, 225, 164, 50);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setForeground(new Color(255, 0, 0));
		lblContactNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblContactNo.setBounds(103, 312, 183, 43);
		
		textField = new JTextField();
		textField.setBounds(379, 88, 264, 43);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(379, 162, 264, 43);
		
		textField_1 = new JTextField();
		textField_1.setBounds(381, 230, 264, 43);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(379, 313, 264, 43);
		textField_2.setColumns(10);
		
		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.setBackground(new Color(255, 255, 240));
		btnAddAccountant.setFont(new Font("Microsoft New Tai Lue", Font.ITALIC, 21));
		btnAddAccountant.setForeground(new Color(255, 0, 0));
		btnAddAccountant.setBounds(258, 379, 199, 58);
		btnAddAccountant.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				String email=textField_1.getText();
				String contactno=textField_2.getText();
				
				
				Accountant a=new Accountant(name,password,email,contactno);
				int status=AccountantDao.save(a);
				
				if(status>0){
					JOptionPane.showMessageDialog(AddAccountant.this,"Accountant added successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					passwordField.setText("");
				}else{
					JOptionPane.showMessageDialog(AddAccountant.this,"Sorry, Unable to add Accountant!");
				}
				
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 255, 240));
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.setFont(new Font("Microsoft JhengHei UI Light", Font.ITALIC, 18));
		btnBack.setBounds(512, 389, 120, 32);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				frame.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblName);
		contentPane.add(lblPassword);
		contentPane.add(lblEmail);
		contentPane.add(lblContactNo);
		contentPane.add(textField_2);
		contentPane.add(textField_1);
		contentPane.add(textField);
		contentPane.add(passwordField);
		contentPane.add(btnAddAccountant);
		contentPane.add(btnBack);
		contentPane.add(lblAddAccountant);
	}
}
