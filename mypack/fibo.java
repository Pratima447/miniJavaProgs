package mypack;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class fibo extends Frame
{
	Label info    = new Label("Enter the number btween 1 to 20 to find fibonacci series");
	Label result  = new Label();
	TextField num = new TextField();
	Button ok     = new Button("Ok");
	Button close  = new Button("Close");
  
    public fibo()
	{
        add(info);
		add(num);
		add(ok);
		add(close);
		add(result);
	
		ok.addActionListener(new findSeries());
		close.addActionListener(new closeSeries());
		info.setBounds(20,45,300,100);
		num.setBounds(50,150,100,50);
		ok.setBounds(60,255,70,30);
		close.setBounds(200,255,70,30);
	}
	
    class findSeries implements ActionListener
  	{
	public void actionPerformed(ActionEvent e)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			int f1 = 1, f2 = 1, f3, n, i;
			n = Integer.parseInt(num.getText());  
			
			if (n > 20)
			{
				result.setText("Please enter number between 1 to 20)");
				n = 0;
			}
			list.add(f1);
			list.add(f2);
			for (i = 2; i < n; i++)
			{
				f3 = f1 + f2;
				list.add(f3);
				f1 = f2;
				f2 = f3;
			}
			result.setText("Series...."+list);
		}
	}

	class closeSeries implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			setVisible(false);
		}
	}
}
