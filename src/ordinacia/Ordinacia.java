package ordinacia;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class Ordinacia {

    
    public static void main(String[] args) {
        Objednavka Obj = new Objednavka();
        Obj.pridajTermin(LocalDateTime.of(2018, Month.APRIL, 8, 12, 30), "Priezvisko1", "Preventívka");
        Obj.pridajTermin(LocalDateTime.of(2018, Month.APRIL, 8, 13, 30), "Priezvisko2", "Vrtanie");
        Obj.pridajTermin(LocalDateTime.of(2018, Month.APRIL, 8, 15, 30), "Priezvisko3", "Vrtanie");
        
        
        List<Termin> nasledujuceObjednavky = Obj.nasledujuceObjednavky(LocalDateTime.of(2018, Month.APRIL, 8, 13, 0));
        for (Termin termin : nasledujuceObjednavky) {
            System.out.println(termin.toString());
        }
        /***/
        List<Termin> podlaRoboty = Obj.podlaRoboty("Preventívka");
        for (Termin termin : podlaRoboty) {
            System.out.println(termin.toString());
        }
        List<Termin> podlaMena = Obj.podlaMena("Priezvisko3");
        for (Termin termin : podlaMena) {
            System.out.println(termin.toString());
        }
    }
}
