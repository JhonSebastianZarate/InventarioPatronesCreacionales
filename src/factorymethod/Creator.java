package factorymethod;

/**
 * ConcreteCreator: crea un ConcreteProduct específico.
 */
public class ConcreteCreator extends Creator {

    @Override
    public Product createProduct() {
        // Nota de estudiante: aquí podría cambiar la lógica en el futuro
        return new ConcreteProduct();
    }
}
