package ordinacia;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Interface obsahuje metódy na zobrazenie objednávok
 */
public interface Objednavanie {
    
    /**
     * Vypíše objednávky od určitého času
     * @param odKedy dátum v objekte LocalDateTime
     * @return čo vracia
     */
    List nasledujuceObjednavky(LocalDateTime odKedy);
    
    /**
     *
     * @param praca
     * @return
     */
    List podlaRoboty(String praca);
    
    /**
     *
     * @param meno
     * @return
     */
    List podlaMena(String meno);
}
