package factorymethod;

public class Client {
    public static void main(String[] args) {
        // Usamos el creador concreto
        Creator creator = new ConcreteCreator();

        // El creador fabrica el producto sin exponer la lógica al cliente
        Product product = creator.createProduct();

        // Mostramos el resultado
        System.out.println("Cliente recibió: " + product.getName());
    }
}
