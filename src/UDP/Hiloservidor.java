package UDP;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import BD.BD;
import LOGICA.Registro;

/**
 *
 * @author lesli
 */
public class Hiloservidor extends Thread {

    byte[] bytes;
    int port = 5000;
    private BD datos;
    private DatagramSocket servidorSocket;
    private DatagramPacket clientePacket;
    InetAddress ip;

    /**
     *
     * @param bytes
     * @param servidorSocket
     * @param clientePacket
     */
    public Hiloservidor(byte[] bytes, DatagramSocket servidorSocket, DatagramPacket clientePacket) {

        this.bytes = bytes;
        this.servidorSocket = servidorSocket;
        this.clientePacket = clientePacket;
        this.datos = new BD();
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Hiloservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    /**
     * SE ENCARGA DE RECIBIR LOS REGISTROS EN BYTES PARA GUARDARLOS EN LA BASE
     * DE DATOS, TAMBIEN SE ENCARGA DE ENVIAR REGISTROS AL CLIENTE PARA MOSTRAR EN LA TABLA
     * SE TIENE ENCUENTA LA CONVERSIÓN EN BYTES
     */
    public void run() {
        try {

            // recibir registros en Bytes para guardarlos en BD
            ObjectInputStream iStream = new ObjectInputStream(new ByteArrayInputStream(bytes)); // convertir Bytes a Objecto
            Registro reg = (Registro) iStream.readObject();
            iStream.close();
            System.out.println(reg.getNomnbre());
            System.out.println(reg.getApellido());
            System.out.println(reg.getCarrera());
            System.out.println(reg.getCodigo());
            System.out.println(reg.getSala());

            datos.AgregarInfo(reg.getNomnbre(), reg.getApellido(), reg.getCarrera(), reg.getCodigo(), reg.getSala()); // guardar en BD

            // enviar lista de registros al cliente para mostrar en tabla
            ByteArrayOutputStream bStream = new ByteArrayOutputStream(); // convertir ArrayList a Bytes
            ObjectOutput oo = new ObjectOutputStream(bStream);
            oo.writeObject(datos.ListarRegistros());
            oo.close();
            byte[] dato = bStream.toByteArray();

            int portc = clientePacket.getPort(); // obtener puerto de cliente
            System.out.println(portc);

            DatagramPacket DpSend = new DatagramPacket(dato, dato.length, ip, portc);
            servidorSocket.send(DpSend);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hiloservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
