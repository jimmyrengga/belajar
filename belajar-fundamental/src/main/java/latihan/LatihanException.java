package latihan;

public class LatihanException extends Exception{

    public LatihanException() {
    }

    public LatihanException(String string) {
        super(string);
    }

    public LatihanException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public LatihanException(Throwable thrwbl) {
        super(thrwbl);
    }

    public LatihanException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    
    
}
