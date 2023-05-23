package report0519.calc;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex01_Calc3 extends JFrame {
	public Ex01_Calc3() {
		super("계산기3");

		JPanel np = new JPanel();

		
		JTextField jtf1 = new JTextField(5);

		
		JTextField jtf2 = new JTextField(5);
		
		String[] oper = {"선택하세요", "+", "-","*","/"};
		
		JComboBox<String> jcom = new JComboBox<>(oper);
		
		np.add(new JLabel("수1: "));
		np.add(jtf1);
		np.add(new JLabel("수2: "));
		np.add(jtf2);
		np.add(new JLabel("연산자: "));
		np.add(jcom);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);	// 자동 줄바꾸기
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		add(np,BorderLayout.NORTH);
		add(jta,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01_Calc3();
	}
}