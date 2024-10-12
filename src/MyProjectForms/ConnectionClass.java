package MyProjectForms;

import java.sql.*;
import java.lang.Class;
public class ConnectionClass
{
    Connection con;
    Statement stm;
    ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","saad1234");
            stm = con.createStatement();
            if(con.isClosed())
            {
                System.out.println("error");
            }
            else
            {
                System.out.println("not error");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        new ConnectionClass();
    }

}

