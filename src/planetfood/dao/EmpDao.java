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
import planetfood.Pojo.Employee;
import planetfood.dbutil.DBConnection;

/**
 *
 * @author ROYAL CHHORA
 */
public class EmpDao {
     public static boolean addEmp(Employee e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into employees values(?,?,?,?)");
        ps.setString(1, e.getEmpId());
        ps.setString(2, e.getEmpName());
        ps.setString(3, e.getJob());
        ps.setDouble(4, e.getSalary());
        int result=ps.executeUpdate();
        return (result==1);
    }
    public static String getNewId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select count(*) from employees");
        int id=101;
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            id=id+rs.getInt(1);
        }
        return "E"+id;
    }
    public static HashMap<String,Employee>getEmployeeByEmpId(String empid)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from employees where empid=?");
        ps.setString(1, empid);
        ResultSet rs=ps.executeQuery();
        HashMap<String,Employee>employee=new HashMap<>();
        
        while(rs.next())
        {
            Employee e=new Employee();
            e.setEmpId(empid);
            e.setEmpName(rs.getString("ename"));
            e.setJob(rs.getString("job"));
            e.setSalary(rs.getDouble("sal"));
            employee.put(e.getEmpId(), e);
        }
        return employee;
        
        
    }
    public static boolean updateEmp(Employee e)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update employees set ename=?,job=?,sal=? where empid=?");
     ps.setString(1, e.getEmpName());
     ps.setString(2, e.getJob());
     ps.setDouble(3, e.getSalary());
     ps.setString(4, e.getEmpId());
     int result=ps.executeUpdate();
     return (result==1);
    }
    public static ArrayList<String>getAllEmpId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<String>allEmpId=new ArrayList<String>();
        ResultSet rs=st.executeQuery("select empid from employees");
        while(rs.next())
        {
           String empId=rs.getString("empid");
           allEmpId.add(empId);
        }
        return allEmpId;
    }
   public static ArrayList<Employee>getAllData()throws SQLException{
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ArrayList<Employee>allEmp=new ArrayList<>();
       ResultSet rs=st.executeQuery("select * from employees");
       while(rs.next())
       {
           Employee e=new Employee();
           e.setEmpId(rs.getString("empid"));
           e.setEmpName(rs.getString("ename"));
           e.setJob(rs.getString("job"));
           e.setSalary(rs.getDouble("sal"));
           allEmp.add(e);
       }
       return allEmp;
   }
   public static boolean deleteEmp(String empid)throws SQLException{
       Connection conn=DBConnection.getConnection();
       
       PreparedStatement ps1=conn.prepareStatement("delete from users where empid=? and usertype='CASHIER' or usertype='CHEF' or usertype='MANAGER'");
       ps1.setString(1, empid);
       int status1=ps1.executeUpdate();
       PreparedStatement ps=conn.prepareStatement("delete from employees where empid=?");
       ps.setString(1, empid);
       int status=ps.executeUpdate();
       if(status==1&&status1>=-1)
       return true;
       else return false;
   }

    
}
