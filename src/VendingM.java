import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class VendingM extends JApplet 
{
    
    private final JLabel label1;
    private final JButton fiveJButton;
    private final JButton tenJButton;
    private final JButton twentyfiveJButton;
    int value=75;
    
    public VendingM()
    {
        
        getContentPane().setLayout(new BorderLayout());
        JPanel j=new JPanel();
        label1=new JLabel("Please Add 75 to Enjoy Your Soda");
        j.add(label1);
        getContentPane().add(BorderLayout.CENTER,j);
        
        
        JPanel p = new JPanel();
        fiveJButton=new JButton("5");
        fiveJButton.setToolTipText("Press to Add 5");
        p.add(fiveJButton);
        
        tenJButton=new JButton("10");
        tenJButton.setToolTipText("Press to Add 10");
        p.add(tenJButton);
        twentyfiveJButton=new JButton("25");
        twentyfiveJButton.setToolTipText("Press to Add 25");
        p.add(twentyfiveJButton);
        getContentPane().add(BorderLayout.SOUTH, p);
        ButtonHandler handler=new ButtonHandler();
        fiveJButton.addActionListener(handler);
        tenJButton.addActionListener(handler);
        twentyfiveJButton.addActionListener(handler);
        
       }
    private class ButtonHandler implements ActionListener
    {  
        public void actionPerformed(ActionEvent e)
        {
           
           if(e.getSource()==fiveJButton)
           {
             
               value=value-5;
               if(value>0)
               {
                   
                label1.setText("Please Enter "+value);    
               }
               else
               {
                   label1.setText("Enjoy Your Drink And Thank you For using My Vending Machine.Have a Nice Day..!!");
               }
                  
                         
                 
           }
           else if(e.getSource()==tenJButton)
           {
               value=value-10;
               if(value>0)
               {
                   label1.setText("Please Enter "+value);
               }
                else
               {
                   label1.setText("Enjoy Your Drink And Thank you For using My Vending Machine.Have a Nice Day..!!");
               }
               
           }
           else if(e.getSource()==twentyfiveJButton)
           {
               value=value-25;
               if(value>0)
               {
                   label1.setText("Please Enter "+value);
               }
                else
               {
                   label1.setText("Enjoy Your Drink And Thank you For using My Vending Machine.Have a Nice Day..!!");
               }
           }
        }
    
    }
   
}

   
   

