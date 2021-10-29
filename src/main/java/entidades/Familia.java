package entidades;

public class Familia {

    private Integer id;
    private String nombre;
    private Integer edadMinima;
    private Integer edadMaxima;
    private Integer cantidadHijos;
    private String email;
    private Integer idCasaFamilia;

    public Familia() {
    }

    public Familia(Integer id, String nombre, Integer edadMinima, Integer edadMaxima, Integer cantidadHijos, String email, Integer idCasaFamilia) {
        this.id = id;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.cantidadHijos = cantidadHijos;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
    }

    public Integer getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(Integer idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
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

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public Integer getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(Integer cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Familia{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", edadMinima=" + edadMinima
                + ", edadMaxima=" + edadMaxima
                + ", cantidadHijos=" + cantidadHijos
                + ", email='" + email + '\''
                + '}';
    }
}

