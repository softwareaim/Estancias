package entidades;

public class Comentario {

    private Integer id;
    private Integer idCasa;
    private String comentario;

    public Comentario() {
    }

    public Comentario(Integer id, Integer idCasa, String comentario) {
        this.id = id;
        this.idCasa = idCasa;
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Integer idCasa) {
        this.idCasa = idCasa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{"
                + "id=" + id
                + ", idCasa=" + idCasa
                + ", comentario='" + comentario + '\''
                + '}';
    }
}
