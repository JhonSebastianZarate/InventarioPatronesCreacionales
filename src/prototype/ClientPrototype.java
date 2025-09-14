package prototype;

public class ClientPrototype {
    public static void main(String[] args) {
        // Crear prototipo 1
        ConcretePrototype prototype1 = new ConcretePrototype("Ejemplo1", 1);
        ConcretePrototype clone1 = (ConcretePrototype) prototype1.clone();

        // Crear prototipo 2
        ConcretePrototype prototype2 = new ConcretePrototype("Ejemplo2", 2);
        ConcretePrototype2 clone2 = (ConcretePrototype2) prototype2.clone();

        // Mostrar resultados
        System.out.println("Original 1: " + prototype1);
        System.out.println("Clon 1: " + clone1);

        System.out.println("Original 2: " + prototype2);
        System.out.println("Clon 2: " + clone2);
    }
}
