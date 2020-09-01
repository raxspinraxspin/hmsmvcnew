package model;

import databaseconnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {

    Connection connection;

    public LoginModel(){
        try {
            this.connection = DBConnection.getConnection();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        if(this.connection  == null){
            System.exit(1);
        }
    }


    public boolean isDataBaseConnected(){return this.connection !=null;}

    public boolean isLogin(String user, String pass, String opt)throws Exception{
        PreparedStatement pr =null;
        ResultSet rs = null;

        String sql = "SELECT username,password FROM users WHERE username = ? AND password = ?";

        try{
            pr = this.connection.prepareStatement(sql);
            pr.setString(1,user);
            pr.setString(2,pass);
            //pr.setString(3,opt);

            rs = pr.executeQuery();

            boolean bool1;
            if(rs.next()){
                return true;
            }
            return false;
        }catch (SQLException ex){
            //ex.printStackTrace();
            return false;
        }finally {
            {
                rs.close();;
                pr.close();
            }
        }


    }

}
