public class Main {
    public static void main(String[] args) {
        //Usuario
        Usuario usuario = new Usuario("12345678D","Pepe","pepe@gmail.com");

        //Oferta
        Oferta oferta = new Oferta("001","Oferta","30/11/2023","05/12/2023","25%");
        //Promocion
        Descuento promocion = new Descuento("001","04/12/2023",usuario,oferta);
    }
}
