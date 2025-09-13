import factorymethod.*;

public class Main {
    public static void main(String[] args) {
        // Uso del Factory Method
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct();

        System.out.println("Se creó: " + product.getName());

        // Usando el método prepareProduct
        creator.prepareProduct("Inventario inicializado");
    }
}
