package enums;

public enum Gender {
    MAN(1,"男"),WOMAN(0,"女");
    public final Integer TYPE;
    public final String VALUE;
    Gender(Integer type,String value){
        this.TYPE=type;
        this.VALUE=value;
    }
}
