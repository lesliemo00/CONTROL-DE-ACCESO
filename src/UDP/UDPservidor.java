package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lesli
 */
public class UDPservidor {

    private final int puerto = 5000;
    private DatagramSocket servidorSocket;
    private DatagramPacket clientePacket;
    String ip;

    /**
     * CONSTRUCTOR
     */

    public UDPservidor() {
        try {
            this.servidorSocket = new DatagramSocket(puerto);

            this.ip = InetAddress.getLocalHost().getHostAddress();
            System.out.println(" [OK] inicializado el DatagramSocket y escuchando...");
        } catch (SocketException ex) {
            Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * SE ENCARGA DE INICIAR EL SERVIDOR PARA RECIBIR LAS PETICIONES DE LOS
     * CLIENTES POR MEDIO DE HILOS Y DATGRAM
     *
     * @throws ClassNotFoundException
     */
    public void iniciarServidor() throws ClassNotFoundException {

        // esperando petición del cliente
        while (true) {
            try {
                byte[] recBytes = new byte[65535];
                // crear DatgramPacket para recibir datos
                clientePacket = new DatagramPacket(recBytes, recBytes.length);

                // recivir los datos en byte buffer. 
                servidorSocket.receive(clientePacket);

                // crear hilo para atender cliente nuevo
                Thread t = new Hiloservidor(recBytes, servidorSocket, clientePacket);
                t.start();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, " No se pudo inicializar el DatagramSocket");
                Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * SE ENCARGA DE DETENER EL FUNCIONAMIENTO DEL SERVIDOR
     */
    public void detenerServidor() {
        try {
            servidorSocket.close();
            JOptionPane.showMessageDialog(null, " DatagramSocket detenido");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo detener el servidor");
            Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getPuerto() {
        return puerto;
    }

    public String getIp() {
        return ip;
    }

}
