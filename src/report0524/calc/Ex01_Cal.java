package report0524.calc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01_Cal extends JFrame implements ActionListener, ItemListener{
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JRadioButton add, sub, mul, div;
	ButtonGroup bg;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3;
	
	public Ex01_Cal() {
		super("계산기");
		
		jp1 = new JPanel();
		jtf1 = new JTextField(5);
		jtf2 = new JTextField(5);
		
		add = new JRadioButton("+");
		sub = new JRadioButton("-");
		mul = new JRadioButton("*");
		div = new JRadioButton("/");
		
		bg = new ButtonGroup();
		bg.add(add);
		bg.add(sub);
		bg.add(mul);
		bg.add(div);
		
		jp1.add(new JLabel("수 1: "));
		jp1.add(jtf1);
		jp1.add(new JLabel("수 2: "));
		jp1.add(jtf2);
		jp1.add(new JLabel("연산자: "));
		jp1.add(add);
		jp1.add(sub);
		jp1.add(mul);
		jp1.add(div);
		
		
		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jp2 = new JPanel();
		jb1 = new JButton("계 산");
		jb2 = new JButton("종 료");
		jb3 = new JButton("취 소");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		double num1, num2, result;
		
		num1 = Double.parseDouble(jtf1.getText());
		num2 = Double.parseDouble(jtf2.getText());
		
		if(add.isSelected()) {
			result = num1 + num2;
			
		}else if(sub.isSelected()) {
			result = num1 - num2;
		}else if(mul.isSelected()) {
			result = num1 * num2;
		}else if(div.isSelected()) {
			result = num1 / num2;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		if(obj==jb1) {
			
		}else if(obj==jb2) {
			System.exit(0);
		}else if(obj==jb3) {
			bg.clearSelection();
			jta.setText("");
		}
	}
	
	public static void main(String[] args) {
		new Ex01_Cal();
	}

}
