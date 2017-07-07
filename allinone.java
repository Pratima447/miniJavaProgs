import mypack.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class allinone extends Frame
{
	Label list       = new Label("1.Prime btw   2.Pallindrome  3.Fibonacci   4.Factorial");
	TextField choice = new TextField();
	Button ok        = new Button("Done");
	Button close	 = new Button("Close");
	Label l2		 = new Label();

    public allinone()
	{
		add(list);
		add(choice);
		add(ok);
		add(close);
		add(l2);
		ok.addActionListener(new triggerEvent());
		close.addActionListener(new closeMe());

		list.setBounds(20,45,500,20);	
		choice.setBounds(120,100,50,30);
		ok.setBounds(220,145,70,30);
		close.setBounds(320,145,70,30);
	}

    class triggerEvent implements ActionListener
   	{
		public void actionPerformed(ActionEvent e)
		{
	 		int ch = Integer.parseInt(choice.getText());
	 
			if (ch == 1)
			{
				prime A = new prime();
				A.setSize(600,600);
				A.setTitle("PRIME NOS");
				A.setVisible(true);
			}
          	if (ch == 2)
			{
				pallindrome B = new pallindrome();
				B.setSize(600,600);
				B.setTitle("PALLINDROME");
				B.setVisible(true);
        	}

			if (ch == 3)
			{
				fibo  C = new fibo();
				C.setSize(600,600);
				C.setTitle("FIBONACCI");
				C.setVisible(true);
			}
	
			if (ch == 4)
			{
				fac D = new fac();
				D.setSize(600,600);
				D.setTitle("FACTORIAL");
				D.setVisible(true);
			}
    	}
	}

	class closeMe implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

    public static void main(String arg[])throws IOException
    {
		allinone object = new allinone();
		object.setSize(600,600);
		object.setTitle("YOUR CHOICE");
    	object.setVisible(true);
   	}
}

 


          