package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PatientModel {

    private final StringProperty patientID;
    private final StringProperty patientFirstName;
    private final StringProperty patientLastName;
    private final StringProperty patientEmail;
    private final StringProperty patientAddress;
    private final StringProperty patientTelephone;
    private final StringProperty patientGender;
    private final StringProperty patientDOB;
    private final StringProperty patientInsuranceName;
    private final StringProperty patientInsuranceCardNo;
    private final StringProperty patientNationalOrPassportIDNo;
    private final StringProperty patientMaritalStatus;
    private final StringProperty patientAllergies;
    /****/
    private final StringProperty spouseID;
    private final StringProperty spouseFirstName;
    private final StringProperty spouseLastName;
    private final StringProperty spouseEmail;
    private final StringProperty spouseAddress;
    private final StringProperty spouseTelephone;
    private final StringProperty spouseGender;
    private final StringProperty spouseDOB;
    private final StringProperty spouseInsuranceName;
    private final StringProperty spouseInsuranceCardNo;
    private final StringProperty spouseNationalOrPassportIDNo;


    public PatientModel(String patientID,
                        String patientFirstName,
                        String patientLastName,
                        String patientEmail,
                        String patientAddress,
                        String patientTelephone,
                        String patientGender,
                        String patientDOB,
                        String patientInsuranceName,
                        String patientInsuranceCardNo,
                        String patientNationalOrPassportIDNo,
                        String patientMaritalStatus,
                        String patientAllergies,
                        String spouseID,
                        String spouseFirstName,
                        String spouseLastName,
                        String spouseEmail,
                        String spouseAddress,
                        String spouseTelephone,
                        String spouseGender,
                        String spouseDOB,
                        String spouseInsuranceName,
                        String spouseInsuranceCardNo,
                        String spouseNationalOrPassportIDNo)
    {
        this.patientID = new SimpleStringProperty(patientID);
        this.patientFirstName = new SimpleStringProperty(patientFirstName);
        this.patientLastName = new SimpleStringProperty(patientLastName);
        this.patientEmail = new SimpleStringProperty(patientEmail);
        this.patientAddress = new SimpleStringProperty(patientAddress);
        this.patientTelephone = new SimpleStringProperty(patientTelephone);
        this.patientGender = new SimpleStringProperty(patientGender);
        this.patientDOB = new SimpleStringProperty(patientDOB);
        this.patientInsuranceName = new SimpleStringProperty(patientInsuranceName);
        this.patientInsuranceCardNo = new SimpleStringProperty(patientInsuranceCardNo);
        this.patientNationalOrPassportIDNo = new SimpleStringProperty(patientNationalOrPassportIDNo);
        this.patientMaritalStatus = new SimpleStringProperty(patientMaritalStatus);
        this.patientAllergies = new SimpleStringProperty(patientAllergies);
        this.spouseID = new SimpleStringProperty(spouseID);
        this.spouseFirstName = new SimpleStringProperty(spouseFirstName);
        this.spouseLastName = new SimpleStringProperty(spouseLastName);
        this.spouseEmail = new SimpleStringProperty(spouseEmail);
        this.spouseAddress = new SimpleStringProperty(spouseAddress);
        this.spouseTelephone = new SimpleStringProperty(spouseTelephone);
        this.spouseGender = new SimpleStringProperty(spouseGender);
        this.spouseDOB = new SimpleStringProperty(spouseDOB);
        this.spouseInsuranceName = new SimpleStringProperty(spouseInsuranceName);
        this.spouseInsuranceCardNo = new SimpleStringProperty(spouseInsuranceCardNo);
        this.spouseNationalOrPassportIDNo = new SimpleStringProperty(spouseNationalOrPassportIDNo);

    }

    public String getPatientID() {
        return patientID.get();
    }

    public StringProperty patientIDProperty() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID.set(patientID);
    }

    public String getPatientFirstName() {
        return patientFirstName.get();
    }

    public StringProperty patientFirstNameProperty() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName.set(patientFirstName);
    }

    public String getPatientLastName() {
        return patientLastName.get();
    }

    public StringProperty patientLastNameProperty() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName.set(patientLastName);
    }

    public String getPatientEmail() {
        return patientEmail.get();
    }

    public StringProperty patientEmailProperty() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail.set(patientEmail);
    }

    public String getPatientAddress() {
        return patientAddress.get();
    }

    public StringProperty patientAddressProperty() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress.set(patientAddress);
    }

    public String getPatientTelephone() {
        return patientTelephone.get();
    }

    public StringProperty patientTelephoneProperty() {
        return patientTelephone;
    }

    public void setPatientTelephone(String patientTelephone) {
        this.patientTelephone.set(patientTelephone);
    }

    public String getPatientGender() {
        return patientGender.get();
    }

    public StringProperty patientGenderProperty() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender.set(patientGender);
    }

    public String getPatientDOB() {
        return patientDOB.get();
    }

    public StringProperty patientDOBProperty() {
        return patientDOB;
    }

    public void setPatientDOB(String patientDOB) {
        this.patientDOB.set(patientDOB);
    }

    public String getPatientInsuranceName() {
        return patientInsuranceName.get();
    }

    public StringProperty patientInsuranceNameProperty() {
        return patientInsuranceName;
    }

    public void setPatientInsuranceName(String patientInsuranceName) {
        this.patientInsuranceName.set(patientInsuranceName);
    }

    public String getPatientInsuranceCardNo() {
        return patientInsuranceCardNo.get();
    }

    public StringProperty patientInsuranceCardNoProperty() {
        return patientInsuranceCardNo;
    }

    public void setPatientInsuranceCardNo(String patientInsuranceCardNo) {
        this.patientInsuranceCardNo.set(patientInsuranceCardNo);
    }

    public String getPatientNationalOrPassportIDNo() {
        return patientNationalOrPassportIDNo.get();
    }

    public StringProperty patientNationalOrPassportIDNoProperty() {
        return patientNationalOrPassportIDNo;
    }

    public void setPatientNationalOrPassportIDNo(String patientNationalOrPassportIDNo) {
        this.patientNationalOrPassportIDNo.set(patientNationalOrPassportIDNo);
    }

    public String getPatientMaritalStatus() {
        return patientMaritalStatus.get();
    }

    public StringProperty patientMaritalStatusProperty() {
        return patientMaritalStatus;
    }

    public void setPatientMaritalStatus(String patientMaritalStatus) {
        this.patientMaritalStatus.set(patientMaritalStatus);
    }

    public String getPatientAllergies() {
        return patientAllergies.get();
    }

    public StringProperty patientAllergiesProperty() {
        return patientAllergies;
    }

    public void setPatientAllergies(String patientAllergies) {
        this.patientAllergies.set(patientAllergies);
    }

    public String getSpouseID() {
        return spouseID.get();
    }

    public StringProperty spouseIDProperty() {
        return spouseID;
    }

    public void setSpouseID(String spouseID) {
        this.spouseID.set(spouseID);
    }

    public String getSpouseFirstName() {
        return spouseFirstName.get();
    }

    public StringProperty spouseFirstNameProperty() {
        return spouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName.set(spouseFirstName);
    }

    public String getSpouseLastName() {
        return spouseLastName.get();
    }

    public StringProperty spouseLastNameProperty() {
        return spouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName.set(spouseLastName);
    }

    public String getSpouseEmail() {
        return spouseEmail.get();
    }

    public StringProperty spouseEmailProperty() {
        return spouseEmail;
    }

    public void setSpouseEmail(String spouseEmail) {
        this.spouseEmail.set(spouseEmail);
    }

    public String getSpouseAddress() {
        return spouseAddress.get();
    }

    public StringProperty spouseAddressProperty() {
        return spouseAddress;
    }

    public void setSpouseAddress(String spouseAddress) {
        this.spouseAddress.set(spouseAddress);
    }

    public String getSpouseTelephone() {
        return spouseTelephone.get();
    }

    public StringProperty spouseTelephoneProperty() {
        return spouseTelephone;
    }

    public void setSpouseTelephone(String spouseTelephone) {
        this.spouseTelephone.set(spouseTelephone);
    }

    public String getSpouseGender() {
        return spouseGender.get();
    }

    public StringProperty spouseGenderProperty() {
        return spouseGender;
    }

    public void setSpouseGender(String spouseGender) {
        this.spouseGender.set(spouseGender);
    }

    public String getSpouseDOB() {
        return spouseDOB.get();
    }

    public StringProperty spouseDOBProperty() {
        return spouseDOB;
    }

    public void setSpouseDOB(String spouseDOB) {
        this.spouseDOB.set(spouseDOB);
    }

    public String getSpouseInsuranceName() {
        return spouseInsuranceName.get();
    }

    public StringProperty spouseInsuranceNameProperty() {
        return spouseInsuranceName;
    }

    public void setSpouseInsuranceName(String spouseInsuranceName) {
        this.spouseInsuranceName.set(spouseInsuranceName);
    }

    public String getSpouseInsuranceCardNo() {
        return spouseInsuranceCardNo.get();
    }

    public StringProperty spouseInsuranceCardNoProperty() {
        return spouseInsuranceCardNo;
    }

    public void setSpouseInsuranceCardNo(String spouseInsuranceCardNo) {
        this.spouseInsuranceCardNo.set(spouseInsuranceCardNo);
    }

    public String getSpouseNationalOrPassportIDNo() {
        return spouseNationalOrPassportIDNo.get();
    }

    public StringProperty spouseNationalOrPassportIDNoProperty() {
        return spouseNationalOrPassportIDNo;
    }

    public void setSpouseNationalOrPassportIDNo(String spouseNationalOrPassportIDNo) {
        this.spouseNationalOrPassportIDNo.set(spouseNationalOrPassportIDNo);
    }



}
