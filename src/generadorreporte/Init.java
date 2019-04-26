package generadorreporte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Init {
    public static void main(String[] args) throws Exception {
        LectorDeTickets lt = new LectorDeTickets(
                new ConnectionManager()
        );
        
        GrabadorHTML ggg = new GrabadorHTML();
        
        File f = new File("c:\\Tickets\\reporte.html");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(ggg.generarReporte(lt.obtenerTickets()));
        
        bw.close();
        fw.close();  
    
    }
}
