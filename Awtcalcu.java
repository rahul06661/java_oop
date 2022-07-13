/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtcalcu;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author sjcet
 */
public class Awtcalcu implements ActionListener {
    Frame f =new Frame();
    Label l1 = new Label("principal amount");
    Label l2 = new Label("number of years");
    Label l3 = new Label("rate of interest");
    Label l4 = new Label("simple interest");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    Button b1 = new Button("find");
    Button b2 = new Button("cancel");
    Awtcalcu(){
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);
        l4.setBounds(50,220,100,20);
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);
        t4.setBounds(200,220,100,20);
        b1.setBounds(50,250,50,20);
        b1.setBounds(110,250,50,20);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(b1);
        f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,350);
    }
    public class ActionPerformed extends (ActionEvent e) {
    int p = Integer.parseInt(t1.getText());
    int n = Integer .parseInt(t2.getText());
    int r = Integer .parseInt(t3.getText());
    if (e.getSource()==b1){
    t4.setText(String.Value ((p*n*r)/100));
    
    }
    if(e.getSource()==b2){
        System.exit(0);
    }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Awtcalcu();
        // TODO code application logic here
    }
    
}
