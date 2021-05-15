package TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import LOGICA.Registro;

public class Cliente {

    private Socket s;
    private final int puerto = 5056;
    private ObjectOutputStream objout;
    private ObjectInputStream objin;

    /**
     * SE ENCARGA DE CONECTAR EL CLIENTE
     *
     * @throws UnknownHostException
     * @throws IOException
     */
    public void conectar() throws UnknownHostException, IOException {
        InetAddress ip = InetAddress.getLocalHost();
        s = new Socket(ip, puerto);
    }

    /**
     * SE ENCARGA DE DESCONECTAR AL CLIENTE
     *
     * @throws UnknownHostException
     * @throws IOException
     */
    public void desconectar() throws UnknownHostException, IOException {
        s.close();

    }

    /**
     * SE ENCARGA DE ENVIAR LOS REGISTROS Y RECIBIR UNA LISTA PARA PODER MOSTRAR
     * LA EN LA TABLA
     *
     * @param reg
     * @return
     * @throws IOException
     */
    public ArrayList<Registro> iniciar(Registro reg) throws IOException {

        InetAddress ip = InetAddress.getLocalHost();
        s = new Socket(ip, puerto);
        ArrayList<Registro> cts = null;

        try {
            objout = new ObjectOutputStream(s.getOutputStream());
            objout.writeObject(reg);

            objin = new ObjectInputStream(s.getInputStream());
            cts = (ArrayList<Registro>) objin.readObject();

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cts;

    }
}
