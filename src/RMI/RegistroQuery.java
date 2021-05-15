package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import BD.BD;
import LOGICA.Registro;

public class RegistroQuery extends UnicastRemoteObject implements RegistroInterface {

    private final BD datos;

    RegistroQuery() throws RemoteException {
        super();
        this.datos = new BD();
    }

    @Override
    public ArrayList<Registro> query(Registro reg) throws RemoteException {

        // guardar loen base de datos
        datos.AgregarInfo(reg.getNomnbre(), reg.getApellido(), reg.getCarrera(),reg.getCodigo(),reg.getSala());
        
        return datos.ListarRegistros();
    }

}
