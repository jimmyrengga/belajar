package latihan.pertemuan7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pertemuan73 {
    
    public static void main(String[] args) {
        
        try {
            FileWriter fw = null;
            File file = new File("/home/jimmy/latihantulis.txt");
            
            if(!file.exists()) {
                file.createNewFile();
            }  
            
            fw = new FileWriter(file);
            
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Isi dalam file ini ditulis dari class Pertemuan73.java");
            bw.newLine();
            bw.write("\r\n\tbaris 2");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Pertemuan73.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
}
