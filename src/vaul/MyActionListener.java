package vaul;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JButton;

class MyActionListener implements ActionListener {
	static int k = 1;
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        try
        {
	        if (Integer.parseInt(b.getText())>0)
	        {
	        	if(vaul.x==3&&vaul.y==3)
	        	{
	        		System.out.println("³¡³µ½À´Ï´Ù");
	        	}
	        	else if(vaul.x==3)
	        	{
	        		vaul.y++;
	        		vaul.x=1;
	        	}
	        	else
	        		vaul.x++;
	        	int val = Integer.parseInt(b.getText());
	        	vaul.labeltext[vaul.y][vaul.x] = val;
	        	vaul.jl[vaul.y][vaul.x].setText(b.getText());
	        	switch(val)
	        	{
	        	case 1:
	        		vaul.jb[0][0].setText("0");
	        		break;
	        	case 2:
	        		vaul.jb[0][1].setText("0");
	        		break;
	        	case 3:
	        		vaul.jb[0][2].setText("0");
	        		break;
	        	case 4:
	        		vaul.jb[1][0].setText("0");
	        		break;
	        	case 5:
	        		vaul.jb[1][1].setText("0");
	        		break;
	        	case 6:
	        		vaul.jb[1][2].setText("0");
	        		break;
	        	case 7:
	        		vaul.jb[2][0].setText("0");
	        		break;
	        	case 8:
	        		vaul.jb[2][1].setText("0");
	        		break;
	        	case 9:
	        		vaul.jb[2][2].setText("0");
	        		break;
	        	}
	        }
        }
        catch(Exception ex)
        {    	
        	if(b.getText().equals("sum"))
        	{
        		vaul.labeltext[1][4] = vaul.labeltext[1][1]+vaul.labeltext[1][2]+vaul.labeltext[1][3];
        		vaul.labeltext[2][4] = vaul.labeltext[2][1]+vaul.labeltext[2][2]+vaul.labeltext[2][3];
        		vaul.labeltext[3][4] = vaul.labeltext[3][1]+vaul.labeltext[3][2]+vaul.labeltext[3][3];
        		vaul.labeltext[4][1] = vaul.labeltext[1][1]+vaul.labeltext[2][1]+vaul.labeltext[3][1];
        		vaul.labeltext[4][2] = vaul.labeltext[1][2]+vaul.labeltext[2][2]+vaul.labeltext[3][2];
        		vaul.labeltext[4][3] = vaul.labeltext[1][3]+vaul.labeltext[2][3]+vaul.labeltext[3][3];
        		vaul.labeltext[4][0] = vaul.labeltext[1][3]+vaul.labeltext[2][2]+vaul.labeltext[3][1];
        		vaul.labeltext[4][4] = vaul.labeltext[1][1]+vaul.labeltext[2][2]+vaul.labeltext[3][3];
        	}
        	else if(b.getText().equals("MagSq"))
        	{
        		mabangjin();
        	}
        	
        	for(int i = 0; i < 5; i++)
        	{
        		for(int j = 0; j < 5; j++)
        		{
        			if(vaul.labeltext[i][j]>0)
        				vaul.jl[i][j].setText(String.valueOf(vaul.labeltext[i][j]));
        		}
        	}
        }
    }
    
    public static void mabangjin()
    {
        int Square[][] = new int[3][3];

        Random random = new Random();
        
        int iCount , i , j , x , y, index , a , b;
        iCount = 3;
        x = random.nextInt(3);
        y = random.nextInt(3);
        index = 1;
        for(j=0;j<iCount;j++) {
            for(i=0;i<iCount;i++) {
                a = ((x+i) + iCount) % iCount;
                b = ((y+i) + iCount) % iCount;
                Square[a][b] = index;            
                index++;
            }
            x = x - 1;
            y = y + 1;
        }
    	
    	for(int q = 0; q < 3; q++)
	    	for(int p = 0; p < 3; p++)
	    		vaul.labeltext[q+1][p+1] = Square[q][p];
    	
	    vaul.labeltext[1][4] = vaul.labeltext[1][1]+vaul.labeltext[1][2]+vaul.labeltext[1][3];
		vaul.labeltext[2][4] = vaul.labeltext[2][1]+vaul.labeltext[2][2]+vaul.labeltext[2][3];
		vaul.labeltext[3][4] = vaul.labeltext[3][1]+vaul.labeltext[3][2]+vaul.labeltext[3][3];
		vaul.labeltext[4][1] = vaul.labeltext[1][1]+vaul.labeltext[2][1]+vaul.labeltext[3][1];
		vaul.labeltext[4][2] = vaul.labeltext[1][2]+vaul.labeltext[2][2]+vaul.labeltext[3][2];
		vaul.labeltext[4][3] = vaul.labeltext[1][3]+vaul.labeltext[2][3]+vaul.labeltext[3][3];
		vaul.labeltext[4][0] = vaul.labeltext[1][3]+vaul.labeltext[2][2]+vaul.labeltext[3][1];
		vaul.labeltext[4][4] = vaul.labeltext[1][1]+vaul.labeltext[2][2]+vaul.labeltext[3][3];
		
		for(int q = 0; q < 3; q++)
	    	for(int p = 0; p < 3; p++)
	    		if(vaul.labeltext[q][p]>0)
    				vaul.jl[q][p].setText(String.valueOf(vaul.labeltext[q][p]));
    	
    }
}

