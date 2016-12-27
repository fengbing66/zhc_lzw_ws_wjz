package movie_manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;

public class Mainface extends JFrame implements ActionListener {
	JButton btn1;
	JButton btn2;
	public Mainface(){
		
		setTitle("电影购票系统");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,0,800,800);
		setVisible(true);
		ImagePanel1 ip=new ImagePanel1();
		ip.setBounds( 0, 0, 800, 600);
		getContentPane().add(ip);
		
		btn1 = new JButton("按上映时间查询");
		btn2 = new JButton("按电影名查询");
		btn1.setBounds(100,650,200,50);
		btn2.setBounds(500,650,200,50);
		add(btn1);
		add(btn2);
		btn2.addActionListener(this);
		btn1.addActionListener(this);
		}
	public static void main(String[] args) {
		MovieAdd m=new MovieAdd();
		m.movieadd();
		new Mainface();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==btn2){
			 Searchface fm=new Searchface();
			 fm.searchface();
	}
		 if(e.getSource()==btn1){
			 TimeSearchface fm=new TimeSearchface();
			 fm.timeface();
	}

}
}
