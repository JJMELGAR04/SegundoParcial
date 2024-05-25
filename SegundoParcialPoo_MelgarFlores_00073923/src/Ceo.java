public class Ceo {
    private String nombre;
    private AbstractFactory factory;


    public Ceo(AbstractFactory factory, String nombre) {
        this.factory = factory;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AbstractFactory getFactory() {
        return factory;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }
}