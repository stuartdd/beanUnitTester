package testtools.testBeans;

/**
 * Java Bean Tester library May 2018
 * GitHub "https://github.com/stuartdd/beanUnitTester"
 * @author stuartdd
 */
public class SetMethodNotImplemented {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
