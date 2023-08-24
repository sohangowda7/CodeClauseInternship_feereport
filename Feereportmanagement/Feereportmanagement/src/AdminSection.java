import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AdminSection extends JFrame {
	static AdminSection frame;
	private JPanel contentPane;
	JScrollPane sp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminSection();
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
	public AdminSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 546);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setForeground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminSection.setBounds(188, 10, 332, 58);
		lblAdminSection.setForeground(new Color(255, 0, 0));
		lblAdminSection.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.setForeground(new Color(255, 0, 0));
		btnAddAccountant.setBackground(new Color(255, 255, 240));
		btnAddAccountant.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnAddAccountant.setBounds(254, 89, 211, 58);
		btnAddAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAccountant.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnViewAccountant = new JButton("View Accountant");
		btnViewAccountant.setBackground(new Color(255, 255, 240));
		btnViewAccountant.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnViewAccountant.setForeground(new Color(255, 0, 0));
		btnViewAccountant.setBounds(254, 173, 211, 63);
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAccountant.main(new String[]{});
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(255, 255, 240));
		btnLogout.setForeground(new Color(255, 0, 0));
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnLogout.setBounds(254, 360, 211, 58);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[]{});
				frame.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblAdminSection);
		contentPane.add(btnViewAccountant);
		contentPane.add(btnAddAccountant);
		contentPane.add(btnLogout);
		
		JButton btnNewButton = new JButton("Delete Accountant");
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteAccountant.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(252, 268, 211, 63);
		contentPane.add(btnNewButton);
	}
}
