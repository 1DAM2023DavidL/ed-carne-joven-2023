public class Usuario {
    private String dni;
    private String nombre;
    private String correoElectronico;

    //Metodos
    //Constructor
    public Usuario(String dni, String nombre, String correoElectronico) {
        this.dni=dni;
        this.nombre=nombre;
        this.correoElectronico=correoElectronico;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
