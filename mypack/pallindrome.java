package mypack;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
 
public class pallindrome extends Frame
{
	Label guide 	 = new Label("Enter the number to find if it is a Pallindrome");
	Label result 	 = new Label();
	TextField getNum = new TextField();
	Button ok 		 = new Button("OK");
	Button close	 = new Button("Close");

	public pallindrome()
	{
		add(guide);
		add(getNum);
		add(ok);
		add(close);
		add(result);
		
		ok.addActionListener(new checkPalli());
		close.addActionListener(new closePalli());
		guide.setBounds(20,45,300,100);
		getNum.setBounds(50,150,200,50);
		ok.setBounds(70,250,70,30);
		close.setBounds(150,250,70,30);
		}

	class checkPalli implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			long num, n, rem, rev = 0;
			num = Integer.parseInt(getNum.getText());
			n = num;
			
			while ( num > 0)
			{
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}

			if (n == rev)
				result.setText("Yes the number is Pallindrome :- " + rev);
			else
				result.setText("Nope, the number is Not Pallindrome :- " + rev);
		}
	}

	class closePalli implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			setVisible(false);
		}
	}
}
