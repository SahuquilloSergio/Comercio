package comercio;

public class Ventas{
    private String NumVent;
    private String RefPro;
    private float Cant;

    public Ventas() {
    }

    public Ventas(String NumVent, String RefPro, float Cant) {
        this.NumVent = NumVent;
        this.RefPro = RefPro;
        this.Cant = Cant;
    }

    public String getNumVent() {
        return NumVent;
    }

    public void setNumVent(String NumVent) {
        this.NumVent = NumVent;
    }

    public String getRefPro() {
        return RefPro;
    }

    public void setRefPro(String RefPro) {
        this.RefPro = RefPro;
    }

    public float getCant() {
        return Cant;
    }

    public void setCant(float Cant) {
        this.Cant = Cant;
    }


    @Override
    public String toString() {
        return NumVent+"    " + RefPro+"    " + Cant+"\n";
    }

    
    
    
}
