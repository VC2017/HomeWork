package java0510;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FiveAwa extends JFrame {
	
	public FiveAwa(){
		this.setLayout(null);
		this.setBounds(600, 300, 680, 680);
		this.setTitle("������");
		FiveAws fa = new FiveAws();
		fa.setBackground(Color.orange);
		fa.setBounds(40, 40, 600, 600);
		JButton jb = new JButton("��ʼ��Ϸ");
		jb.setBounds(70,20,100,40);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jb.getText().equals("��ʼ��Ϸ")){
					FiveAws.open=false;
					jb.setText("��ͣ��Ϸ");
				}else if(jb.getText().equals("��ͣ��Ϸ")){
					FiveAws.open=true;
					jb.setText("��ʼ��Ϸ");
				}
					
			}
		});
		jb.setFont(new java.awt.Font("΢���ź�",0,16));
		this.add(jb);
		JButton jb2 = new JButton("���¿�ʼ");
		jb2.setBounds(290,20,100,40);
		jb2.setFont(new java.awt.Font("΢���ź�",0,16));
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new FiveAws().egen();
				
			}
		});
		this.add(jb2);
		JButton jb3 = new JButton("��  ��");
		jb3.setBounds(512,20,100,40);
		jb3.setFont(new java.awt.Font("΢���ź�",0,16));
		this.add(jb3);
		this.add(fa);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.orange);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FiveAwa();
	}

}
