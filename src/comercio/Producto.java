package comercio;

public class Producto{
    private String RefPro;
    private String NomPro;
    private String RefPre;

    public Producto() {
    }

    public Producto(String RefPro, String NomPro, String RefPre) {
        this.RefPro = RefPro;
        this.NomPro = NomPro;
        this.RefPre = RefPre;
    }

    public String getRefPro() {
        return RefPro;
    }

    public void setRefPro(String RefPro) {
        this.RefPro = RefPro;
    }

    public String getNomPro() {
        return NomPro;
    }

    public void setNomPro(String NomPro) {
        this.NomPro = NomPro;
    }

    public String getRefPre() {
        return RefPre;
    }


    public void setRefPre(String RefPre) {
        this.RefPre = RefPre;
    }

    @Override
    public String toString() {
        return RefPro + "   " + NomPro + "  " + RefPre+"\n";
    }



    
    
}
