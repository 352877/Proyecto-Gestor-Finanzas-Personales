package controladores;

import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelos.DataManager;

public class EditarIngresos {

    public DefaultTableModel cargarProductos() throws SQLException {
        String[] columnas = {
                "Id",
                "Fecha",
                "Categorias",
                "Ingresos",
        };
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        DataManager manejador = new DataManager();
        ResultSet datos = manejador.obtenerDatos("SELECT * FROM ingresos");
        String[] registro = new String[8];
        while (datos.next()) {
            registro[0] = datos.getString("id");
            registro[1] = datos.getString("fecha");
            registro[2] = datos.getString("categorias");
            registro[3] = String.valueOf(datos.getDouble("ingresos"));
            modelo.addRow(registro);
        }
        manejador.cerrar();
        return modelo;
    }

    public void actualizarProducto(int id, String... datos) throws SQLException {
        DataManager manejador = new DataManager();
        String sql = "UPDATE ingresos SET "
                + "fecha='" + datos[0] + "', "
                + "categorias='" + datos[1] + "', "
                + "ingresos=" + datos[2] + " "
                + "WHERE id=" + id;

        manejador.ejecutarConsulta(sql);
        manejador.cerrar();
    }

    public void eliminarProducto(int id) throws SQLException {
        DataManager manejador = new DataManager();
        String sql = "DELETE FROM ingresos WHERE id=" + id;
        manejador.ejecutarConsulta(sql);
        manejador.cerrar();
    }
}