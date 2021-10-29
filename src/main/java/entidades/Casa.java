package entidades;

import java.util.Date;

public class Casa {

    private Integer id;
    private String calle;
    private Integer numero;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private Integer tiempoMinimo;
    private Integer tiempoMaximo;
    private Double precioHabitacion;
    private String tipoVivienda;

    public Casa() {
    }

    public Casa(Integer id, String calle, Integer numero, String codigoPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta, Integer tiempoMinimo, Integer tiempoMaximo, Double precioHabitacion, String tipoVivienda) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.tiempoMinimo = tiempoMinimo;
        this.tiempoMaximo = tiempoMaximo;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMinimo(Integer tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public Integer getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(Integer tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casa{"
                + "id=" + id
                + ", calle='" + calle + '\''
                + ", numero=" + numero
                + ", codigoPostal='" + codigoPostal + '\''
                + ", ciudad='" + ciudad + '\''
                + ", pais='" + pais + '\''
                + ", fechaDesde=" + fechaDesde
                + ", fechaHasta=" + fechaHasta
                + ", tiempoMinimo=" + tiempoMinimo
                + ", tiempoMaximo=" + tiempoMaximo
                + ", precioHabitacion=" + precioHabitacion
                + ", tipoVivienda='" + tipoVivienda + '\''
                + '}';
    }
}
