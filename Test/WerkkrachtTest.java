import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerkkrachtTest {

    @Test
    void checkPerson(){
        Werkkracht persoon = new Werkkracht();

        String naam = "Faissal";
        int code = 43233;
        int bsn = 98763235;
        Assertions.assertEquals(false , persoon.checknaamArray(naam)); // naam
        // is niet opgeslagen dus false klopt
        Assertions.assertEquals(false, persoon.checkCodeRegel(code)); // false want code bevat meer dan 4 cijfers
        Assertions.assertEquals(false, persoon.checkbsn(bsn)); // false want bsn < 9
        //Nog geen code in de methode
        //TDD

    }


}