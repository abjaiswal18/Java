// Java JDBC(java database Connectivity)
//7 steps to follow

/*
1. import package----> java.sql
2. Load and register the driver ---> Class.forName(com.mysql.jdbc.driver)
3. Establish the connection--> getconnection() interface
4. Create the statement --> createStatement() interface
5. Execute the query
6. Process the query
7. Close
*/
//To fetch specific value of the query
import java.sql.*;
import java.io.*;
import java.util.*;
class JDBC2
{
    public static void main(String agrs[])throws Exception
    {
        String url="jdbc:mysql://localhost:3306/student";
        String uname="abc";
        String pwd="";
        String query="select ussername from student where custid=3";
        Class.forName("com.mysql.jdbc.driver");
        Connection con =DriverManager.getConnection(url,uname,pwd);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
            String name = rs.getString(1);
            System.out.println(name);
        
        st.close();
        con.close();
                
                
        
        
        
    }
}