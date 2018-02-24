package comercio;

public class Ticket {
    
    private String numVenta;
    private String nombre;
    private float precioTotal;

    public Ticket() {
    }

    public Ticket(String numVenta, String nombre, float precioTotal) {
        this.numVenta = numVenta;
        this.nombre = nombre;
        this.precioTotal = precioTotal;
    }

    public String getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(String numVenta) {
        this.numVenta = numVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numVenta=" + numVenta + ", nombre=" + nombre + ", precioTotal=" + precioTotal + '}';
    }
    
    


}
