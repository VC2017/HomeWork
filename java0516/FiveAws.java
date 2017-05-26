package java0516;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class FiveAws extends JComponent implements MouseListener {
	
	List<Point> pointList = new ArrayList<Point>();
	
	private boolean isHei = true;
	static boolean open = false;
	private int currentX = 0;//当前棋子的x
	private int currentY = 0;//当前棋子的y
	private boolean isWinNow = false;
	public FiveAws(){
		this.addMouseListener(this);
	}
	//绘制 棋盘/棋子
	public  void paint(Graphics g){
		//绘制棋盘
		for(int i = -1;i<10;i++){
			g.drawLine(30, (i*60+90), 570, (i*60+90));
			g.drawLine((i*60+90), 30, (i*60+90), 570);
		}
		//绘制棋子
		
		for(Point p:pointList){
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), Point.size, Point.size);
		}
		
		//判断输赢
		isWin(g);
		
	}
	public void isWin(Graphics g){
		
		
		//东
		int dx = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<5&&nowX<=570;nowX += 60,i++){
			Point point = findPoint(nowX,currentY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						dx++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//西
		for(int nowX = currentX-60,i=0;i<5&&nowX>=0;nowX -= 60,i++){
			Point point = findPoint(nowX,currentY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						dx++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
//		if(isHei!=true){
//			System.out.println("黑子数"+dx);
//		}else{
//			System.out.println("白子数"+dx);
//		}
		//南
		int nb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=570;nowY += 60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						nb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		
		//北
		for(int nowX = currentX,nowY=currentY-60,i=0;i<=5 && nowY>=0;nowY -= 60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						nb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//东南 
		int dnxb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=570 && nowX<=570;nowY += 60,nowX +=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						dnxb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//西北
		for(int nowX = currentX-60,nowY=currentY-60,i=0;i<=5 && nowY>=0 && nowX>=0;nowY -= 60,nowX -=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						dnxb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//西南 
		int xndb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=570 && nowX>0;nowY += 60,nowX -=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						xndb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		//东北
		for(int nowX = currentX+60,nowY=currentY-60,i=0;i<=5 && nowY>=0 && nowX<=570;nowY -= 60,nowX +=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//判断黑子
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//判断白子
				if(isHei!=false){
					if(point.getColor()==Color.WHITE){
						xndb++;
					}else{
						break;
					}
				}
			}else{
				break;
			}
		}
		if(dx>=5||nb>=5||dnxb>=5||xndb>=5){
			if(isHei != true){
				isWinNow = true;
				g.setColor(Color.red);
				g.setFont(new java.awt.Font("微软雅黑",Font.ITALIC,30));
				g.drawString("黑子胜", 260, 300);
			}else{
				isWinNow = true;
				g.setColor(Color.red);
				g.setFont(new java.awt.Font("微软雅黑",Font.ITALIC,30));
				g.drawString("白子胜", 260, 300);
			}
		}
	}
	//找棋子
	public Point findPoint(int x,int y){
		for(Point p:pointList){
			if(p.getX() == x && p.getY() == y){
				return p;
			}
		}
		return null;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(!open){
			return;
		}
		int x = e.getX();
		int y = e.getY();
		
		double xianX = Math.round((x-30)/60.0);
		double xianY = Math.round((y-30)/60.0);
		x = ((int)xianX)*60+10;
		y = ((int)xianY)*60+10;
		//记录当前棋子位置
		currentX = x;
		currentY = y;
		
		boolean isHave = false;
		for(Point p:pointList){
			if(p.getX() == x && p.getY() == y){
				isHave = true;
			}
		}
		try {
			Socket socket = new Socket("192.168.199.238",9999);
			//发送棋子对象
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(new Point(x,y));
			//接收棋子对象
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			Point point3 = (Point) ois.readObject();
			pointList.add(point3);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(!isHave){
			Point point = new Point(x,y);
			if(isHei==true){
				//黑棋
				point.setColor(Color.BLACK);
				isHei = false;
			}else{
				//白棋
				point.setColor(Color.WHITE);
				isHei = true;
			}
			
			pointList.add(point);
			
			//用户触发 重画
			if(isWinNow == false){
				this.repaint();
			}
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args [] ){
		new FiveAws().windows();
	}
	public void windows(){
		JFrame jf = new JFrame();
		jf.setLayout(null);
		jf.setBounds(600, 300, 680, 680);
		jf.setTitle("五子棋");
		FiveAws fa = new FiveAws();
		fa.setBackground(Color.orange);
		fa.setBounds(40, 40, 600, 600);
		JButton jb = new JButton("开始游戏");
		jb.setBounds(70,20,100,40);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jb.getText().equals("开始游戏")){
					open = true;
					jb.setText("暂停游戏");
				}else if(jb.getText().equals("暂停游戏")){
					open = false;
					jb.setText("开始游戏");
				}
					
			}
			
		});
		jb.setFont(new java.awt.Font("微软雅黑",0,16));
		jf.add(jb);
		JButton jb2 = new JButton("重新开始");
		jb2.setBounds(290,20,100,40);
		jb2.setFont(new java.awt.Font("微软雅黑",0,16));
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				isHei = true;
				open = false;
				isWinNow = false;
				pointList.clear();
				System.out.println(pointList.size());
				new FiveAws().repaint();
			}
		});
		jf.add(jb2);
		JButton jb3 = new JButton("悔  棋");
		jb3.setBounds(512,20,100,40);
		jb3.setFont(new java.awt.Font("微软雅黑",0,16));
		jf.add(jb3);
		jf.add(fa);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBackground(Color.orange);
		jf.setVisible(true);
	}

}

