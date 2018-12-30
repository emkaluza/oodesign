package abstractfactory;

public abstract class MobilePhone {
    private final String number;

    protected MobilePhone(final String number){
        this.number = number;
    }

    public String getMobileNumber(){
        return number;
    }
}
