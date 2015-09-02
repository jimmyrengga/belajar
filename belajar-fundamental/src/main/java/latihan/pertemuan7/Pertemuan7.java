package latihan.pertemuan7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pertemuan7 {

    public static void main(String[] args) {
        
        try {
            BufferedReader br = null;
            
            // Jika ingin membaca sebuah file
            // buffered reader membutuhkan object reader, disini kita menggunakan
            // file reader ()
            // windows bisa menggunakan FileReader("C:/latihan.txt");
            // "\n" "\t"
            br = new BufferedReader(new FileReader("/home/jimmy/latihan.txt"));
            
            String isi;
            System.out.println("___ISI FILE___");
            while((isi = br.readLine()) != null) {
                System.out.println(isi);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pertemuan7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pertemuan7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
