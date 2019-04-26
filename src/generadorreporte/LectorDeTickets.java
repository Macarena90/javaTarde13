package generadorreporte;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import recaudador.Ticket;
import sensorvelocidad.DatosVehiculo;

public class LectorDeTickets {
    private ConnectionManager connectionmanager;

    public LectorDeTickets(ConnectionManager connectionmanager) {
        this.connectionmanager = connectionmanager;
    }
    
    public ArrayList<Registro> obtenerTickets() throws Exception {
        ArrayList<Registro> regs = new ArrayList();
        Connection conn = connectionmanager.getConnection();
        Statement stm = conn.createStatement();
        
        ResultSet rs = stm.executeQuery("select * from actas");
        
        for (;rs.next();) {
            Object id = rs.getObject("id");
            Object multa = rs.getObject("multa");
            Object patente = rs.getObject("patente");
            Object tipoVehiculo = rs.getObject("tipoVehiculo");
            Object velocidadMedida = rs.getObject("velocidadMedida");
            
            regs.add(new Registro(id.toString(), multa.toString(), patente.toString(),
                    tipoVehiculo.toString(), velocidadMedida.toString()));
            
        }
        
        rs.close();
        conn.close();
        
        return regs;
    }
}
