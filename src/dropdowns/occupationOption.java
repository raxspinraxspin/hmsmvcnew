package dropdowns;

public enum occupationOption {
    GeneralPractitioner, Doctor, Opthamologist, Gynaecologist, Dermatologist, SystemAdmin, Ass_System_Admin, Receptionist;

    private occupationOption(){}

    public String occupationOption(){return name();}

    public static occupationOption fromoccupationOption(String o){return valueOf(o);}
}
