package top.ralphb.crackdemo.dao;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
@Component
public class UserDao {
    public boolean login(String user,String pass){
        Connection conn= null;
        try {
            String sql ="select * from user where username='"+user+"' and password='"+pass+"';";
            System.out.println(sql);
            conn = DBHelper.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);// 预处理
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
        }

        return false;
    }
}

