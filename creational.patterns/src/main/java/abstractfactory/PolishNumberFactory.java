package abstractfactory;

class PolishNumberFactory extends AbstractPhoneNumberGenerator {
    final String POLAND_PREFIX = "+48";
    private static int counter = 0;

    @Override
    public HomePhone generatePersonalNumber() {
        return new PolishHomePhone(""+(++counter));
    }

    @Override
    public MobilePhone generateMobileNumber() {
        return new PolishMobilePhone(""+(++counter));
    }

    private class PolishHomePhone extends HomePhone {
        public PolishHomePhone(final String number) {
            super(POLAND_PREFIX+" "+number);
            System.out.println(getClass().toGenericString());
        }
    }

    private class PolishMobilePhone extends MobilePhone {
        public PolishMobilePhone(final String number) {
            super(POLAND_PREFIX+" "+number);
            System.out.println(getClass().toGenericString());
        }
    }
}
