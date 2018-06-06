# Java_gui_teast
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{
	 private JButton jb;
	 JTextField jf;
	 JPasswordField jpf;
   public Window()
   {
	 super("Window");
	 
	// ImageIcon ig=new ImageIcon("jjjj.jpg");
	 
	 JPanel jp=new JPanel();
	 JLabel jl1=new JLabel("Username");
	 JLabel jl2=new JLabel("Password");
	 jf=new JTextField();
	 jpf=new JPasswordField();
	 jb=new JButton("Login");
	 
	 jp.setBackground(Color.BLACK);
	 jl1.setForeground(Color.green);
	 jl2.setForeground(Color.green);
	 jf.setBackground(Color.GRAY);
	 jf.setForeground(Color.green);
	 jpf.setBackground(Color.GRAY);
	 jpf.setForeground(Color.green);
	 jb.setBackground(Color.black);
	 jb.setForeground(Color.green);
	 
	 setLayout(new BorderLayout());
	 jp.setLayout(null);
	 jl1.setBounds(30, 40, 70, 30);
	 jf.setBounds(180, 40, 120, 30);
	 jl2.setBounds(30, 130, 130, 30);
	 jpf.setBounds(180, 130, 120, 30);
	 jb.setBounds(230, 190, 70, 30);
	 
	 add(jp);
	 jp.add(jl1);
	 jp.add(jl2);
	 jp.add(jf);
	 jp.add(jpf);
	 jp.add(jb);
	 
	 setSize(400,400);
	 setLocationRelativeTo(null);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setVisible(true);
	 jb.addActionListener(this);
   }
	
  public static void main(String[] args)
  {
	new Window();
  }
  @Override
public void actionPerformed(ActionEvent e) 
  {
	if(e.getSource()==jb)
	{
		if(jf.getText().equals("kyaw")&jpf.getText().equals("123"))
		{
		setVisible(false);
		new Second();
		}
	}

  }
}
