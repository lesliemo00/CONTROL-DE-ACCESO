
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import LOGICA.Registro;

// interface
public interface RegistroInterface extends Remote{
    
    public ArrayList<Registro> query(Registro reg) throws RemoteException;
    
}
