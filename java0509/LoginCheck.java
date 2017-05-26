package java0509;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginCheck extends JFrame {
	
	public LoginCheck(){
		this.setLayout(null);
		//¶¨Òå´°¿Ú
		this.setBounds(200, 500, 480, 600);
		//qq
		JLabel jl2 = new JLabel();
		jl2.setBounds(185, 16, 80, 80);
		jl2.setText("Q Q");
		jl2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",1,36));
		jl2.setForeground(Color.BLUE);
		this.add(jl2);
		//ÕËºÅ
		JLabel jl = new JLabel();
		jl.setBounds(100, 90, 60, 30);
		jl.setText("ÕËºÅ:");
		jl.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,20));
		this.add(jl);
		JTextField jf = new JTextField();
		jf.setBounds(170, 90, 180, 30);
		jf.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,20));
		this.add(jf);
		//ÃÜÂë
		JLabel jl1 = new JLabel();
		jl1.setBounds(100, 140, 60, 30);
		jl1.setText("ÃÜÂë:");
		jl1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,20));
		this.add(jl1);
		JPasswordField jp = new JPasswordField();
		jp.setBounds(170, 140, 180, 30);
		jp.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,20));
		this.add(jp);
		//½á¹û
		JLabel jl7 = new JLabel();
		this.add(jl7);
		//×¢²áÕËºÅ
		JButton jb2 = new JButton();
		jb2.setText("×¢²á");
		jb2.setBounds(130, 200, 80, 30);
		jb2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,22));
		jb2.setForeground(Color.RED);
		jb2.setBackground(Color.BLACK);
		JTextField jtf = new JTextField();
		this.add(jtf);
		JPasswordField jpf = new JPasswordField();
		this.add(jpf);
		JButton jb4 = new JButton();
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jb4.setText("×¢²á³É¹¦");
			}
		});
		this.add(jb4);
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ÕËºÅ
				jtf.setText("ÇëÊäÕËºÅ/ÃÜÂë(×Ô¶¨Òå)");
				jtf.setBounds(60, 350, 220, 30);
				jtf.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,20));
				//ÃÜÂë
				jpf.setBounds(60,400,220,30);
				jpf.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,20));
				//È·ÈÏ°´Å¥
				jb4.setText("È·ÈÏ");
				jb4.setBounds(110, 450, 120, 30);
				jb4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,20));
			}
		});
		this.add(jb2);
		//È·ÈÏµÇÂ¼
		JButton jb3 = new JButton();
		jb3.setText("µÇÂ¼");
		jb3.setBounds(245, 200, 80, 30);
		jb3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,22));
		jb3.setForeground(Color.RED);
		jb3.setBackground(Color.BLACK);
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jtf.getText().equals(jf.getText())&&jpf.getText().equals(jp.getText())){
					jl7.setText("µÇÂ¼³É¹¦");
					jl7.setBounds(60,260,100,30);
					jl7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,18));
				}else{
					jl7.setText("µÇÂ¼Ê§°Ü£¬ÇëÖØÐÂµÇÂ¼");
					jl7.setBounds(60,260,200,30);
					jl7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ",0,18));
				}
			}
		});
		this.add(jb3);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new LoginCheck();
	}

}
