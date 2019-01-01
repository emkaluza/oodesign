package abstractfactory;

class AbstractFactoryMain {
    public static void main(final String... args) {
        System.out.println(FactoryCreator.getFactory(FactoryCreator.Country.POLAND).generateMobileNumber().getMobileNumber());
        System.out.println(FactoryCreator.getFactory(FactoryCreator.Country.POLAND).generatePersonalNumber().getHomeNumber());

        System.out.println(FactoryCreator.getFactory(FactoryCreator.Country.USA).generatePersonalNumber().getHomeNumber());
        System.out.println(FactoryCreator.getFactory(FactoryCreator.Country.USA).generateMobileNumber().getMobileNumber());
    }
}
