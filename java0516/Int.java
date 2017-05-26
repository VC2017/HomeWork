package java0516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Int implements Runnable {
	Socket socket;
	JTextArea jl;
	public Int(Socket socket,JTextArea jl){
		this.socket = socket;
		this.jl = jl;
	}
	@Override
	public void run() {
		while(true){
			//接收服务器端返回的内容
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String nr = br.readLine();
				//显示到窗口文本框中
				jl.setText(jl.getText()+"\n"+nr);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
