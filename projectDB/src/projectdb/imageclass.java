/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdb;

//import com.sun.jdi.connect.spi.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author gomaa
 */
public class imageclass extends JFrame implements ActionListener{
     JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;
    image i=new image();
    public imageclass(){
        showw();
    }
    public  void showw(){
        this.setTitle("enroll");
        this.setVisible(true);
        this.setSize(282,179);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(i); 
                // roll in
        l1=new  JLabel("Full name");
        l2=new  JLabel("password");
        t1=new JTextField();
        p1=new JPasswordField();
        b1=new JButton ("login");
        b2=new JButton("sin in");
        l1.setBounds(10,10, 50,20);t1.setBounds(70,10,70,20);
        l2.setBounds(10,50,50,20);p1.setBounds(70,50,70,20);
        b1.setBounds(20,90,70,30);b2.setBounds(100,90,70,30);
        i.add(l1);i.add(l2);i.add(t1);i.add(p1);i.add(b1);i.add(b2);
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
                  //  JOptionPane.showMessageDialog(this, "ok");
                    PreparedStatement ps=c.prepareStatement("select*from username");
                    ResultSet r=ps.executeQuery();
                    while(r.next()){
                        if(r.getString("user_name").equalsIgnoreCase(t1.getText())){
                            if(r.getString("password").equalsIgnoreCase(p1.getText())){
                                JOptionPane.showMessageDialog(this, "ok");
                            }else {
                             JOptionPane.showMessageDialog(this, "sorry");
                        }

                            
                        }
                       
                    }
            }catch(SQLException ee){
               System.out.println(ee.getMessage());
           }

            
            
        }
        if(e.getSource()==b2){
                            imageclass2 img=new imageclass2();
                        }
    }
    
}
