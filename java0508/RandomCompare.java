package java0508;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RandomCompare extends JFrame {
	boolean flag = true;
	
	public RandomCompare(){
		this.setTitle("比价");
		this.setLayout(null);
		this.setBounds(200, 400, 480, 600);
		//输入框
		JTextField jtf = new JTextField();
		jtf.setBounds(70, 70, 80, 40);
		jtf.setFont(new java.awt.Font("微软雅黑",0,22));
		this.add(jtf);
		//随机数框
		JTextField jtf2 = new JTextField();
		jtf2.setBounds(290, 70, 80, 40);
		jtf2.setFont(new java.awt.Font("微软雅黑",0,22));
		this.add(jtf2);
		//结果
		JLabel jl = new JLabel();
		jl.setBounds(180, 200, 90, 40);
		jl.setFont(new java.awt.Font("微软雅黑",1,25));
		this.add(jl);
		//提示
		JLabel ja = new JLabel();
		ja.setText("提示：请在左边框内输入0-10任意数字");
		ja.setFont(new java.awt.Font("微软雅黑",1,18));
		ja.setForeground(Color.GRAY);
		ja.setBounds(70, 10, 400, 30);
		this.add(ja);
		//开始比较按钮
		JButton jb = new JButton();
		jb.setText("开始");
		jb.setBounds(175, 140, 90, 40);
		jb.setFont(new java.awt.Font("微软雅黑",0,24));
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						if(jb.getText().equals("开始")){
							flag = true;
						}else if(jb.getText().equals("结束")){
							flag = false;
						}
						jb.setText("结束");
						while(flag){
							try {
								Thread.sleep(0);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							jtf2.setText((int) (Math.random()*10) + "");
						}
						
						if(jtf2.getText().equals(jtf.getText())){
							jl.setText("相    同");
							jl.setForeground(Color.GREEN);
						}else{
							jl.setText("不相同");
							jl.setForeground(Color.RED);
						}
					}
				}).start();
			}
		});
		
		this.add(jb);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new RandomCompare();
	}

}
