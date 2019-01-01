package abstractfactory;

abstract class AbstractPhoneNumberGenerator {
    public abstract HomePhone generatePersonalNumber();
    public abstract MobilePhone generateMobileNumber();
}
