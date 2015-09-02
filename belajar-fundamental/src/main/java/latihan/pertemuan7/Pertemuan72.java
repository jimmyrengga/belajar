package latihan.pertemuan7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pertemuan72 {
    
    public static void main(String[] args) {
        
        try {
            File file = new File("/home/jimmy/latihan.txt");
            FileInputStream fis = null;
            
            fis = new FileInputStream(file);
            
            System.out.println("~~~ISI FILE~~~");
            int isi;
            while((isi = fis.read()) != -1) {
                System.out.println((char) isi);
            }          
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pertemuan72.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pertemuan72.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
