import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Nextscreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Loginscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nextscreen window = new Nextscreen();
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
	public Nextscreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOU ARE LOGGEDIN TO NEXT PAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setBounds(31, 56, 356, 97);
		frame.getContentPane().add(lblNewLabel);
	}

}
