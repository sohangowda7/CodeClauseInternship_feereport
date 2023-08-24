import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField usernamefield;
	private JPasswordField passwordfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 239, 213));
		frame.setBounds(100, 100, 624, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Goudy Stout", Font.ITALIC, 25));
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(106, 42, 307, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(79, 152, 119, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBackground(SystemColor.menu);
		lblNewLabel_2.setBounds(79, 223, 119, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		usernamefield = new JTextField();
		usernamefield.setBounds(222, 152, 156, 27);
		frame.getContentPane().add(usernamefield);
		usernamefield.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=usernamefield.getText();
				String password=passwordfield.getText();
				
				if(username.contains("Ganesh")&&password.contains("12345"))
				{
					Nextscreen ns=new Nextscreen();
					ns.Loginscreen();
				}		
				else {
					JOptionPane.showMessageDialog(null,"  INCORRECT USERNAME(OR)PASSWORD","ERROR",JOptionPane.ERROR_MESSAGE);
					usernamefield.setText(null);
					passwordfield.setText(null);
				}
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(161, 306, 119, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernamefield.setText(null);
				passwordfield.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(290, 306, 123, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Pssword");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordfield.setEchoChar((char)0);
				}
				else {
					passwordfield.setEchoChar((char)0);
				}
			}
			
		});
		chckbxNewCheckBox.setForeground(new Color(0, 0, 255));
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(290, 266, 123, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		passwordfield = new JPasswordField();
		passwordfield.setBackground(new Color(255, 255, 255));
		passwordfield.setBounds(222, 223, 156, 27);
		frame.getContentPane().add(passwordfield);
	}
}
