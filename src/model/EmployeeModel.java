package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EmployeeModel {

    private final StringProperty employeeName;
    private final StringProperty gender;
    private final StringProperty specialty;

    public EmployeeModel(String employeeName, String gender, String specialty){
        this.employeeName = new SimpleStringProperty(employeeName);
        this.gender = new SimpleStringProperty(gender);
        this.specialty = new SimpleStringProperty(specialty);
    }

    public String getEmployeeName() {
        return employeeName.get();
    }

    public StringProperty employeeNameProperty() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName.set(employeeName);
    }

    public String getGender() {
        return gender.get();
    }

    public StringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public String getSpecialty() {
        return specialty.get();
    }

    public StringProperty specialtyProperty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty.set(specialty);
    }



}
