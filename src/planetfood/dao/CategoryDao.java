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

//import java.pojo.Cutil.Localeory;
import planetfood.dbutil.DBConnection;

/**
 *
 * @author ROYAL CHHORA
 */
public class CategoryDao {
    public static HashMap<String,String>getAllcategoryID()throws SQLException
    {
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select cat_name,cat_id from categories");
    HashMap<String,String>categories=new HashMap<>();
    while(rs.next())
    {
    String catName=rs.getString(1);
    String catId=rs.getString(2);
    categories.put(catName,catId);
    }
    return categories;
    }
     public static String getNewId()throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select count(*) from categories");
        int id=101;
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            id=id+rs.getInt(1);
        }
        return "C"+id;
    }
    public static boolean addCategory(String catId,String catName)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into categories values(?,?)");
        ps.setString(1, catId);
        ps.setString(2, catName);
        int result=ps.executeUpdate();
        return (result==1);
    }
    public static String getCatNameByCatId(String catId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select cat_name from categories where cat_id=?");
        ps.setString(1, catId);
         ResultSet rs=ps.executeQuery();
         String catName=null;
        while(rs.next())
        {
            catName=rs.getString("cat_name");
        }
        return catName;
    }
    public static boolean updateCategories(String catId,String catName)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update categories set cat_name=? where cat_id=?");
        ps.setString(2, catId);
        ps.setString(1, catName);
        int result=ps.executeUpdate();
        return (result==1);
    }
    public static ArrayList<Category>getAllData()throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from categories");
        ArrayList<Category>allcategory=new ArrayList<>();
        while(rs.next())
        {
            Category c=new Category();
            c.setCatId(rs.getString("cat_id"));
            c.setCatName(rs.getString("cat_name"));
            allcategory.add(c);
        }
        return allcategory;
    }
    
    
}

