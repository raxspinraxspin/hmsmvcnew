package dropdowns;


public enum genderOption {

    Male, Female;

    private genderOption(){}

    public String patientGender(){return name();}

    public static genderOption frompatientGender(String pg){return valueOf(pg);}

}
