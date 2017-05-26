package java0508;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Main extends JFrame {

	public Main(){
		this.setLayout(null);
		JLabel jc = new JLabel();
		jc.setText("QQ");
		jc.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄",1,24));
		jc.setForeground(Color.red);
		jc.setBounds(240, 25, 50, 50);
		this.add(jc);
		//µ«¬º”√ªß√˚
		JLabel jl = new JLabel();
		jl.setText("’À∫≈:");
		jl.setForeground(Color.blue);
		jl.setBounds(70, 90, 50, 40);
		this.add(jl);
		JTextField jt = new JTextField();
		jt.setText("");
		jt.setBounds(120, 90, 300, 40);
		this.add(jt);
		// ‰»Î√‹¬Î
		JPasswordField jp = new JPasswordField();
		jp.setText("");
		jp.setBounds(120, 140, 300, 40);
		this.add(jp);
		JLabel ja = new JLabel();
		ja.setText("√‹¬Î:");
		ja.setForeground(Color.blue);
		ja.setBounds(70, 140, 50, 40);
		this.add(ja);
		this.setBounds(660, 300, 500, 500);
		this.setVisible(true);
		//»∑»œµ«¬º
		JButton jb = new JButton();
		jb.setText("¡¢º¥µ«¬º");
		jb.setBounds(140, 190, 100, 40);
		this.add(jb);
		JButton ju = new JButton();
		ju.setText("◊¢≤·’À∫≈");
		ju.setBounds(300, 190, 100, 40);
		this.add(ju);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

