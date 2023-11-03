package controladores;


import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelos.DataManager;

public class Analisis {

    public DefaultTableModel cargarProductos(String tipo) throws SQLException {
        String[] columnas = {
            "Id",
            "Fecha",
            "Categorias",
            tipo.equals("ingresos") ? "Ingresos" : "Gastos"
        };
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        DataManager manejador = new DataManager();

        String consulta = tipo.equals("ingresos") ? "SELECT * FROM ingresos" : "SELECT * FROM gastos";
        ResultSet datos = manejador.obtenerDatos(consulta);

        String[] registro = new String[4];
        while (datos.next()) {
            registro[0] = datos.getString("id");
            registro[1] = datos.getString("fecha");
            registro[2] = datos.getString("categorias");
            registro[3] = String.valueOf(tipo.equals("ingresos") ? datos.getDouble("ingresos") : datos.getDouble("gastos"));
            modelo.addRow(registro);
        }
        manejador.cerrar();
        return modelo;
    }

    public double obtenerSuma(String tipo, int inicio, int fin) throws SQLException {
        DataManager manejador = new DataManager();
        String columna = tipo.equals("ingresos") ? "ingresos" : "gastos";
        String consulta = "SELECT SUM(" + columna + ") AS suma FROM " + tipo + " WHERE id BETWEEN " + inicio + " AND " + fin;
        ResultSet datos = manejador.obtenerDatos(consulta);
        double suma = 0;
        if (datos.next()) {
            suma = datos.getDouble("suma");
        }
        manejador.cerrar();
        return suma;
    }

    public double obtenerPromedio(String tipo, int inicio, int fin) throws SQLException {
        DataManager manejador = new DataManager();
        String columna = tipo.equals("ingresos") ? "ingresos" : "gastos";
        String consulta = "SELECT AVG(" + columna + ") AS promedio FROM " + tipo + " WHERE id BETWEEN " + inicio + " AND " + fin;
        ResultSet datos = manejador.obtenerDatos(consulta);
        double promedio = 0;
        if (datos.next()) {
            promedio = datos.getDouble("promedio");
        }
        manejador.cerrar();
        return promedio;
    }

    public String obtenerCategoriaMasFrecuente(String tipo, int inicio, int fin) throws SQLException {
        DataManager manejador = new DataManager();
        String consulta = "SELECT categorias, SUM(" + (tipo.equals("ingresos") ? "ingresos" : "gastos") + ") AS suma "
                + "FROM " + tipo + " WHERE id BETWEEN " + inicio + " AND " + fin + " GROUP BY categorias ORDER BY suma DESC LIMIT 1";
        ResultSet datos = manejador.obtenerDatos(consulta);
        String resultado = "";
        if (datos.next()) {
            resultado = datos.getString("categorias") + " " + datos.getDouble("suma");
        }
        manejador.cerrar();
        return resultado;
    }
}