package java0510;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import java0510.FiveAws;

public class FiveAws extends JComponent implements MouseListener {
	
	List<Point> pointList = new ArrayList<Point>();
	static boolean open = true;
	static private boolean isHei = true;
	private int currentX = 0;//��ǰ���ӵ�x
	private int currentY = 0;//��ǰ���ӵ�y
	static private boolean isWinNow = false;
	public FiveAws(){
		this.addMouseListener(this);
	}
	//���� ����/����
	public void paint(Graphics g){
		//��������
		for(int i = -1;i<10;i++){
			g.drawLine(30, (i*60+90), 570, (i*60+90));
			g.drawLine((i*60+90), 30, (i*60+90), 570);
		}
		//��������
		
		for(Point p:pointList){
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), Point.size, Point.size);
		}
		
		//�ж���Ӯ
		isWin(g);
		
	}
	public void isWin(Graphics g){
		
		
		//��
		int dx = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<5&&nowX<=570;nowX += 60,i++){
			Point point = findPoint(nowX,currentY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//�жϰ���
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
		//��
		for(int nowX = currentX-60,i=0;i<5&&nowX>=0;nowX -= 60,i++){
			Point point = findPoint(nowX,currentY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dx++;
					}else{
						break;
					}
				}
				//�жϰ���
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
//			System.out.println("������"+dx);
//		}else{
//			System.out.println("������"+dx);
//		}
		//��
		int nb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=570;nowY += 60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//�жϰ���
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
		
		//��
		for(int nowX = currentX,nowY=currentY-60,i=0;i<=5 && nowY>=0;nowY -= 60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						nb++;
					}else{
						break;
					}
				}
				//�жϰ���
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
		//���� 
		int dnxb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=570 && nowX<=570;nowY += 60,nowX +=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//�жϰ���
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
		//����
		for(int nowX = currentX-60,nowY=currentY-60,i=0;i<=5 && nowY>=0 && nowX>=0;nowY -= 60,nowX -=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						dnxb++;
					}else{
						break;
					}
				}
				//�жϰ���
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
		//���� 
		int xndb = 0;
		for(int nowX = currentX,nowY=currentY,i=0;i<=5 && nowY<=570 && nowX>0;nowY += 60,nowX -=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//�жϰ���
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
		//����
		for(int nowX = currentX+60,nowY=currentY-60,i=0;i<=5 && nowY>=0 && nowX<=570;nowY -= 60,nowX +=60,i++){
			Point point = findPoint(nowX,nowY);
			if(point!=null){
				//�жϺ���
				if(isHei!=true){
					if(point.getColor()==Color.BLACK){
						xndb++;
					}else{
						break;
					}
				}
				//�жϰ���
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
				g.setFont(new java.awt.Font("΢���ź�",Font.ITALIC,30));
				g.drawString("����ʤ", 260, 300);
			}else{
				isWinNow = true;
				g.setColor(Color.red);
				g.setFont(new java.awt.Font("΢���ź�",Font.ITALIC,30));
				g.drawString("����ʤ", 260, 300);
			}
		}
	}
	//������
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
		if(open){
			return;
		}
		int x = e.getX();
		int y = e.getY();
		
		double xianX = Math.round((x-30)/60.0);
		double xianY = Math.round((y-30)/60.0);
		x = ((int)xianX)*60+10;
		y = ((int)xianY)*60+10;
		//��¼��ǰ����λ��
		currentX = x;
		currentY = y;
		boolean isHave = false;
		for(Point p:pointList){
			if(p.getX() == x && p.getY() == y){
				isHave = true;
			}
		}
		if(!isHave){
			Point point = new Point(x,y);
			if(isHei==true){
				//����
				point.setColor(Color.BLACK);
				isHei = false;
			}else{
				//����
				point.setColor(Color.WHITE);
				isHei = true;
			}
			pointList.add(point);
			
			//�û����� �ػ�
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
	public void openClose(boolean b){
		open = b;
	}
	public void egen(){
		isHei = true;
		open = false;
		isWinNow = false;
		pointList.clear();
		repaint();
	}

}

