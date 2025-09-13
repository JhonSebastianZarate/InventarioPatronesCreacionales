package prototype;

public class ConcretePrototype2 implements Prototype {
    private String color;

    public ConcretePrototype2(String color) {
        this.color = color;
    }

    // Constructor de copia
    public ConcretePrototype2(ConcretePrototype2 original) {
        this.color = original.color;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototype2 [color=" + color + "]";
    }
}
