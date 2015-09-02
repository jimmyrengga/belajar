package latihan.pertemuan7;

public class Pertemuan74 {

    public static void main(String[] args) {
        // error code
        // Integer tes = "a";
        
        // contoh dari Exception
        // Object Makhluk masih null tapi sudah di panggil propertynya (lihat baris 18)
        Makhluk manusia = null;
//        manusia.setJmlKaki(2);
//        manusia.setJmlGigi(32);
//        manusia.setBerbulu(false);
        
//        if(manusia != null) {
        try{
            System.out.println("apakah manusia berbulu ?" + manusia.getBerbulu());
        }catch(NullPointerException npe) {
            System.out.println("null bos");
        }
//        } else {
//            System.out.println("object masih null");
//        }
        
        // ketika menambahkan baris 32 akan terjadi array index out of bounds
        // cara menanganinya adalah pakai blok baris 35-41
        Integer[] angka = new Integer[3];
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
//        angka[3] = 4;
        
        
        if(angka.length > 3) {
            angka[3] = 4;
            angka[4] = 5;
        } else {
            System.out.println("panjang array hanya 3, jangan dilebihin");
        }
        
        System.out.println("angka ke 5 " + angka[2]);
    }
    
}
