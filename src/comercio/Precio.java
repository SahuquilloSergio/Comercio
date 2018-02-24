package comercio;

public class Precio{
    private String RefPre;
    private int Precio;

    public Precio() {
    }

    public Precio(String RefPre, int Precio) {
        this.RefPre = RefPre;
        this.Precio = Precio;
    }

    public String getRefPre() {
        return RefPre;
    }

    public void setRefPre(String RefPre) {
        this.RefPre = RefPre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }


    @Override
    public String toString() {
        return RefPre + "    " + Precio + "   "+"\n";
    }

    
}
    
    
    

