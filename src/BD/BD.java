
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import LOGICA.Registro;
import javax.swing.JOptionPane;

public class BD {

    String driver, url, login, password;
    Connection conexion = null;

    public BD() {

        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/registros";
        login = "root";
        password = "";
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, login, password);
              JOptionPane.showMessageDialog(null,"Conexion con Base de datos Ok....");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exc) {
              JOptionPane.showMessageDialog(null,("Error al tratar de abrir la base de datos "+exc.getMessage()));
        
        }

    }

    /***
     * SE ENCARGA DE AGREGAR LA INFORMACION DEL REGISTRO A LOS SIGUIENTES PARAMETROS:
     * nombre varchar(50)
     * apellido varchar(50)
     * Carrera varchar (50)
     * codigo varchar (15)
     * fecha varchar(15)
     * Sala vasrchar (50)
     * @param nombre
     * @param apellido@param codigo
     * @param sala@param carrera     ***/
    public void AgregarInfo(String nombre, String apellido, String codigo, String carrera, String sala) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:");
         String fecha = sdf.format(new Date());
         System.out.println(fecha);
         String fechaS= null;
        String ComandoSQL = "INSERT INTO estudiantes  VALUES ('" + nombre + "' , '" + apellido + "' , '" + codigo + "' , '"+carrera+"' , '"+sala+"' , '"+fecha+"' , '"+fechaS+"')";
        try {
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(ComandoSQL);
            JOptionPane.showMessageDialog(null,"Registro agregado!");
            stmt.close();

        } catch (java.sql.SQLException er) {
            JOptionPane.showMessageDialog(null,"No se pudo realizar la operación.");
        }
    }
/**
 * SE ENCARGA DE RECIBIR LA LISTA DE REISTRO QUE ESTA EN LA BASE DE DATOS
 * @return ArrayList<Registro>
 */

    public ArrayList<Registro> ListarRegistros() {
        String nombre,codigo,fecha,sala,carrera,apellido,fechaS;
   
        String ComandoSQL = "SELECT * FROM estudiantes";
        ArrayList<Registro> cts = new ArrayList<>();

        try {
            Statement stmt = conexion.createStatement();
            ResultSet resultado = stmt.executeQuery(ComandoSQL);

            while (resultado.next()) {
                nombre = resultado.getString(1);
                apellido = resultado.getString(2);
                codigo = resultado.getString(3);
                carrera = resultado.getString(4);
                sala = resultado.getString(5);    
                fecha = resultado.getString(6);
                fechaS= resultado.getString(7);
                cts.add(new Registro(nombre,apellido,codigo,carrera,sala,fecha,fechaS));
            }
            stmt.close();
        } catch (java.sql.SQLException er) {
            JOptionPane.showMessageDialog(null,"No se pudo realizar la operación.");
        }
        return cts;
    }
}
