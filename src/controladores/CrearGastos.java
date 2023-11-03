package controladores;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import modelos.DataManager;

public class CrearGastos {
    
    public void crearProducto(String... datos) throws SQLException{
        DataManager manejador = new DataManager();
        String sql = String.format("INSERT INTO gastos("
                + "id, fecha, categorias, gastos"
               + ") VALUES('%s', '%s', '%s', %s)", datos);
        manejador.ejecutarConsulta(sql);
    }
    
    public DefaultTableModel cargarProductos() throws SQLException {
        String [] columnas = {
            "Id",
            "Fecha",
            "Categorias", 
            "Gastos",
        };
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        DataManager manejador = new DataManager();
        ResultSet datos = manejador.obtenerDatos("SELECT * FROM gastos");
        String[] registro = new String[7];
        while(datos.next()){
            registro[0] = datos.getString("id");
            registro[1] = datos.getString("fecha");
            registro[2] = datos.getString("categorias");
            registro[3] = String.valueOf(datos.getDouble("gastos"));
            modelo.addRow(registro);
        }
        manejador.cerrar();
        return modelo;
    }
}
