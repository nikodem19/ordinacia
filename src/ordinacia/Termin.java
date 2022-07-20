package ordinacia;

import java.time.LocalDateTime;

public class Termin {

    private LocalDateTime cas;
    private final String meno;
    private String robota;

    public Termin(LocalDateTime cas, String meno, String robota) {
        this.meno = meno;
        this.cas = cas;
        this.robota = robota;
    }

    public LocalDateTime getCas() {
        return cas;
    }

    public String getMeno() {
        return meno;
    }

    public String getRobota() {
        return robota;
    }

    
    @Override
    public String toString() {
        return "Objednaný pacient " + meno + " je objednaný na " + robota + " o " + cas;
    }

}
