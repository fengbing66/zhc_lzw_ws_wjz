package movie_manager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Searchface implements ActionListener{
	JButton myBtn;
	JTextField input;
	public void searchface() {
		JFrame frm = new JFrame();
		frm.setTitle("欢迎使用电影自助购票系统");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel topPanel = new JPanel();
		frm.getContentPane().add(topPanel, BorderLayout.NORTH);
		input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(30);
		myBtn = new JButton("电影查询");
		
		
		topPanel.add(input);
		topPanel.add(myBtn);
		ImagePanel2 ip=new ImagePanel2();
		ip.setBounds( 0, 0, 800, 600);
		frm.getContentPane().add(ip);
		myBtn.addActionListener(this);
		frm.setBounds(200, 0, 800, 800);
		frm.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==myBtn){
			 Client client=new Client();
			 client.searchByName(input.getText());
	}

}
}