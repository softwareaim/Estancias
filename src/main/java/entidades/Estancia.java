package entidades;
import java.util.Date;

public class Estancia {

    private Integer id;
    private Integer idCliente;
    private Integer idCasa;
    private String nombreHuesped;
    private Date fechaDesde;
    private Date fechaHasta;

    public Estancia() {
    }

    public Estancia(Integer id, Integer idCliente, Integer idCasa, String nombreHuesped, Date fechaDesde, Date fechaHasta) {
        this.id = id;
        this.idCliente = idCliente;
        this.idCasa = idCasa;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        return "Estancia{"
                + "id=" + id
                + ", idCliente=" + idCliente
                + ", idCasa=" + idCasa
                + ", nombreHuesped='" + nombreHuesped + '\''
                + ", fechaDesde=" + fechaDesde
                + ", fechaHasta=" + fechaHasta
                + '}';
    }
}
