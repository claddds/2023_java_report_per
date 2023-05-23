package report0519.mem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Member_join extends JFrame {
	public Member_join() {
		
		super("회원가입");
		
		JPanel all_jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JPanel namegender_jp = new JPanel();
		
		JTextField name_text = new JTextField(8);
		
		namegender_jp.add(new JLabel("이름: "));
		namegender_jp.add(name_text);
		namegender_jp.add(new JLabel("성별: "));
		JRadioButton gender_man = new JRadioButton("남");
		JRadioButton gender_woman = new JRadioButton("여");
		
		// 하나만 선택되기 위해 라디오 버튼을 ButtonGroup에 넣는다
		ButtonGroup bg = new ButtonGroup();
		bg.add(gender_man);
		bg.add(gender_woman);
		
		namegender_jp.add(gender_man);
		namegender_jp.add(gender_woman);
		
		all_jp.add(namegender_jp);
		
		JPanel birth_jp = new JPanel();
		
		JTextField birth_text = new JTextField(8);
		
		birth_jp.add(new JLabel("생년월일: "));
		birth_jp.add(birth_text);
		
		all_jp.add(birth_jp);
		
		JPanel addr_jp = new JPanel();
		
		JTextField addr_text = new JTextField(15);
		
		addr_jp.add(new JLabel("주소: "));
		addr_jp.add(addr_text);
		
		all_jp.add(addr_jp);
		
		JPanel part_jp = new JPanel();
		
		String[] part = {"부서", "대충", "부서", "이름","넣자"};
		JComboBox<String> part_com = new JComboBox<>(part);
		
		part_jp.add(new JLabel("부서명: "));
		part_jp.add(part_com);
		
		all_jp.add(part_jp);
		
		JPanel hobby_jp = new JPanel();
		
		JCheckBox exercise = new JCheckBox("운동");
		JCheckBox movie = new JCheckBox("영화");
		JCheckBox book = new JCheckBox("독서");
		JCheckBox computer = new JCheckBox("컴퓨터");
		
		
		hobby_jp.add(new JLabel("취미: "));
		hobby_jp.add(exercise);
		hobby_jp.add(movie);
		hobby_jp.add(book);
		hobby_jp.add(computer);
		
		all_jp.add(hobby_jp);
		
		JPanel self_jp = new JPanel();
		self_jp.add(new JLabel("자 기 소 개"));
		
		all_jp.add(self_jp);
		
		JPanel self_bjp = new JPanel();
		JTextArea self_area = new JTextArea(10,24);
		self_bjp.add(self_area);
		
		all_jp.add(self_bjp);
		
		JPanel save_jp = new JPanel();
		JButton save = new JButton("저 장");
		JButton end = new JButton("종 료");
		JButton cancel = new JButton("취 소");
		/*
		save.setBounds(30, 400, 60, 40);
		end.setBounds(120, 400, 60, 40);
		cancel.setBounds(160, 400, 60, 40);
		*/
		save_jp.add(save);
		save_jp.add(end);
		save_jp.add(cancel);
		
		all_jp.add(save_jp);
		
		/*
		add(all_jp,BorderLayout.NORTH);
		add(self_bjp,BorderLayout.CENTER);
		add(save_jp,BorderLayout.SOUTH);
		*/
		add(all_jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(ds.width/2 -150, ds.height/2-250, 300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Member_join();
	}
}