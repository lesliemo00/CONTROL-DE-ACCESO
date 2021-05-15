package TCP;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import BD.BD;
import LOGICA.Registro;

class Hiloservidor extends Thread {

    final ObjectInputStream dis;
    final ObjectOutputStream dos;
    final Socket socket;
    private final BD datos;

    /**
     * CONSTRUCTOR
     *
     * @param soc
     * @param dis
     * @param dos
     */
    public Hiloservidor(Socket soc, ObjectInputStream dis, ObjectOutputStream dos) {
        this.socket = soc;
        this.dis = dis;
        this.dos = dos;
        this.datos = new BD();
    }

    @Override
    /**
     * SE ENCARGA DE RECIBIR LOS REGISTROS GUARDADOS EN LA BASE DE DATOS Y
     * ENVIAR LA LISTA DE LOS REGISTROS AL CLIENTE PARA SER MOSTRADOS EN LA
     * TABLA
     */
    public void run() {
        try {
            // recibir registros para guardarlos en BD
            Registro reg = (Registro) dis.readObject();
            // guardar en BD
            datos.AgregarInfo(reg.getNomnbre(), reg.getApellido(), reg.getCarrera(), reg.getCodigo(), reg.getSala()); 

            // enviar lista de registros al cliente para mostrar en tabla
            dos.writeObject(datos.ListarRegistros());
            dos.flush();

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hiloservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
