package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PasswordModel {

    private final StringProperty username;
    private final StringProperty newPassword;
    private final StringProperty confirmNewPassword;

    public PasswordModel(String username, String newPassword, String confirmNewPassword){
        this.username = new SimpleStringProperty(username);
        this.newPassword = new SimpleStringProperty(newPassword);
        this.confirmNewPassword = new SimpleStringProperty(confirmNewPassword);
    }

    public String getUsername() {
        return username.get();
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getNewPassword() {
        return newPassword.get();
    }

    public StringProperty newPasswordProperty() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword.set(newPassword);
    }

    public String getConfirmNewPassword() {
        return confirmNewPassword.get();
    }

    public StringProperty confirmNewPasswordProperty() {
        return confirmNewPassword;
    }

    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword.set(confirmNewPassword);
    }

}
