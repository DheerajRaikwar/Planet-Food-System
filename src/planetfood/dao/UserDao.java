/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import planetfood.dbutil.DBConnection;
import planetfood.Pojo.User;



public class UserDao {
      public static String validateUser(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        String qry="Select username from users where userid=? and password=? and usertype=?";
        System.out.println("qry="+qry);
        
       PreparedStatement ps=conn.prepareStatement(qry);
            ps.setString(1,user.getUserId());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getUserType());

            ResultSet rs=ps.executeQuery();
            String username=null;
            
            if(rs.next())
            {
                username=rs.getString(1);
                
            }
          return username;
          
}
      public static boolean RegisterUser(User u)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1,u.getUserId() );
        ps.setString(2, u.getUserName());
         ps.setString(3, u.getPassword());
         ps.setString(4, u.getUserType());
        ps.setString(5, u.getEmployeeId());    
        
        int result=ps.executeUpdate();
        return (result==1);
    }
    public static ArrayList<String>getUserId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<String>userId=new ArrayList<>();
        ResultSet rs = st.executeQuery("select userid from users where usertype='CASHIER'");
        while(rs.next()){
            String uId=rs.getString("userid");
            userId.add(uId);
        }
        return userId;
    }
    public static HashMap<String,User>getDataByUserId(String userId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select empid,username from users where userid=?");
        ps.setString(1, userId);
        ResultSet rs=ps.executeQuery();
        HashMap<String,User>userData=new HashMap<>();
        while(rs.next()){
            User u=new User();
            u.setUserId(userId);
            u.setEmployeeId(rs.getString("empid"));
            u.setUserName(rs.getString("username"));
            userData.put(userId, u);
        }
        return userData;
    }
    public static boolean removeCashier(String userId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from users where userid=?");
        ps.setString(1, userId);
        int result=ps.executeUpdate();
        return (result==1);
    }
    public static ArrayList<String>getCashEmpId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<String>empId=new ArrayList<>();
        ResultSet rs=st.executeQuery("select empid from employee where job='CASHIER'");
        while(rs.next())
        {
            String empid=rs.getString("empid");
            empId.add(empid);
        }
        return empId;
    }
}


