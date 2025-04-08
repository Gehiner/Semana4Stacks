public class Contenedor {
    private int id;
    private String producto;

    public Contenedor(int id, String producto) {
        this.id = id;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    @Override
    public String toString() {
        return "[" + id + ": " + producto + "]";
    }
}
