package mypack;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class prime extends Frame 
{
    Label list     = new Label("Enter the limits for to find prime numbers between them");
    Label display  = new Label();
    TextField num1 = new TextField();
    TextField num2 = new TextField();
    Button find    = new Button("Find");
    Button close   = new Button("Close");

    public prime()	
    {
        add(list);
        add(num1);
        add(num2);
        add(find);
        add(close);
        add(display);        
        find.addActionListener(new findPrime());
        close.addActionListener(new closePrime());

        list.setBounds(20,45,500,20);	
        num1.setBounds(120,100,100,30);
        num2.setBounds(120,145,100,30);
        find.setBounds(120,245,70,30);
        close.setBounds(220,245,70,30);
        display.setBounds(10, 345, 500, 500);
    }

    class findPrime implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
	    {
            ArrayList<Integer> primeList = new ArrayList<Integer>();
            int temp = 0, low, up, i, j, prime = 1, data = 1;
            low = Integer.parseInt(num1.getText());
            up  = Integer.parseInt(num2.getText());
            
            if ( (low > 50 || up > 50 || low < -50 || up < -50) || (low == up) ) 
            {
                data = 0;
                num1.setText("");
                num2.setText("");
                low = up = 0;
            }

            if (low > up) 
            {
                temp = low;
                low  = up;
                up   = temp;
            }

            for(i = low + 1; i < up; i++)
            {
                prime = 1;
                for (j = 2; j < i/2; j++)
                {
                    if ((i % j) == 0)
                    {
                        prime = 0;
                        break;
                    }
                }

                if (prime == 1)
                {
                    primeList.add(i);
                }
            }

            if (data == 0)
                display.setText("Please enter different values between (50 and -50)");
            else
                display.setText("Prime numbers btw the limits are :- " + primeList);
     	}
    }

    class closePrime implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            setVisible(false);
        }
    }
}
