package vaul;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.text.FlowView;

public class vaul extends JFrame {
	
	public static JFrame frame = new JFrame("¤¾¤¾¤¾");
	public static JButton[][] jb = new JButton[3][3];
	JButton sum = new JButton();
	JButton MagSq = new JButton();
	public static JLabel[][] jl = new JLabel[5][5];
	public static int[][] hell = {{1,2,3},{4,5,6},{7,8,9}};
	public static int[][] labeltext = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
	Container ctp;
	public static int x=0,y=1;
	boolean make = true;
	
	public vaul()
	{
		super("¹è¿­");
		ctp = getContentPane();
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				jb[i][j] = new JButton("gell");
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				jl[i][j] = new JLabel();
		
		sum = new JButton("sum");
		MagSq = new JButton("MagSq");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SwingUtilities.updateComponentTreeUI(frame);
	}
	
	public void makeGUI()
	{
		setSize(400,600);
		ctp.setLayout(null);
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
			{
				jb[i][j].setBorder(null);
				jb[i][j].setSize(40,40);
				jb[i][j].setLocation(j*50+20,i*50+20);
				jb[i][j].setText(String.valueOf(hell[i][j]));
				jb[i][j].addActionListener(new MyActionListener());
				frame.getContentPane().add(jb[i][j]);
				ctp.add(jb[i][j]);
			}
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
			{
				jl[i][j].setBorder(null);
				jl[i][j].setSize(40,40);
				jl[i][j].setLocation(j*50+40,i*50+250);
				jl[i][j].setText("_");
				frame.getContentPane().add(jl[i][j]);
				ctp.add(jl[i][j]);
			}
		
		sum.setBorder(null);
		sum.setSize(40,40);
		sum.setLocation(20,170);
		sum.addActionListener(new MyActionListener());
		ctp.add(sum);
		
		MagSq.setBorder(null);
		MagSq.setSize(40,40);
		MagSq.setLocation(70,170);
		MagSq.addActionListener(new MyActionListener());
		ctp.add(MagSq);
		setVisible(true);
	}

	public JLabel getJLabel (int x,int y){
		return jl[y][x];
	}
	
	public static void main(String args[]) {
		vaul va = new vaul();
		va.makeGUI();
	}
}
