public class Establecimiento {
    private String cif;
    private String razonSocial;

    //Metodos
    //Constructor
    public Establecimiento(String cif, String razonSocial) {
        this.cif=cif;
        this.razonSocial=razonSocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
