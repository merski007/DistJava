package edu.wctc.dj.week9.javacyclesjsf.data;

//import edu.wctc.dj.week9.namesapp9.model.Name;
import edu.wctc.dj.week9.javacyclesjsf.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    /*
    public List<Name> getNames() throws Exception{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from name");
            rs = stmt.executeQuery();
            
            List<Name> nameList = new ArrayList<>();
            while(rs.next()){
                String id = rs.getString("id");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                
                Name name = new Name(id,firstName,lastName,null);
                
                nameList.add(name);
            }
            
            return nameList;
            
        }finally {
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        
    }
     */
    public List<Product> getProducts() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from product");
            rs = stmt.executeQuery();

            List<Product> productList = new ArrayList<>();
            while (rs.next()) {
                String prodId = rs.getString("prodId");
                String brand = rs.getString("brand");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String imageName = rs.getString("imageName");
                Double price = rs.getDouble("price");
                String type = rs.getString("type");

                //Name name = new Name(id, firstName, lastName, null);
                Product product = new Product(prodId, brand, name, description, imageName, price, type);

                productList.add(product);
            }

            return productList;

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

    }

    public List<Product> getLikeProducts(String prodType) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionUtil.getConnection();
            stmt = conn.prepareStatement("select * from product where type = ?");
            stmt.setString(1, prodType);
            rs = stmt.executeQuery();

            List<Product> productList = new ArrayList<>();
            while (rs.next()) {
                String prodId = rs.getString("prodId");
                String brand = rs.getString("brand");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String imageName = rs.getString("imageName");
                Double price = rs.getDouble("price");
                String type = rs.getString("type");

                //Name name = new Name(id, firstName, lastName, null);
                Product product = new Product(prodId, brand, name, description, imageName, price, type);

                productList.add(product);
            }

            return productList;

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

    }
}
