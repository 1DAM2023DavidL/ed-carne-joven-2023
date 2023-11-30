import java.util.ArrayList;

public class Fisico extends Establecimiento{
    private String direccionPostal;
    private ArrayList<Oferta> oferta;

    //Metodos
    //Constructor
    public Fisico(String cif, String razonSocial, String direccionPostal, ArrayList<Oferta> oferta) {
        super (cif,razonSocial);
        this.direccionPostal=direccionPostal;
        this.oferta=oferta;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public ArrayList<Oferta> getOferta() {
        return oferta;
    }

    public void setOferta(ArrayList<Oferta> oferta) {
        this.oferta = oferta;
    }
}
