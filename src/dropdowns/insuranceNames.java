package dropdowns;

public enum insuranceNames {
    Jubilee, Britam, AAR, NHIF, Minet;

        private  insuranceNames(){}
        public String insuranceNames(){return name();}
        public static insuranceNames frompatientGender(String i){return valueOf(i);}

}
