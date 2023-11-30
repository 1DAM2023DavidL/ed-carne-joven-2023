import java.util.ArrayList;

public class Online extends Establecimiento{
    private String paginaWeb;
    private ArrayList<Oferta> oferta;

    //Metodos
    //Constructor
    public Online(String cif, String razonSocial, String paginaWeb, ArrayList<Oferta> oferta) {
        super (cif,razonSocial);
        this.paginaWeb=paginaWeb;
        this.oferta=oferta;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public ArrayList<Oferta> getOferta() {
        return oferta;
    }

    public void setOferta(ArrayList<Oferta> oferta) {
        this.oferta = oferta;
    }
}
