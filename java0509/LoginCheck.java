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
		//���崰��
		this.setBounds(200, 500, 480, 600);
		//qq
		JLabel jl2 = new JLabel();
		jl2.setBounds(185, 16, 80, 80);
		jl2.setText("Q Q");
		jl2.setFont(new java.awt.Font("΢���ź�",1,36));
		jl2.setForeground(Color.BLUE);
		this.add(jl2);
		//�˺�
		JLabel jl = new JLabel();
		jl.setBounds(100, 90, 60, 30);
		jl.setText("�˺�:");
		jl.setFont(new java.awt.Font("΢���ź�",0,20));
		this.add(jl);
		JTextField jf = new JTextField();
		jf.setBounds(170, 90, 180, 30);
		jf.setFont(new java.awt.Font("΢���ź�",0,20));
		this.add(jf);
		//����
		JLabel jl1 = new JLabel();
		jl1.setBounds(100, 140, 60, 30);
		jl1.setText("����:");
		jl1.setFont(new java.awt.Font("΢���ź�",0,20));
		this.add(jl1);
		JPasswordField jp = new JPasswordField();
		jp.setBounds(170, 140, 180, 30);
		jp.setFont(new java.awt.Font("΢���ź�",0,20));
		this.add(jp);
		//���
		JLabel jl7 = new JLabel();
		this.add(jl7);
		//ע���˺�
		JButton jb2 = new JButton();
		jb2.setText("ע��");
		jb2.setBounds(130, 200, 80, 30);
		jb2.setFont(new java.awt.Font("΢���ź�",0,22));
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
				jb4.setText("ע��ɹ�");
			}
		});
		this.add(jb4);
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�˺�
				jtf.setText("�����˺�/����(�Զ���)");
				jtf.setBounds(60, 350, 220, 30);
				jtf.setFont(new java.awt.Font("΢���ź�",0,20));
				//����
				jpf.setBounds(60,400,220,30);
				jpf.setFont(new java.awt.Font("΢���ź�",0,20));
				//ȷ�ϰ�ť
				jb4.setText("ȷ��");
				jb4.setBounds(110, 450, 120, 30);
				jb4.setFont(new java.awt.Font("΢���ź�",0,20));
			}
		});
		this.add(jb2);
		//ȷ�ϵ�¼
		JButton jb3 = new JButton();
		jb3.setText("��¼");
		jb3.setBounds(245, 200, 80, 30);
		jb3.setFont(new java.awt.Font("΢���ź�",0,22));
		jb3.setForeground(Color.RED);
		jb3.setBackground(Color.BLACK);
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jtf.getText().equals(jf.getText())&&jpf.getText().equals(jp.getText())){
					jl7.setText("��¼�ɹ�");
					jl7.setBounds(60,260,100,30);
					jl7.setFont(new java.awt.Font("΢���ź�",0,18));
				}else{
					jl7.setText("��¼ʧ�ܣ������µ�¼");
					jl7.setBounds(60,260,200,30);
					jl7.setFont(new java.awt.Font("΢���ź�",0,18));
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
