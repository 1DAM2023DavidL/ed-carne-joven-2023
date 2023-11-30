public class Descuento {
    private String codigo;
    private String fecha;
    private Usuario usuario;
    private Oferta oferta;

    //Metodos
    //Constructor
    public Descuento(String codigo, String fecha, Usuario usuario, Oferta oferta) {
        this.codigo=codigo;
        this.fecha=fecha;
        this.usuario=usuario;
        this.oferta=oferta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
}
