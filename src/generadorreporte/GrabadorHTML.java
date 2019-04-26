package generadorreporte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import recaudador.Ticket;

public class GrabadorHTML {
    public String generarReporte(List<Registro> listaTickets) throws FileNotFoundException, IOException {
        StringBuilder htmlOut = new StringBuilder();
        String linea = "";
        
        htmlOut.append("<html>");
        htmlOut.append("<head>");
        htmlOut.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
        htmlOut.append("</head>");
        htmlOut.append("<body>");
        htmlOut.append("<div class=\"jumbotron\">");
        htmlOut.append("<h1>Reporte de actas de transito - clase 10</h1>");
        htmlOut.append("</div>");
        htmlOut.append("<table class=\"table\">");
        htmlOut.append("<thead>");
        htmlOut.append("<th>Patente</th>");
        htmlOut.append("<th>Tipo de vehiculo</th>");
        htmlOut.append("<th>Velocidad medida</th>");
        htmlOut.append("<th>Importe multa</th>");
        htmlOut.append("</thead>");
        htmlOut.append("<tbody>");
            
        for(Registro e:listaTickets) {
            htmlOut.append("<tr><td>" + e.getId() + "</td>"
                    + "<td>" + e.getMulta() + "</td>"
                    + "<td>" + e.getPatente() + "</td>"
                    + "<td>" + e.getTipoVehiculo() + "</td>"
                    + "<td>" + e.getVelocidadMedida() + "</td></tr>");
            htmlOut.append(linea);
        }
        htmlOut.append("</tbody>");
        htmlOut.append("</table>");
        htmlOut.append("</body>");
        htmlOut.append("</html>");
        return htmlOut.toString();
    }
}
