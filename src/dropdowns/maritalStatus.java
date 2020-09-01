package dropdowns;

public enum maritalStatus {
    Married, Single;

    private maritalStatus(){}

    public String maritalStatus(){return name();}

    public static maritalStatus frommaritalStatus(String m){return valueOf(m);}
}
