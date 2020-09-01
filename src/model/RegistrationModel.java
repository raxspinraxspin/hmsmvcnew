package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RegistrationModel {
    private final StringProperty id;
    private final StringProperty user_first_name;
    private final StringProperty user_last_name;
    private final StringProperty userUsername;
    private final StringProperty userEmail;
    private final StringProperty userPassword;
    private final StringProperty userDivision;
    private final StringProperty userAddress;
    private final StringProperty userTelephone;
    private final StringProperty userDOB;
    private final StringProperty userGender;
    private final StringProperty userOccupation;

        public RegistrationModel(String id, String first_name, String last_name, String username, String email, String password, String userDivision, String address, String telephone, String dob, String gender, String occupation){
            this.id = new SimpleStringProperty(id);
            this.user_first_name = new SimpleStringProperty(first_name);
            this.user_last_name = new SimpleStringProperty(last_name);
            this.userUsername = new SimpleStringProperty(username);
            this.userEmail = new SimpleStringProperty(email);
            this.userPassword = new SimpleStringProperty(password);
            this.userDivision = new SimpleStringProperty(userDivision);
            this.userAddress = new SimpleStringProperty(address);
            this.userTelephone = new SimpleStringProperty(telephone);
            this.userDOB = new SimpleStringProperty(dob);
            this.userGender = new SimpleStringProperty(gender);
            this.userOccupation = new SimpleStringProperty(occupation);
        }


    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getUser_first_name() {
        return user_first_name.get();
    }

    public StringProperty user_first_nameProperty() {
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) {
        this.user_first_name.set(user_first_name);
    }

    public String getUser_last_name() {
        return user_last_name.get();
    }

    public StringProperty user_last_nameProperty() {
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name.set(user_last_name);
    }

    public String getUserUsername() {
        return userUsername.get();
    }

    public StringProperty userUsernameProperty() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername.set(userUsername);
    }

    public String getUserEmail() {
        return userEmail.get();
    }

    public StringProperty userEmailProperty() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail.set(userEmail);
    }

    public String getUserPassword() {
        return userPassword.get();
    }

    public StringProperty userPasswordProperty() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword.set(userPassword);
    }

    public String getUserDivision() {
        return userDivision.get();
    }

    public StringProperty userDivisionProperty() {
        return userDivision;
    }

    public void setUserDivision(String userDivision) {
        this.userDivision.set(userDivision);
    }

    public String getUserAddress() {
        return userAddress.get();
    }

    public StringProperty userAddressProperty() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress.set(userAddress);
    }

    public String getUserTelephone() {
        return userTelephone.get();
    }

    public StringProperty userTelephoneProperty() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone.set(userTelephone);
    }

    public String getUserDOB() {
        return userDOB.get();
    }

    public StringProperty userDOBProperty() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        this.userDOB.set(userDOB);
    }

    public String getUserGender() {
        return userGender.get();
    }

    public StringProperty userGenderProperty() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender.set(userGender);
    }

    public String getUserOccupation() {
        return userOccupation.get();
    }

    public StringProperty userOccupationProperty() {
        return userOccupation;
    }

    public void setUserOccupation(String userOccupation) {
        this.userOccupation.set(userOccupation);
    }
}
