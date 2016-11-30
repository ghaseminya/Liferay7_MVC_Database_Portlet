package ir.mnm.liferay.util;
import ir.mnm.liferay.model.Bill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmghasemy on 11/30/16.
 */
public class db {
    public String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost:3306/sample?useUnicode=true&characterEncoding=UTF-8";
    Connection conn = null;
    Statement stmt = null;
    final String USER = "*****";
    final String PASS = "*****";
    public db() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (Exception s) {
        }
    }
    public List<Bill> getBills(String email){
        List<Bill> blist=new ArrayList<>();
        try {
            String psql = "SELECT id, title, description, price, dt, email, refrenceid FROM bill WHERE email='" + email + "'";
            ResultSet rs = stmt.executeQuery(psql);

            while (rs.next()) {
                Bill b=new Bill();
                b.setId(rs.getInt("id"));
                b.setTitle(rs.getString("title"));
                b.setDesc(rs.getString("description"));
                b.setPrice(rs.getString("price"));
                b.setDt(rs.getString("dt"));
                b.setRefrenceid(rs.getString("refrenceid"));
                blist.add(b);
            }
        }catch (Exception s){
            s.printStackTrace();
        }
        return blist;
    }
}
