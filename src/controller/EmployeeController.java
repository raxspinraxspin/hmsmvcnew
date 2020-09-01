package controller;

import model.EmployeeModel;
import databaseconnection.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {

    /**Employee Tab Details**/
    @FXML
    private Tab employeeTab;
    @FXML
    private TextField employeeName;
    @FXML
    private TextField gender;
    @FXML
    private TextField specialty;
    @FXML
    private Label welcomeUser;


    /**Injecting main controller
    public void injectMainController(MainControllerApp mainControllerApp){
        this.injectMainController(mainControllerApp);
    }**/


    /****/
    private DBConnection dc;
    private ObservableList<EmployeeModel> data;
    private String sql = "SELECT username,gender,occupation FROM users";
    /****/



    public void initialize(URL url, ResourceBundle rb){
        this.dc = new DBConnection();

    }

    /**Begin Employee Tab Logic Implementation**/
    @FXML
    private void loadEmployeeData(ActionEvent event)throws SQLException {

        try{
            Connection con = DBConnection.getConnection();
            this.data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()){
                employeeName.setText(rs.getString(1));
                gender.setText(rs.getString(2));
                specialty.setText(rs.getString(3));
            }

        }catch (SQLException e){
            System.err.println("Error: "+e);
        }
        this.welcomeUser.setText(employeeName.getText());
    }

    @FXML
    private void userLogout(ActionEvent event){

        System.exit(1);
    }

    /**End Employee Tab Logic Implementation**/







}
