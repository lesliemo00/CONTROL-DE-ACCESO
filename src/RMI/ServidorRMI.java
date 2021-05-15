package RMI;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorRMI {

    RegistroInterface obj;
    String NombreServer = "rmi://localhost:1900" + "/seminario";

    public ServidorRMI() {

        try {
            this.obj = new RegistroQuery();
            LocateRegistry.createRegistry(1900);
            Naming.rebind(NombreServer, obj);

        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNombreServer() {
        return NombreServer;
    }

    public void setNombreServer(String NombreServer) {
        this.NombreServer = NombreServer;
    }

}
