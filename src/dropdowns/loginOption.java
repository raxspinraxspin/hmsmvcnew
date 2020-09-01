package dropdowns;

public enum loginOption {
    Admin, User;

        private loginOption(){}

        public String value(){return name();}

        public static loginOption fromvalue(String v){return valueOf(v);}
}
