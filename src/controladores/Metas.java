package controladores;

import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelos.DataManager;

public class Metas {

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

    public void actualizarProducto(int id, String... datos) throws SQLException {
        DataManager manejador = new DataManager();
        String tipo = datos.length > 3 ? "ingresos" : "gastos";

        String sql = "UPDATE " + tipo + " SET "
                + "fecha='" + datos[0] + "', "
                + "categorias='" + datos[1] + "', "
                + (tipo.equals("ingresos") ? "ingresos" : "gastos") + "=" + datos[2] + " "
                + "WHERE id=" + id;

        manejador.ejecutarConsulta(sql);
        manejador.cerrar();
    }
    public double calcularDiferencia(int idInicio, int idFinal) throws SQLException {
        double sumaIngresos = calcularSuma("ingresos", idInicio, idFinal);
        double sumaGastos = calcularSuma("gastos", idInicio, idFinal);

        return sumaIngresos - sumaGastos;
    }

    private double calcularSuma(String tipo, int idInicio, int idFinal) throws SQLException {
        double suma = 0;

        DataManager manejador = new DataManager();
        String consulta = tipo.equals("ingresos")
                ? "SELECT SUM(ingresos) as total FROM ingresos WHERE id BETWEEN " + idInicio + " AND " + idFinal
                : "SELECT SUM(gastos) as total FROM gastos WHERE id BETWEEN " + idInicio + " AND " + idFinal;

        ResultSet resultado = manejador.obtenerDatos(consulta);

        try {
            if (resultado.next()) {
                suma = resultado.getDouble("total");
            }
        } finally {
            manejador.cerrar();
        }

        return suma;
    }
}