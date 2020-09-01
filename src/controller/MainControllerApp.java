package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;


public class MainControllerApp {
    @FXML
    private TabPane root;

    @FXML
    private EmployeeController employeeTab;

    @FXML
    private PatientController patientTab;

    @FXML
    private TriageController triageTab;

    @FXML
    private DiagnosisController diagnosisTab;

    @FXML
    private AppointmentController appointmentsTab;

    @FXML
    private LabaratoryController labaratoryTab;

    @FXML
    private PharmacyController pharmacyTab;

    @FXML
    private RecordsController recordsTab;

    @FXML
    private ReportsController reportsTab;



    /**@FXML private void initializeEmployee(){
        employeeTab.injectMainController(this);
    }

    @FXML private void initializePatient(){
        patientTab.injectMainController(this);
    }
    **/




}
