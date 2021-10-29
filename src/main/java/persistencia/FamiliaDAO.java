package persistencia;

import entidades.Familia;
import interfaces.IDao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class FamiliaDAO implements IDao<Familia> {

    @Override
    public List<Familia> listar() {

        List<Familia> familias = new ArrayList<>();
        try (Connection conn = Conexion.getConexion();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM familias");
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Familia f = new Familia();
                f.setId(rs.getInt(1));
                f.setNombre(rs.getString(2));
                f.setEdadMinima(rs.getInt(3));
                f.setEdadMaxima(rs.getInt(4));
                f.setCantidadHijos(rs.getInt(5));
                f.setEmail(rs.getString(6));
                f.setIdCasaFamilia(rs.getInt(7));
                familias.add(f);
            }
        } catch (SQLException e) {
            System.out.println("ERROR 'listar'");
            e.printStackTrace();
        }
        return familias;
    }

    @Override
    public Familia encontrar(Familia f) {
        try (Connection conn = Conexion.getConexion();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM familias WHERE id_familia = ?")) {
            stmt.setInt(1, f.getId());
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    f.setId(rs.getInt(1));
                    f.setNombre(rs.getString(2));
                    f.setEdadMinima(rs.getInt(3));
                    f.setEdadMaxima(rs.getInt(4));
                    f.setCantidadHijos(rs.getInt(5));
                    f.setEmail(rs.getString(6));
                    f.setIdCasaFamilia(rs.getInt(7));
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR 'encontrar'");
            e.printStackTrace();
        }
        return f;
    }

    @Override
    public int insertar(Familia t) {
        int rows = 0;
        try (Connection conn = Conexion.getConexion();
                PreparedStatement stmt = conn.prepareStatement("INSERT nombre = ?, edad_minima = ?,"
                        + "edad_maxima = ?, num_hijos = ?, email = ?, id_casa_familia = ? INTO familias")) {
            stmt.setString(1, t.getNombre());
            stmt.setInt(2, t.getEdadMinima());
            stmt.setInt(3, t.getEdadMaxima());
            stmt.setInt(4, t.getCantidadHijos());
            stmt.setString(5, t.getEmail());
            stmt.setInt(6, t.getIdCasaFamilia());
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR 'insertar'");
            e.printStackTrace();
        }
        return rows;
    }

    @Override
    public int modificar(Familia t) {
        int rows = 0;
        try (Connection conn = Conexion.getConexion();
                PreparedStatement stmt = conn.prepareStatement("UPDATE familias SET (nombre, edad_minima,"
                        + "edad_maxima, num_hijos, email, id_casa_familia) VALUES (?,?,?,?,?,?) WHERE id_familia = ?")) {
            stmt.setString(1, t.getNombre());
            stmt.setInt(2, t.getEdadMinima());
            stmt.setInt(3, t.getEdadMaxima());
            stmt.setInt(4, t.getCantidadHijos());
            stmt.setString(5, t.getEmail());
            stmt.setInt(6, t.getIdCasaFamilia());
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR 'modificar'");
            e.printStackTrace();
        }
        return rows;
    }

    @Override
    public void eliminar(Familia t) {

        try (Connection conn = Conexion.getConexion();
                PreparedStatement stmt = conn.prepareStatement("DELETE FROM familias WHERE id_familia = ?")) {
            
            stmt.setInt(1, t.getId());
            stmt.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println("ERROR 'eliminar");
            e.printStackTrace();
        }
    }

}
