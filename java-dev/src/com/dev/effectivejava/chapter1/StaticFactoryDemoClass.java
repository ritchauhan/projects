
/**
 * Class to demo static factory usage
 */
public class StaticFactoryDemoClass {

    /**
     * Public constructor -- One way to create object
     */
    public StaticFactoryDemoClass() {
    }

    /**
     * Another way and better way to create object(basic way)
     * @return
     */
    public static StaticFactoryDemoClass getInstance() {
        return  new StaticFactoryDemoClass();

    }

}