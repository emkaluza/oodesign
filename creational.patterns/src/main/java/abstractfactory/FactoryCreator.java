package abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class FactoryCreator {
    private static Map<Country, AbstractPhoneNumberGenerator> factories = new HashMap();

    static AbstractPhoneNumberGenerator getFactory(final Country country){
        if (factories.containsKey(country)) {
            return factories.get(country);
        }

        AbstractPhoneNumberGenerator factory = null;
        switch (country) {
            case POLAND:
                factory = new PolishNumberFactory();
                break;
            case USA:
                factory = new USANumberFactory();
                break;
            default:
                break;
        }

        if (factory == null) {
            throw new IllegalArgumentException("Should not happen");
        }

        factories.put(country, factory);
        return factory;
    }

    public enum Country {
        POLAND, USA
    }
}

