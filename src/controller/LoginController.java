package controller;

import dropdowns.loginOption;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.LoginModel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModel loginModel = new LoginModel();

    /**Variables**/
    @FXML
    private Label dbStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private ComboBox<loginOption> comboBox;
    @FXML
    private Button loginButton;
    @FXML
    private Label loginStatus;


    /**This method checks database connection and populates combobox items**/
    public void initialize (URL url, ResourceBundle rb){

        if(this.loginModel.isDataBaseConnected()){
            this.dbStatus.setText("Connected To Database!");
        }else {
            this.dbStatus.setText("Not Connected To Database!");
        }
        this.comboBox.setItems(FXCollections.observableArrayList(loginOption.values()));
    }

    /**This enables users to login when the Login button is clicked.
     * First we do the logic of the child methods i.e. userLogin and adminLogin
     * Then finally the Login which is the action event method.
     * **/
    @FXML
    public void Login(ActionEvent event){

        try{
            if(this.loginModel.isLogin(this.username.getText(), this.password.getText(), ((loginOption)this.comboBox.getValue()).toString())){
                Stage stage = (Stage)this.loginButton.getScene().getWindow();
                stage.close();
                switch (((loginOption)this.comboBox.getValue()).toString()){
                    case "Admin" :
                        adminLogin();
                        break;
                    case "User" :
                        userLogin();
                        break;
                }
            }else {
                this.loginStatus.setText("Wrong Credentials!");
            }

        }catch (Exception localException){

        }

    }


    public void userLogin(){
        try{
            Stage userStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            AnchorPane userRoot = (AnchorPane)loader.load(getClass().getResource("/view/homePage.fxml").openStream());
            EmployeeController userController = (EmployeeController)loader.getController();

            Scene scene = new Scene(userRoot);
            userStage.setScene(scene);
            userStage.setTitle("User Dashboard");
            userStage.show();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public void adminLogin(){
        try{
            Stage adminStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            AnchorPane adminRoot = (AnchorPane)loader.load(getClass().getResource("/view/adminPage.fxml").openStream());
            AdminController adminController = (AdminController) loader.getController();

            Scene scene = new Scene(adminRoot);
            adminStage.setScene(scene);
            adminStage.setTitle("Admin Dashboard");
            adminStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @FXML
    public void resetPassword(){
        try{
            Stage resetPasswordStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            AnchorPane resetPassRoot = (AnchorPane) loader.load(getClass().getResource("/view/passwordResetPage.fxml"));

            Scene scene = new Scene(resetPassRoot);
            resetPasswordStage.setScene(scene);
            resetPasswordStage.setTitle("Reset User Password Dashboard");
            resetPasswordStage.show();

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }


    @FXML
    public void registerSystemUser(){
        try{
            Stage resetPasswordStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            AnchorPane registerUser = (AnchorPane) loader.load(getClass().getResource("/view/registrationPage.fxml"));

            Scene scene = new Scene(registerUser);
            resetPasswordStage.setScene(scene);
            resetPasswordStage.setTitle("Register System Users");
            resetPasswordStage.show();

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
