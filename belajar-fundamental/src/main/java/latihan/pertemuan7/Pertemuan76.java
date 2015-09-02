/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pertemuan7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jimmy
 */
public class Pertemuan76 {
    
    public static void main(String[] args) {
        Makhluk m = null;
        try {
            test(m);
        } catch (LatihanException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private static void test(Makhluk m) throws LatihanException {
        if(m == null) {
            throw new LatihanException("Makhluk null");
        }
        
        System.out.println("m " + m.getJmlGigi());
    }
}
