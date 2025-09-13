package factorymethod;

public class ConcreteProduct implements Product {

    @Override
    public String getName() {
        return "Producto concreto creado con Factory Method";
    }
}
