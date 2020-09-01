package controller;

import model.UsersModel;
import databaseconnection.DBConnection;
import dropdowns.genderOption;
import dropdowns.loginOption;
import dropdowns.occupationOption;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AdminController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField fname;
    @FXML
    private TextField lname;
    @FXML
    private TextField username;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private ComboBox<loginOption> comboBoxDivision;
    @FXML
    private TextField address;
    @FXML
    private TextField telephone;
    @FXML
    private DatePicker dob;
    @FXML
    private ComboBox<genderOption> comboBoxGender;
    @FXML
    private ComboBox<occupationOption> comboBoxOccupation;
    @FXML
    private Button buttonAddEntry;
    @FXML
    private Button buttonClear;
    @FXML
    private Button buttonLoadData;

    /****/
    @FXML
    private TableView<UsersModel> usersTable;
    @FXML
    private TableColumn<UsersModel, String> IDcolumn;
    @FXML
    private TableColumn<UsersModel, String> firstnamecolumn;
    @FXML
    private TableColumn<UsersModel, String> lastnamecolumn;
    @FXML
    private TableColumn<UsersModel, String> usernamecolumn;
    @FXML
    private TableColumn<UsersModel, String> emailcolumn;
    @FXML
    private TableColumn<UsersModel, String> divisioncolumn;
    @FXML
    private TableColumn<UsersModel, String> addresscolumn;
    @FXML
    private TableColumn<UsersModel, String> telephonecolumn;
    @FXML
    private TableColumn<UsersModel, String> dobcolumn;
    @FXML
    private TableColumn<UsersModel, String> gendercolumn;
    @FXML
    private TableColumn<UsersModel, String> occupationcolumn;
    /****/

    /**Update Entry Tab Fields**/
    @FXML
    private Tab tabUpdateEntry;
    @FXML
    private TextField searchUserID;
    @FXML
    private Button buttonsearchUserID;
    @FXML
    private TextField uFirstName;
    @FXML
    private TextField uLastName;
    @FXML
    private TextField uUsername;
    @FXML
    private TextField uEmail;
    @FXML
    private PasswordField newPassword;
    @FXML
    private TextField uAddress;
    @FXML
    private TextField uTelephone;
    @FXML
    private DatePicker uDOB;
    @FXML
    private ComboBox<genderOption> uComboBoxGender;
    @FXML
    private ComboBox<occupationOption> uComboBoxUserOccupation;
    @FXML
    private Button ubuttonUpdateEntry;
    @FXML
    private Button ubuttonClear;
    @FXML
    private Button ubuttonLoadData;

    /****/



    private DBConnection dc;
    private ObservableList<UsersModel> data;
    private String sql = "SELECT id,firstname,lastname,username,email,password,division,address,telephone,dob,gender,occupation FROM users";
    /****/

    public void initialize(URL url, ResourceBundle rb){
        this.dc = new DBConnection();
        this.clearData();

        this.comboBoxDivision.setItems(FXCollections.observableArrayList(loginOption.values()));
        this.comboBoxGender.setItems(FXCollections.observableArrayList(genderOption.values()));
        this.uComboBoxGender.setItems(FXCollections.observableArrayList(genderOption.values()));
        this.comboBoxOccupation.setItems(FXCollections.observableArrayList(occupationOption.values()));
        this.uComboBoxUserOccupation.setItems(FXCollections.observableArrayList(occupationOption.values()));
    }

    @FXML
    private void loadUserData(ActionEvent event)throws SQLException {
        try{
            Connection con = DBConnection.getConnection();
            this.data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery(sql);

            while (rs.next()){
                this.data.add(new UsersModel(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12)
                ));
            }

        }catch (SQLException e){
            System.err.println("Error "+e);
        }
        /****/
        this.IDcolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("ID"));
        this.firstnamecolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("firstname"));
        this.lastnamecolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("lastname"));
        this.usernamecolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("username"));
        this.emailcolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("email"));
        this.divisioncolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("division"));
        this.addresscolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("address"));
        this.telephonecolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("telephone"));
        this.dobcolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("dob"));
        this.gendercolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("gender"));
        this.occupationcolumn.setCellValueFactory(new PropertyValueFactory<UsersModel, String>("occupation"));

        this.usersTable.setItems(null);
        this.usersTable.setItems(this.data);
    }

    /**Add model.data to database**/
    @FXML
    private void addUser(ActionEvent event){
        String sqlInsert = "INSERT INTO users" +
                "(id,firstname,lastname,username,email,password,division,address,telephone,dob,gender,occupation) " +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sqlInsert);

            stmt.setString(1, this.id.getText());
            stmt.setString(2, this.fname.getText());
            stmt.setString(3, this.lname.getText());
            stmt.setString(4, this.username.getText());
            stmt.setString(5, this.email.getText());
            stmt.setString(6, this.password.getText().toString());
            stmt.setString(7, this.comboBoxDivision.getValue().toString());
            stmt.setString(8, this.address.getText());
            stmt.setString(9, this.telephone.getText());
            stmt.setString(10, this.dob.getEditor().getText());
            stmt.setString(11, this.comboBoxGender.getValue().toString());
            stmt.setString(12, this.comboBoxOccupation.getValue().toString());

            stmt.executeUpdate();
            con.close();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void clearData(){
        this.id.setText("");
        this.fname.setText("");
        this.lname.setText("");
        this.username.setText("");
        this.email.setText("");
        this.password.setText(null);
        this.comboBoxDivision.setValue(null);
        this.address.setText("");
        this.telephone.setText("");
        this.dob.setValue(null);
        this.comboBoxGender.setValue(null);
        this.comboBoxOccupation.setValue(null);
        this.usersTable.setItems(null);
    }


    /**UserDetails Tab Logic**/
    /**Solve search logic later**/

    @FXML
    private void uButtonSearchUserDetails(ActionEvent event){

        String sqlSearch = "SELECT * FROM users WHERE id = '"+searchUserID.getText()+"' ";
        try{
            Connection con = DBConnection.getConnection();
            this.data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery(sqlSearch);
            while (rs.next()){
                //this.searchUserID.setText(rs.getString("id"));
                this.uFirstName.setText(rs.getString("firstname"));
                this.uLastName.setText(rs.getString("lastname"));
                this.uUsername.setText(rs.getString("username"));
                this.uEmail.setText(rs.getString("email"));
                this.uAddress.setText(rs.getString("address"));
                this.uTelephone.setText(rs.getString("telephone"));
                //this.uDOB.setValue(LocalDate.parse(rs.getDate("dob").toString()));

            }


        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }

    @FXML  /**Finish on this logic later and solve the error**/
    private void uUpdateUsersDetails(ActionEvent event){
        String sqlUpdate = "UPDATE users SET firstname = ?, lastname = ?, username = ?, email = ?, password = ?,address = ?, telephone = ?,dob = ?,gender = ?,occupation = ?" ;
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sqlUpdate);
            stmt.setString(2, this.uFirstName.getText());
            stmt.setString(3, this.uLastName.getText());
            stmt.setString(4, this.uUsername.getText());
            stmt.setString(5, this.uEmail.getText());
            stmt.setString(6, this.newPassword.getText());
            stmt.setString(7, this.uAddress.getText());
            stmt.setString(8, this.uTelephone.getText());
            stmt.setString(9, this.uDOB.getEditor().getText());
            stmt.setString(10, this.uComboBoxGender.getValue().toString());
            stmt.setString(11, this.uComboBoxUserOccupation.getValue().toString());

        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }

    @FXML
    private void uButtonClear(){
        this.searchUserID.setText("");
        this.uFirstName.setText("");
        this.uLastName.setText("");
        this.uUsername.setText("");
        this.uEmail.setText("");
        this.newPassword.setText(null);
        this.uAddress.setText(null);
        this.uTelephone.setText(null);
        this.uDOB.setValue(null);
        this.uComboBoxGender.setValue(null);
        this.uComboBoxUserOccupation.setValue(null);

    }

}
