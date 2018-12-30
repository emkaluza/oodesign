package abstractfactory;

public class USANumberFactory extends AbstractPhoneNumberGenerator {
    final String USA_PREFIX = "+990";
    private static int counter = 0;

    @Override
    public HomePhone generatePersonalNumber() {
        return new USAHomePhone(""+(++counter));
    }

    @Override
    public MobilePhone generateMobileNumber() {
        return new USAMobilePhone(""+(++counter));
    }

    private class USAHomePhone extends HomePhone {
        public USAHomePhone(final String number) {
            super(USA_PREFIX +" "+number);
            System.out.println(getClass().toGenericString());
        }
    }

    private class USAMobilePhone extends MobilePhone {
        public USAMobilePhone(final String number) {
            super(USA_PREFIX +" "+number);
            System.out.println(getClass().toGenericString());
        }
    }
}
