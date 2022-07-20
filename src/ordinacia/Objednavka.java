package ordinacia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Objednavka implements Objednavanie {

    private final List<Termin> zoznamObjednavok = new ArrayList();

    public Objednavka() {
    }

    public void pridajTermin(LocalDateTime cas, String meno, String robota) {
        zoznamObjednavok.add(new Termin(cas, meno, robota));
    }

    @Override
    public List nasledujuceObjednavky(LocalDateTime odKedy) {
        List<Termin> vytriedeneTerminy = new ArrayList();
        for (Termin termin : zoznamObjednavok) {
            if (termin.getCas().compareTo(odKedy) >= 1) {
                vytriedeneTerminy.add(termin);
            }
        }
        return vytriedeneTerminy;
    }
    
    @Override
    public List podlaRoboty(String praca) {
        List<Termin> vytriedeneTerminyPodlaRoboty = new ArrayList();
        for (Termin termin : zoznamObjednavok) {
            if (termin.getRobota().equals(praca)) {
                vytriedeneTerminyPodlaRoboty.add(termin);
            }
        }
        return vytriedeneTerminyPodlaRoboty;
    }
    public List podlaMena(String meno) {
        List<Termin> vytriedeneTerminyPodlaMena = new ArrayList();
        for (Termin termin : zoznamObjednavok) {
            if (termin.getMeno().equals(meno)) {
                vytriedeneTerminyPodlaMena.add(termin);
            }
        }
        return vytriedeneTerminyPodlaMena;
    }
}
