package java0509;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RGBLight extends JFrame {
	
	boolean flag = true;
	
	public RGBLight(){
		this.setLayout(null);
		this.setTitle("���̵�");
		//���崰��
		this.setBounds(500, 200, 480, 600);
		JButton jb = new JButton();
		jb.setText("��ʼ");
		jb.setBounds(170, 320, 120, 30);
		jb.setFont(new java.awt.Font("΢���ź�",0,24));
		this.add(jb);
		//���̵�
		Icon ic = new ImageIcon("d://1.jpg");
		Icon ic2 = new ImageIcon("d://2.jpg");
		Icon ic3 = new ImageIcon("d://3.jpg");
		JLabel jl = new JLabel();
		jl.setBounds(180, 30, 101, 242);
		this.add(jl);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						if(jb.getText().equals("��ʼ")){
							flag = true;
						}else if(jb.getText().equals("����")){
							flag = false;
						}
						jb.setText("����");
						while(flag){
							try{
							jl.setIcon(ic);
							Thread.sleep(4000);
							jl.setIcon(ic2);
							Thread.sleep(2000);
							jl.setIcon(ic3);
							Thread.sleep(4000);
							}catch(Exception e){
								e.printStackTrace();
							}
						}
					}
				}).start();
			}
		});
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new RGBLight();
	}

}