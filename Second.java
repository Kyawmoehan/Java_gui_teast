# Java_gui_teast
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Second extends JFrame{
	public Second() {
		super("Second");
		JPanel sjp=new JPanel();
		JLabel jl=new JLabel("Welcome from kyaw moe han");
		
		sjp.setBackground(Color.BLACK);
		jl.setForeground(Color.green);

		
		setLayout(new BorderLayout());
		sjp.setLayout(null);
		jl.setBounds(100, 80, 200, 30);
		
		add(sjp);
		sjp.add(jl);
		
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		//new Second();
	}

}
