package abstractfactory;

public abstract class HomePhone {
    private final String number;

    protected HomePhone(final String number){
        this.number = number;
    }

    public String getHomeNumber(){
        return number;
    }
}
