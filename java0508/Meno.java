package java0508;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class Meno extends JFrame {
	
	public Meno(){
		this.setLayout(null);
		this.setTitle("java���±�");
		//�˵���
		JMenuBar jmb = new JMenuBar();
		jmb.setBounds(0, 0, 480, 30);
		this.add(jmb);
		JTextArea jt = new JTextArea();
		jt.setBounds(0, 30, 480, 600);
		jt.setFont(new java.awt.Font("΢���ź�",0,19));
		this.add(jt);
		//�˵�ѡ��
		JMenu jm = new JMenu();
		jm.setText("�ļ�(F)");
		jm.setBounds(0, 0, 100, 40);
		jm.setFont(new java.awt.Font("΢���ź�",0,18));
		JMenu jm2 = new JMenu();
		jm2.setText("�༭(E)");
		jm2.setBounds(0, 0, 100, 40);
		jm2.setFont(new java.awt.Font("΢���ź�",0,18));
		JMenu jm3 = new JMenu();
		jm3.setText("��ʽ(0)");
		jm3.setBounds(0, 0, 100, 40);
		jm3.setFont(new java.awt.Font("΢���ź�",0,18));
		JMenu jm4 = new JMenu();
		jm4.setText("�鿴(V)");
		jm4.setBounds(0, 0, 100, 40);
		jm4.setFont(new java.awt.Font("΢���ź�",0,18));
		JMenu jm5 = new JMenu();
		jm5.setText("����(H)");
		jm5.setBounds(0, 0, 100, 40);
		jm5.setFont(new java.awt.Font("΢���ź�",0,18));
		jmb.add(jm);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jmb.add(jm5);
		//�˵�������
		JMenuItem jmi = new JMenuItem();
		jmi.setText("�½�");
		jmi.setBounds(0, 0, 150, 70);
		JMenuItem jmi2 = new JMenuItem();
		jmi2.setText("��");
		jmi2.setBounds(0, 70, 150, 70);
		JMenuItem jmi3 = new JMenuItem();
		jmi3.setText("����");
		JTextField jtf = new JTextField();
		this.add(jtf);
		jmi3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("D://test.txt");
				FileWriter fw = null;
				try {
					fw = new FileWriter(file);
					String ss = jt.getText();
					fw.write(ss);
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				jtf.setText("����ɹ�");
				jtf.setFont(new java.awt.Font("΢���ź�",0,28));
				jtf.setBounds(160, 100, 120, 40);
			}
		});
		jmi3.setBounds(0, 140, 150, 70);
		jmi.setFont(new java.awt.Font("΢���ź�",0,17));
		jmi2.setFont(new java.awt.Font("΢���ź�",0,17));
		jmi3.setFont(new java.awt.Font("΢���ź�",0,17));
		jm.add(jmi);
		jm.add(jmi2);
		jm.add(jmi3);
		JMenuItem jmi4 = new JMenuItem();
		jmi4.setText("����");
		jmi4.setBounds(0, 0, 150, 70);
		JMenuItem jmi5 = new JMenuItem();
		jmi5.setText("ճ��");
		jmi5.setBounds(0, 0, 150, 70);
		jm2.add(jmi4);
		jm2.add(jmi5);
		jmi4.setFont(new java.awt.Font("΢���ź�",0,17));
		jmi5.setFont(new java.awt.Font("΢���ź�",0,17));
		JMenuItem jmi6 = new JMenuItem();
		jmi6.setText("�Զ�����");
		jmi6.setBounds(0, 0, 150, 70);
		this.setBounds(200, 400, 480, 600);
		JMenuItem jmi7 = new JMenuItem();
		jmi7.setText("����");
		jmi7.setBounds(0, 0, 150, 70);
		jm3.add(jmi6);
		jm3.add(jmi7);
		jmi6.setFont(new java.awt.Font("΢���ź�",0,17));
		jmi7.setFont(new java.awt.Font("΢���ź�",0,17));
		JMenuItem jmi8 = new JMenuItem();
		jmi8.setText("״̬��");
		jmi8.setBounds(0, 0, 150, 70);
		JMenuItem jmi9 = new JMenuItem();
		jmi8.setFont(new java.awt.Font("΢���ź�",0,17));
		jm4.add(jmi8);
		jmi9.setText("�鿴����");
		jmi9.setBounds(0, 0, 150, 70);
		JMenuItem jmi10 = new JMenuItem();
		jmi10.setText("���ڼ��±�");
		jmi10.setBounds(0, 0, 150, 70);
		jm5.add(jmi9);
		jm5.add(jmi10);
		jmi9.setFont(new java.awt.Font("΢���ź�",0,17));
		jmi10.setFont(new java.awt.Font("΢���ź�",0,17));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Meno();
	}

}
