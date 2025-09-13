package prototype;

public class ConcretePrototype implements Prototype {
    private String nombre;
    private int valor;

    public ConcretePrototype(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.nombre, this.valor);
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ConcretePrototype { nombre='" + nombre + "', valor=" + valor + " }";
    }
}
