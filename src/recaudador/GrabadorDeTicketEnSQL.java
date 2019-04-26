package recaudador;

import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrabadorDeTicketEnSQL implements GrabadorDeTicket {

    public void grabar(Ticket ticket) {
        ConnectionManager connMan = new ConnectionManager();
        
        StringBuilder strbld = new StringBuilder()
                .append("INSERT INTO actas(id, multa, patente, tipoVehiculo, velocidadMedida) ")
                .append("VALUES (")
                .append("'" + ticket.id + "',")
                .append(ticket.multa)
                .append(" ,'" + ticket.datosvehiculo.patente + "', ")
                .append("'" + ticket.datosvehiculo.tipoVehiculo.toString() + "', ")
                .append(ticket.datosvehiculo.velocidadMedida)
                .append(");");
        
        try {
            Connection conn = connMan.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(strbld.toString());
            System.out.println(strbld.toString());
            stmt.close();
            conn.close();
        }
        catch (Exception ex) {
            System.out.println("No se pudo grabar en la base sql");
        }
    }
    
}
