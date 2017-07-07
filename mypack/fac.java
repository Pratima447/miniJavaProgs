package mypack;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class fac extends Frame
{
	Label info 		      = new Label("Enter any number between 1 to 60 to find its factorial");
	Label l2  			  = new Label();
	TextField requiredNum = new TextField();
	Button ok			  = new Button("Ok");
	Button close          = new Button("Close");
   
	public fac()
    {
		add(info);
		add(requiredNum);
		add(ok);
		add(close);
		add(l2);

		ok.addActionListener(new findFactorial());
		close.addActionListener(new closeFinding());

		info.setBounds(20,45,300,100);
		requiredNum.setBounds(100,145,100,50);
		ok.setBounds(120,245,70,30);
		close.setBounds(220,245,70,30);
	}

  	class findFactorial implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int num;
			long fac = 1, i = 1;
			num = Integer.parseInt(requiredNum.getText());
			while (i <= num)
			{
				fac = fac * i;
				i++;
			}
			l2.setText("Factorial :="+ fac);
		}
	}

	class closeFinding implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			setVisible(false);
		}
	}
}
