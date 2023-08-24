

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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class AddStudent extends JFrame {
	static AddStudent frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddStudent();
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
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 737);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddAccountant = new JLabel("Add Student");
		lblAddAccountant.setBounds(198, 23, 281, 33);
		lblAddAccountant.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAccountant.setForeground(new Color(139, 0, 139));
		lblAddAccountant.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(new Color(0, 0, 128));
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblName.setBounds(136, 111, 250, 30);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblEmail.setForeground(new Color(0, 0, 128));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(136, 151, 250, 30);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCourse.setForeground(new Color(0, 0, 128));
		lblCourse.setBounds(136, 191, 240, 33);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblFee.setForeground(new Color(0, 0, 128));
		lblFee.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblFee.setBackground(new Color(240, 240, 240));
		lblFee.setBounds(126, 231, 250, 30);
		
		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setForeground(new Color(0, 0, 128));
		lblPaid.setBackground(new Color(240, 240, 240));
		lblPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaid.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPaid.setBounds(136, 267, 236, 30);
		
		JLabel lblDue = new JLabel("Due Fee");
		lblDue.setForeground(new Color(0, 0, 128));
		lblDue.setHorizontalAlignment(SwingConstants.CENTER);
		lblDue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDue.setBackground(new Color(240, 240, 240));
		lblDue.setBounds(136, 312, 250, 33);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(new Color(0, 0, 128));
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblAddress.setBounds(136, 374, 250, 33);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setForeground(new Color(0, 0, 128));
		lblCity.setBounds(126, 455, 250, 33);
		
		JLabel lblState = new JLabel("State");
		lblState.setHorizontalAlignment(SwingConstants.CENTER);
		lblState.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblState.setForeground(new Color(0, 0, 128));
		lblState.setBounds(126, 499, 250, 33);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountry.setForeground(new Color(0, 0, 128));
		lblCountry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCountry.setBounds(112, 541, 250, 34);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setForeground(new Color(0, 0, 128));
		lblContactNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblContactNo.setBounds(126, 590, 250, 25);
		
		JButton btnAddAccountant = new JButton("Add Student");
		btnAddAccountant.setBounds(133, 637, 172, 53);
		btnAddAccountant.setBackground(new Color(216, 191, 216));
		btnAddAccountant.setForeground(new Color(255, 0, 0));
		btnAddAccountant.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				int fee=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
				int due=Integer.parseInt(textField_5.getText());
				String address=textArea.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String country=textField_8.getText();
				String contactno=textField_9.getText();
				
				Student s=new Student(name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.save(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(AddStudent.this,"Student added successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textField_7.setText("");textField_8.setText("");
					textField_9.setText("");textArea.setText("");
				}else{
					JOptionPane.showMessageDialog(AddStudent.this,"Sorry, Unable to add student!");
				}
			}
		});
		
		textField = new JTextField();
		textField.setBounds(435, 112, 260, 33);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(435, 154, 260, 30);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(435, 194, 260, 30);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(435, 234, 260, 30);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(436, 270, 259, 30);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(436, 314, 259, 34);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(435, 458, 260, 33);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(436, 501, 259, 33);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(436, 544, 259, 34);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(436, 588, 259, 33);
		textField_9.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(436, 358, 259, 65);
		textArea.setRows(3);
		textArea.setColumns(20);
		
		JButton btnBack = new JButton("back");
		btnBack.setBounds(503, 648, 83, 34);
		btnBack.setBackground(new Color(216, 191, 216));
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[]{});
				frame.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblAddAccountant);
		contentPane.add(lblName);
		contentPane.add(lblCourse);
		contentPane.add(lblFee);
		contentPane.add(lblPaid);
		contentPane.add(lblDue);
		contentPane.add(lblAddress);
		contentPane.add(lblEmail);
		contentPane.add(textArea);
		contentPane.add(textField_5);
		contentPane.add(textField_4);
		contentPane.add(textField_3);
		contentPane.add(textField_2);
		contentPane.add(textField_1);
		contentPane.add(textField);
		contentPane.add(textField_7);
		contentPane.add(textField_8);
		contentPane.add(textField_9);
		contentPane.add(textField_6);
		contentPane.add(lblContactNo);
		contentPane.add(lblCountry);
		contentPane.add(lblCity);
		contentPane.add(btnAddAccountant);
		contentPane.add(btnBack);
		contentPane.add(lblState);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textArea.setText(null);
				
				
			}
		});
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(339, 648, 111, 35);
		contentPane.add(btnNewButton);
	}
}
