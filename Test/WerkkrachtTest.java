import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerkkrachtTest {

    @Test
    void checkPerson() {
        Werkkracht persoon = new Werkkracht("S",9876543,8765);

        String naam = "Faissal";
        int code = 43233;
        int bsn = 98763235;
        Assertions.assertEquals(false, persoon.checknaamArray()); // naam
        // is niet opgeslagen dus false klopt
        Assertions.assertEquals(false, persoon.checkCodeRegel()); // false want code bevat meer dan 4 cijfers
        Assertions.assertEquals(false, persoon.checkbsn()); // false want bsn < 9
        //Nog geen code in de methode
        //TDD

    }

    @Test
    void ModifiedDecisionCoverage() {
        Werkkracht person = new Werkkracht("Fais", 987877976, 1987);
        Werkkracht.personen.add(person);

        Assertions.assertEquals("Je staat in ons systeem", person.checknaamArray());
        Assertions.assertEquals("Je bsn klopt geweldig!", person.checkbsn());
        Assertions.assertEquals("Je code klopt", person.checkCodeRegel());
        //Condition coverage/Decision 1-1-1

        Werkkracht person2 = new Werkkracht("Chantal", 987654568, 98765);
        Assertions.assertEquals("Sorry je staat niet in ons systeem", person2.checknaamArray());
        Assertions.assertEquals("Je bsn klopt geweldig!", person2.checkbsn());
        Assertions.assertEquals("Je code klopt niet", person2.checkCodeRegel());
        // 0-1-0

        Werkkracht person3 = new Werkkracht("Mohammed", 87654, 9876);
        Werkkracht.personen.add(person3);

        Assertions.assertEquals("Je staat in ons systeem", person3.checknaamArray());
        Assertions.assertEquals("Sorry je bsn nummer klopt niet", person3.checkbsn());
        Assertions.assertEquals("Je code klopt", person3.checkCodeRegel());
        // 1-0-1

        Werkkracht person4 = new Werkkracht("Lisa", 9876654, 9872);
        Assertions.assertEquals("Sorry je staat niet in ons systeem", person4.checknaamArray());
        Assertions.assertEquals("Sorry je bsn nummer klopt niet", person4.checkbsn());
        Assertions.assertEquals("Je code klopt", person4.checkCodeRegel());
        // 0-0-1


    }
}