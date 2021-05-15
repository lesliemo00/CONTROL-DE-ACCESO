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
import java.net.SocketException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import LOGICA.Registro;
/**
 * 
 * @author lesli
 */
public class UDPcliente {

    InetAddress ip;
    byte[] datos = null;
    int port = 5000;
    DatagramSocket ds;
     int puertocliente;
    
    public UDPcliente() {
        try {
            this.ds = new DatagramSocket();
               
        } catch (SocketException ex) {
            Logger.getLogger(UDPcliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * SE ENCARGA DE RECIBIR REGISTROS Y GUARDARLOS EN LA LISTA EN LA BASE SE DATOS
 * @param reg
 * @return
 * @throws IOException
 * @throws ClassNotFoundException 
 */
    public ArrayList<Registro> GuardarRegistros(Registro reg) throws IOException, ClassNotFoundException {

        ip = InetAddress.getLocalHost(); //localhost      
        datos = ConvertirObjeto(reg);
        
        //enviar Bytes a servidor
        DatagramPacket DpSend = new DatagramPacket(datos, datos.length, ip, port);
        ds.send(DpSend);
        
        byte[] recBytes = new byte[65535];
        DatagramPacket clientePacket = new DatagramPacket(recBytes, recBytes.length);
        ds.receive(clientePacket);
        puertocliente=ds.getLocalPort();
        
        ObjectInputStream iStream = new ObjectInputStream(new ByteArrayInputStream(recBytes)); // convertir Bytes
        ArrayList<Registro> listreg = (ArrayList<Registro>) iStream.readObject();
        iStream.close();

        return listreg;
    }
    
    /**
     * SE ENCARGA DE CONVERTIR LOS OBJETOS/REGISTROS A BYTES
     * @param obj
     * @return
     * @throws IOException 
     */
   
    public byte[] ConvertirObjeto(Object obj) throws IOException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        ObjectOutput oo = new ObjectOutputStream(bStream);
        oo.writeObject(obj);
        oo.close();
        datos = bStream.toByteArray(); 
        return datos;
    }

    public String getIp() {
        return ip.getHostAddress();
    }

    public int getPort() {
        return port;
    }

    public int getPuertocliente() {
        return puertocliente;
    }

   
    
    
}
