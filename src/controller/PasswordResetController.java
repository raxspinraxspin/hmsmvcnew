package controller;

import model.PasswordModel;
import databaseconnection.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PasswordResetController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField newPassword;
    @FXML
    private PasswordField confirmNewPassword;
    @FXML
    private Label passwordMatch;
    @FXML
    private Label resetStatus;
    @FXML
    private Button buttonClear;

    /****/
    private DBConnection dc;
    private ObservableList<PasswordModel> data;
    /***/
    public void initialize(URL url, ResourceBundle rb){
        this.dc = new DBConnection();
    }


    @FXML
    private void checkUsername(){

        String sqlCheckUsername = "SELECT * FROM users WHERE username = '"+username.getText()+"' ";

        try{
            Connection con = DBConnection.getConnection();
            this.data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery(sqlCheckUsername);

            while(rs.next()){
                if(this.username.getText().equals(rs.getString("username"))){
                    this.username.setText(rs.getString("username"));
                }
            }

            con.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void resetPassword(ActionEvent event){

        String sqlCheckUsername = "UPDATE users SET password = ? WHERE username = '"+username.getText()+"' ";

        if(this.newPassword.getText().equals(this.confirmNewPassword.getText())){
            try{
                Connection con = DBConnection.getConnection();
                PreparedStatement stmt = con.prepareStatement(sqlCheckUsername);
                stmt.setString(1,this.newPassword.getText());
                stmt.executeUpdate();

                con.close();
            }catch (SQLException exception){
                exception.printStackTrace();
            }

            this.resetStatus.setText("Password Reset Successful!");

        }else{
            this.passwordMatch.setText("Passwords Do Not Match!");
        }

    }

    @FXML
    private void clear(ActionEvent event){
        this.username.setText(null);
        this.newPassword.setText(null);
        this.confirmNewPassword.setText(null);
        this.passwordMatch.setText(null);
        this.resetStatus.setText(null);
    }

}
