

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
import java.awt.Component;

public class ViewStudent extends JFrame {
	static ViewStudent frame;
	public ViewStudent() {
		getContentPane().setBackground(new Color(152, 251, 152));
		setBackground(new Color(211, 211, 211));
		//Code to view data in JTable
		List<Student> list=StudentDao.view();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(Student s:list){
			data[row][0]=String.valueOf(s.getRollno());
			data[row][1]=s.getName();
			data[row][2]=s.getEmail();
			data[row][3]=s.getCourse();
			data[row][4]=String.valueOf(s.getFee());
			data[row][5]=String.valueOf(s.getPaid());
			data[row][6]=String.valueOf(s.getDue());
			data[row][7]=s.getAddress();
			data[row][8]=s.getCity();
			data[row][9]=s.getState();
			data[row][10]=s.getCountry();
			data[row][11]=s.getContactno();
			
			row++;
		}
		String columnNames[]={"Rollno","Name","Email","Course","Fee","Paid","Due","Address","City","State","Country","Contact No"};
		getContentPane().setLayout(null);
		
		JTable jt=new JTable(data,columnNames);
		jt.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		jt.setForeground(new Color(255, 0, 0));
		jt.setBackground(new Color(248, 248, 255));
		JScrollPane sp=new JScrollPane(jt);
		sp.setBounds(24, 30, 1019, 487);
		getContentPane().add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1092, 591);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
