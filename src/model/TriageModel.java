package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TriageModel {

    private final StringProperty id;
    private final StringProperty firstname;
    private final StringProperty lastname;
    private final StringProperty age;
    private final StringProperty bloodpressure;
    private final StringProperty temperature;
    private final StringProperty height;
    private final StringProperty weight;
    private final StringProperty bmi;
    private final StringProperty bmiStatus;

    public TriageModel(String id, String firstname, String lastname, String age, String bloodpressure, String temperature, String height, String weight, String bmi, String bmiStatus){
        this.id = new SimpleStringProperty(id);
        this.firstname = new SimpleStringProperty(firstname);
        this.lastname = new SimpleStringProperty(lastname);
        this.age = new SimpleStringProperty(age);
        this.bloodpressure = new SimpleStringProperty(bloodpressure);
        this.temperature = new SimpleStringProperty(temperature);
        this.height = new SimpleStringProperty(height);
        this.weight = new SimpleStringProperty(weight);
        this.bmi =  new SimpleStringProperty(bmi);
        this.bmiStatus = new SimpleStringProperty(bmiStatus);
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

    public String getFirstname() {
        return firstname.get();
    }

    public StringProperty firstnameProperty() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname.set(firstname);
    }

    public String getLastname() {
        return lastname.get();
    }

    public StringProperty lastnameProperty() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname.set(lastname);
    }

    public String getAge() {
        return age.get();
    }

    public StringProperty ageProperty() {
        return age;
    }

    public void setAge(String age) {
        this.age.set(age);
    }

    public String getBloodpressure() {
        return bloodpressure.get();
    }

    public StringProperty bloodpressureProperty() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure.set(bloodpressure);
    }

    public String getTemperature() {
        return temperature.get();
    }

    public StringProperty temperatureProperty() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature.set(temperature);
    }

    public String getHeight() {
        return height.get();
    }

    public StringProperty heightProperty() {
        return height;
    }

    public void setHeight(String height) {
        this.height.set(height);
    }

    public String getWeight() {
        return weight.get();
    }

    public StringProperty weightProperty() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight.set(weight);
    }

    public String getBmi() { return bmi.get(); }

    public StringProperty bmiProperty() { return bmi; }

    public void setBmi(String bmi) { this.bmi.set(bmi); }

    public String getBmiStatus() {
        return bmiStatus.get();
    }

    public StringProperty bmiStatusProperty() {
        return bmiStatus;
    }

    public void setBmiStatus(String bmiStatus) {
        this.bmiStatus.set(bmiStatus);
    }

}
