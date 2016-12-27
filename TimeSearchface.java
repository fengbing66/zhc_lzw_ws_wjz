package movie_manager;

import javax.swing.JButton;
import javax.swing.JFrame;

import movie.ImagePanel2;

public class TimeSearchface {
	int n=0;
	JButton tbtn1;
	JButton tbtn2;
	JButton tbtn3;
	JButton tbtn4;
	public void timeface(){
			JFrame frm = new JFrame();
			frm.setTitle("欢迎使用电影自助购票系统");
			frm.setLayout(null);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tbtn1 = new JButton("十二月"+n+1+"日");
			tbtn1.setBounds(0,0,150, 100);
			tbtn2 = new JButton("十二月"+n+2+"日");
			tbtn2.setBounds(200, 0,150, 100);
			tbtn3 = new JButton("十二月"+n+3+"日");
			tbtn3.setBounds(400, 0,150, 100);
			tbtn4 = new JButton("十二月"+n+4+"日");
			tbtn4.setBounds(600, 0,150, 100);
			frm.add(tbtn1);
			frm.add(tbtn2);
			frm.add(tbtn3);
			frm.add(tbtn4);
			
			ImagePanel2 ip=new ImagePanel2();
			ip.setBounds( 0, 100, 800, 600);
			frm.getContentPane().add(ip);
			frm.setBounds(200, 0, 800, 800);
			frm.setBounds(200, 0, 800, 800);
			frm.setVisible(true);	 
	}
}