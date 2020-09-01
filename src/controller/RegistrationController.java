package controller;

import databaseconnection.DBConnection;
import dropdowns.genderOption;
import dropdowns.occupationOption;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import model.RegistrationModel;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RegistrationController implements Initializable {

    @FXML
    private TextField userID;
    @FXML
    private TextField userFirstName;
    @FXML
    private TextField userLastName;
    @FXML
    private TextField userEmail;
    @FXML
    private TextField userUsername;
    @FXML
    private PasswordField userPassword;
    @FXML
    private TextField userDivision;
    @FXML
    private TextField userAddress;
    @FXML
    private TextField userTelephone;
    @FXML
    private DatePicker userDOB;
    @FXML
    private ComboBox<genderOption> userGender;
    @FXML
    private ComboBox<occupationOption> comboBoxUserOccupation;
    @FXML
    private Label userRegistrationStatus;
    @FXML
    private Button buttonAddEntry;
    @FXML
    private Button buttonClear;


    private DBConnection dc;
    private ObservableList<RegistrationModel> registrationData;

        public void initialize(URL url, ResourceBundle rb){
            this.dc = new DBConnection();
            this.userDivision.setText("User");
            this.userDivision.setEditable(false);
            this.userGender.setItems(FXCollections.observableArrayList(genderOption.values()));
            this.comboBoxUserOccupation.setItems(FXCollections.observableArrayList(occupationOption.values()));
        }


        @FXML
        private void addUser(){
            String sqlUserRegistration = "INSERT INTO users (id,first_name,last_name,username,email,password,division,address,telephone,dob,gender,occupation)" +
                    "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

                try{
                    Connection con = DBConnection.getConnection();
                    PreparedStatement stmt = con.prepareStatement(sqlUserRegistration);
                        stmt.setString(1,this.userID.getText());
                        stmt.setString(2,this.userFirstName.getText());
                        stmt.setString(3,this.userLastName.getText());
                        stmt.setString(4,this.userUsername.getText());
                        stmt.setString(5,this.userEmail.getText());
                        stmt.setString(6,this.userPassword.getText());
                        stmt.setString(7,this.userDivision.getText());
                        stmt.setString(8,this.userAddress.getText());
                        stmt.setString(9,this.userTelephone.getText());
                        stmt.setString(10,this.userDOB.getEditor().getText());
                        stmt.setString(11,this.userGender.getValue().toString());
                        stmt.setString(12,this.comboBoxUserOccupation.getValue().toString());

                            stmt.executeUpdate();
                            con.close();

                }catch (SQLException e){
                    e.printStackTrace();
                }

                    this.userRegistrationStatus.setText("Registration Successful!");
                        System.exit(1);

        }


        @FXML
        private void clearData(){
            this.userID.setText(null);
            this.userFirstName.setText(null);
            this.userLastName.setText(null);
            this.userEmail.setText(null);
            this.userUsername.setText(null);
            this.userPassword.setText(null);
            this.userAddress.setText(null);
            this.userTelephone.setText(null);
            this.userDOB.setValue(null);
            this.userGender.setItems(null);
            this.comboBoxUserOccupation.setItems(null);
        }


}
