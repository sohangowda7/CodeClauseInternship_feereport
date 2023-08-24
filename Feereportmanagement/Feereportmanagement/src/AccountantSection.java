import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AccountantSection extends JFrame {
	static AccountantSection frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AccountantSection();
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
	public AccountantSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 639);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 235, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(63, 169, 253, 91);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(new String[]{});
				frame.disable();
			}
		});
		
		JLabel lblAccountantSection = new JLabel("Accountant Section");
		lblAccountantSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountantSection.setBackground(new Color(245, 245, 245));
		lblAccountantSection.setBounds(160, 20, 389, 91);
		lblAccountantSection.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblAccountantSection.setForeground(new Color(128, 0, 128));
		
		JButton btnViewStudent = new JButton("View Student");
		btnViewStudent.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnViewStudent.setForeground(new Color(255, 0, 0));
		btnViewStudent.setBounds(392, 176, 232, 84);
		btnViewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[]{});
			}
		});
		
		JButton btnEditStudent = new JButton("Edit Student");
		btnEditStudent.setForeground(new Color(255, 0, 0));
		btnEditStudent.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnEditStudent.setBounds(72, 314, 244, 91);
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditStudent.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnDueFee = new JButton("Due Fee");
		btnDueFee.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		btnDueFee.setForeground(new Color(255, 0, 0));
		btnDueFee.setBounds(399, 316, 225, 91);
		btnDueFee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DueFee.main(new String[]{});
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(new Color(255, 0, 0));
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnLogout.setBounds(176, 472, 192, 106);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FeeReport.main(new String[]{});
				frame.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblAccountantSection);
		contentPane.add(btnEditStudent);
		contentPane.add(btnDueFee);
		contentPane.add(btnNewButton);
		contentPane.add(btnViewStudent);
		contentPane.add(btnLogout);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantLogin.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBackground(new Color(173, 216, 230));
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(468, 498, 130, 58);
		contentPane.add(btnNewButton_1);
	}

}
