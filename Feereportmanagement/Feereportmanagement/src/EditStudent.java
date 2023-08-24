
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
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class EditStudent extends JFrame {
	static EditStudent frame;
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
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new EditStudent();
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
	public EditStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 732);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 185));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(new Color(0, 0, 139));
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblName.setBounds(194, 104, 178, 29);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblEmail.setForeground(new Color(0, 0, 139));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(204, 146, 168, 32);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCourse.setForeground(new Color(0, 0, 139));
		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse.setBounds(194, 199, 178, 29);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblFee.setForeground(new Color(0, 0, 139));
		lblFee.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblFee.setBounds(194, 250, 178, 29);
		
		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaid.setForeground(new Color(0, 0, 139));
		lblPaid.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPaid.setBounds(194, 316, 178, 29);
		
		JLabel lblDue = new JLabel("Due");
		lblDue.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDue.setForeground(new Color(0, 0, 139));
		lblDue.setHorizontalAlignment(SwingConstants.CENTER);
		lblDue.setBounds(194, 362, 178, 23);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(new Color(0, 0, 139));
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblAddress.setBounds(194, 421, 178, 29);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setForeground(new Color(0, 0, 139));
		lblCity.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCity.setBounds(194, 474, 178, 29);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblState.setHorizontalAlignment(SwingConstants.CENTER);
		lblState.setForeground(new Color(0, 0, 139));
		lblState.setBounds(194, 519, 178, 29);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountry.setForeground(new Color(0, 0, 139));
		lblCountry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCountry.setBounds(195, 564, 177, 29);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblContactNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNo.setForeground(new Color(0, 0, 139));
		lblContactNo.setBounds(194, 607, 178, 29);
		
		JButton btnAddAccountant = new JButton("Update Student");
		btnAddAccountant.setForeground(new Color(25, 25, 112));
		btnAddAccountant.setBackground(new Color(216, 191, 216));
		btnAddAccountant.setBounds(268, 653, 145, 38);
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
				int rollno=Integer.parseInt(textField_10.getText());
				
				Student s=new Student(rollno,name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.update(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(EditStudent.this,"Student updated successfully!");
					AccountantSection.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(EditStudent.this,"Sorry, Unable to add student!");
				}
			}
		});
		
		textField = new JTextField();
		textField.setBounds(422, 107, 213, 28);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(422, 149, 213, 29);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(422, 201, 213, 29);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(422, 252, 213, 29);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(422, 314, 213, 29);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(422, 361, 213, 29);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(419, 476, 213, 29);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(419, 521, 213, 29);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(419, 566, 213, 29);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(419, 609, 216, 29);
		textField_9.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(422, 411, 210, 44);
		
		JButton btnBack = new JButton("back");
		btnBack.setBackground(new Color(250, 240, 230));
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnBack.setBounds(547, 656, 112, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantSection.main(new String[]{});
				frame.dispose();
			}
		});
		
		JLabel lblRollNo = new JLabel("Roll No");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblRollNo.setForeground(new Color(0, 0, 139));
		lblRollNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRollNo.setBounds(15, 9, 114, 26);
		
		textField_10 = new JTextField();
		textField_10.setForeground(new Color(255, 0, 0));
		textField_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		textField_10.setBounds(139, 6, 209, 29);
		textField_10.setColumns(10);
		
		JButton btnLoadRecord = new JButton("Load Record");
		btnLoadRecord.setForeground(new Color(199, 21, 133));
		btnLoadRecord.setBounds(376, 6, 120, 41);
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String srollno=textField_10.getText();
				if(srollno==null||srollno.trim().equals("")){
					JOptionPane.showMessageDialog(EditStudent.this,"Please enter rollno first!");
				}else{
				int rollno=Integer.parseInt(srollno);
				Student s=StudentDao.getStudentByRollno(rollno);
				textField.setText(s.getName());
				textField_1.setText(s.getEmail());
				textField_2.setText(s.getCourse());
				textField_3.setText(String.valueOf(s.getFee()));
				textField_4.setText(String.valueOf(s.getPaid()));
				textField_5.setText(String.valueOf(s.getDue()));
				textArea.setText(s.getAddress());
				textField_6.setText(s.getCity());
				textField_7.setText(s.getState());
				textField_8.setText(s.getCountry());
				textField_9.setText(s.getContactno());
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblName);
		contentPane.add(lblCourse);
		contentPane.add(lblFee);
		contentPane.add(lblPaid);
		contentPane.add(lblDue);
		contentPane.add(lblAddress);
		contentPane.add(lblRollNo);
		contentPane.add(lblEmail);
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
		contentPane.add(textArea);
		contentPane.add(textField_10);
		contentPane.add(btnLoadRecord);
		contentPane.add(lblContactNo);
		contentPane.add(lblCountry);
		contentPane.add(lblCity);
		contentPane.add(btnAddAccountant);
		contentPane.add(btnBack);
		contentPane.add(lblState);
	}
}
