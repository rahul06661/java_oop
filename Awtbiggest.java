import java.awt.*;
import java.awt.event.*;
public class Awtbiggest implements ActionListener
{
    Frame f=new Frame();
    Label l1=new Label("first number");
    Label l2=new Label("second number");
    Label l3=new Label("third number");
    Label l4=new Lable("largest number");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    TextField t4=new TextField();
    
    Button b1=new Button("find");
    Button b2=new Button("cancel");
    
    Awtbiggest()
    {
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);
        l4.setBounds(50,220,100,20);
        
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);
        t4.setBounds(200,220,100,20);

b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);

f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(t1);
f.add(t2);
f.add(t4);
f.add(b1);
f.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

        
        
        
        
    }
    
}}