
package projectdb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Statement;


public class imageclass2 extends JFrame   implements ActionListener    {
    JLabel l1,l2,l3;
    JButton b1,b2;
    JTextField t1,t2,t3;
    image2 im=new image2();
 // image2 m=new image();
    public imageclass2(){
        sho();
    }
    public void sho(){
        this.setTitle("sign in");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLocation(300,300);
        this.add(im);
        //user_name    password dapartment
        
        l1=new  JLabel("user_name");
        l2=new  JLabel("password");
           l3=new  JLabel("dapartment");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        b1=new JButton("save");
        b2=new JButton("cancel");
        
        l1.setBounds(10, 10, 70, 30);t1.setBounds(70, 10, 40,30);
        l2.setBounds(10,60,70,30);t2.setBounds(70, 60, 40,30);
         l3.setBounds(10,100,70,30);t3.setBounds(70, 100,40,30);
         //button add frame not photo.
        b1.setBounds(30,150,70,30);b2.setBounds(130,150,70,30);
        im.add(l1);im.add(l2);im.add(t1);im.add(t2);im.add(l3);im.add(t3);
        this.setLayout(null);
        this.add(b1);this.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
      
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
                        try{
                     String user="root";
                    String password="";
                    String url="jdbc:mysql://localhost/user";
                    Connection c;
                    c=DriverManager.getConnection(url, user, password);
                    String x,y,z;
                    x=t1.getText();
                    y=t2.getText();
                    z=t3.getText();
                    Statement ss=c.createStatement();
                    // query code   insert into username values('"+t1.getText+"','"+t2.getText+","t3.getText")
                 // String query="insert into suername values('"+t1.getText()+'",'+t2.getText()+','+t3.getText()+'');
                 String query="insert into username values('"+x+"','"+y+"','"+z+"')";
                 ss.execute(query);
                    
                    // show inserted
                  JOptionPane.showMessageDialog(this, "inserted");

            }catch(SQLException ee){
               System.out.println(ee.getMessage());
           }
        }
       else if(e.getSource()==b2){
            this.dispose();
        }
    }
    
}

