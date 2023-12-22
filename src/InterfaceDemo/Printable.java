package InterfaceDemo;

public interface Printable {

    String NAME = "ABC";

    void test(); // INTERFACE Automatically understand public abstract method

    public default void value(){  }

}
