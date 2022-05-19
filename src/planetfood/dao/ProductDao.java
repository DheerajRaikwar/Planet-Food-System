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
import planetfood.Pojo.Product;

/**
 *
 * @author ROYAL CHHORA
 */
public class ProductDao {
    public static String getNewID()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select count (*) from product");
      int id=101;
      ResultSet rs=ps.executeQuery();
      if(rs.next())//if for sql return not zero in count so for safety put if. 
      {
          id=id+rs.getInt(1);
      }
      return"P"+id;
    }
      

public static boolean addProduct(Product p)throws SQLException{
Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into product values(?,?,?,?,?)");
       System.out.println(p.toString());
        ps.setString(1, p.getProductId());
         ps.setString(2, p.getCategoryId());
          ps.setString(3, p.getProductName());
           ps.setDouble(4, p.getProductPrice());
            ps.setString(5, p.getIsActive());
            int x=ps.executeUpdate();
            return(x>0);
}
public static HashMap<String,Product>getProductsByCategory(String catId)throws SQLException
{
  Connection conn=DBConnection.getConnection();
        String qry=("Select * from product where cat_id=?");
        PreparedStatement ps=conn.prepareStatement(qry);
        HashMap<String,Product>productList=new HashMap<String,Product>();
        ps.setString(1,catId);
        ResultSet rs=ps.executeQuery();
        
         while(rs.next()){
         Product p=new Product();
         p.setCategoryId(catId);
         p.setProductId(rs.getString("prod_id"));
         p.setProductPrice(rs.getDouble("prod_price"));
         p.setProductName(rs.getString("prod_name"));
         p.setIsActive(rs.getString("active"));
                 productList.put(p.getProductId(),p);
     }
     return productList;
}



public static ArrayList<Product>getAllData()throws SQLException{
    Connection conn=DBConnection.getConnection();
    String qry="select * from Product";
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery(qry);
    ArrayList<Product>productList=new ArrayList<Product>();
    while (rs.next()){
        Product p=new Product();
        p.setCategoryId(rs.getString("cat_id"));
         p.setProductId(rs.getString("prod_id"));
          p.setProductName(rs.getString("prod_name"));
          p.setProductPrice(rs.getDouble("prod_price"));
           p.setIsActive(rs.getString("active"));
           productList.add(p);
    }
    return productList;
    }
    

public static boolean updateProduct(Product p)throws SQLException
{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update Product set cat_id=? ,prod_name=? ,prod_price=? ,active=? where prod_id=?");
        ps.setString(1, p.getCategoryId());
         ps.setString(2, p.getProductName());
          ps.setDouble(3,p.getProductPrice());
           ps.setString(4, p.getIsActive());
            ps.setString(5,p.getProductId());
            int x=ps.executeUpdate();
                  return(x>0);

}
public static boolean removeProduct(String prodId)throws SQLException{
    Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update product set active='N' where prod_id=?");
        ps.setString(1, prodId);
        int x=ps.executeUpdate();
        return x>0;
}

public static HashMap<String,String> getActiveProductsByCategory(String catId)throws SQLException{
        Connection conn=DBConnection.getConnection();
        String qry="select prod_name,prod_id from product where cat_id=? and active='Y'";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, catId);
        ResultSet rs=ps.executeQuery();
        HashMap<String,String> productList=new HashMap<>();
        while(rs.next())
        {
            String prodName=rs.getString("prod_name");
            String prodId=rs.getString("prod_id");
            productList.put(prodName,prodId);
        }
        return productList;
    }
 public static ArrayList<Product>getMenuList()throws SQLException{
        Connection conn=DBConnection.getConnection();
        ArrayList<Product>menulist=new ArrayList<>();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select prod_name,prod_price from products where active='Y'");
        while(rs.next())
        {
            Product p=new Product();
            p.setProductName(rs.getString("prod_name"));
            p.setProductPrice(rs.getDouble("prod_price"));
            menulist.add(p);
        }
        return menulist;
    }
}

      
        
        

