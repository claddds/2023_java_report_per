package report0531.dbbase;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Dbbase extends JFrame {
	JPanel jp_u, jp_b;
	JTextField custid, name, address, phone;
	JTextArea jta;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;

	public Dbbase() {
		super("DB 연동 정보");
		
		jp_u = new JPanel();
		jp_u.setLayout(new GridLayout(4,2));
		
		custid = new JTextField(20);
		jp_u.add(new JLabel("CUSTID : "));
		jp_u.add(custid);
		
		name = new JTextField(20);
		jp_u.add(new JLabel("NAME : "));
		jp_u.add(name);
		
		address = new JTextField(20);
		jp_u.add(new JLabel("ADDRESS : "));
		jp_u.add(address);
		
		phone = new JTextField(20);
		jp_u.add(new JLabel("PHONE : "));
		jp_u.add(phone);
		
		
		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp_b = new JPanel();
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");
		jb6.setEnabled(false);
		
		jp_b.add(jb1);
		jp_b.add(jb2);
		jp_b.add(jb3);
		jp_b.add(jb4);
		jp_b.add(jb5);
		jp_b.add(jb6);
		
		
		add(jp_u, BorderLayout.NORTH);
		add(jta, BorderLayout.CENTER);
		add(jp_b, BorderLayout.SOUTH);
		
		setSize(600, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Dbbase();
	}
}
