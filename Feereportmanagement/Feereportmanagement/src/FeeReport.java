

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FeeReport extends JFrame {
	static FeeReport frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FeeReport();
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
	public FeeReport() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFeeReport = new JLabel("Fee Report Management");
		lblFeeReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeReport.setForeground(new Color(199, 21, 133));
		lblFeeReport.setBounds(158, 31, 403, 57);
		lblFeeReport.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setForeground(new Color(255, 99, 71));
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnAdminLogin.setBounds(265, 160, 253, 82);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminLogin.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnAccountantLogin = new JButton("Accountant Login");
		btnAccountantLogin.setForeground(new Color(255, 99, 71));
		btnAccountantLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		btnAccountantLogin.setBounds(265, 327, 253, 82);
		btnAccountantLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AccountantLogin.main(new String[]{});
				frame.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAccountantLogin);
		contentPane.add(btnAdminLogin);
		contentPane.add(lblFeeReport);
	}
}
