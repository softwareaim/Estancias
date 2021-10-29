package entidades;

public class Cliente {

    private Integer id;
    private String nombre;
    private String calle;
    private Integer numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String calle, Integer numero, String codigoPostal, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Cliente{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", calle='" + calle + '\''
                + ", numero=" + numero
                + ", codigoPostal='" + codigoPostal + '\''
                + ", ciudad='" + ciudad + '\''
                + ", pais='" + pais + '\''
                + '}';
    }
}
