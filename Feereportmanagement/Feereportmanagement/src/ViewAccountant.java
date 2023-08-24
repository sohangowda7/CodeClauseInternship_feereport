

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class ViewAccountant extends JFrame {
	static ViewAccountant frame;
	public ViewAccountant() {
		getContentPane().setBackground(new Color(152, 251, 152));
		setBackground(new Color(255, 255, 240));
		//Code to view data in JTable
		List<Accountant> list=AccountantDao.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(Accountant a:list){
			data[row][0]=String.valueOf(a.getId());
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getContactno();
			row++;
		}
		String columnNames[]={"Id","Name","Password","Email","Contact No"};
		getContentPane().setLayout(null);
		
		JTable jt=new JTable(data,columnNames);
		jt.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		jt.setBackground(new Color(230, 230, 250));
		jt.setForeground(new Color(255, 0, 0));
		JScrollPane sp=new JScrollPane(jt);
		sp.setBounds(10, 26, 816, 368);
		getContentPane().add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 850, 455);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewAccountant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
