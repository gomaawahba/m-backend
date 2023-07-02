
package connectionj;

import XcoreXmysqlX220X8389.id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class Connectionj {
    static String user="root";
    static String pass="";
    static String url="jdbc:mysql://localhost/go";
   static Connection c;
   static Statement s;
   static String query;
   static ResultSet r;
    public static void main(String[] args) throws SQLException {
       
        try{
            c=DriverManager.getConnection(url, user, pass);
            s=c.createStatement();
//             Scanner input=new Scanner(System.in);
//            int id;
//            System.out.println("enter the id");
//            id=input.nextInt();
//            String fname,lname;
//            System.out.println("enter the first name");
//            fname=input.next();
//            System.out.println("enter the Last name");
//            lname=input.next();
            
            query="select*from gomaa";
            r=s.executeQuery(query);
            for(int i=1;i<=3;i++){
            r.next();
            System.out.print(r.getInt("id")+"\t");
            System.out.print(r.getString("first_name")+"\t");
            System.out.print(r.getString("last_name"));
            System.out.println();
            }

          //  s.execute(query);
            System.out.println("ok");
           
            
        }catch(SQLException ee){
            System.out.println(ee.getMessage());
            
        }
        finally{
            s.close();
            
        }
    }
    
}
