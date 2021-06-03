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
//    @Test
//    void EquavalentieklassenRandwaarden(){
//        Werkkracht functie = new Werkkracht();
//        int code = 2098;
//        boolean receptiemedewerker = code > 2000;
//        Assertions.assertEquals(true, functie.checkReceptiemedewerker(receptiemedewerker));
//
//        Werkkracht functie3 = new Werkkracht();
//        int code3 = 1900;
//        boolean receptiemedewerker3 = code > 2000;
//        Assertions.assertEquals(false, functie.checkReceptiemedewerker(receptiemedewerker));
//        //foutmelding omdat code niet gemaakt is. Andere tests werken gewoon omdat true verwacht word in methode.
//
//        Werkkracht functie1 = new Werkkracht();
//        int code1 = 3098;
//        boolean doktersAssistent = code > 3000;
//        Assertions.assertEquals(true, functie.checkDoktersAssistend(doktersAssistent));
//
//        Werkkracht functie2 = new Werkkracht();
//        int code2 = 4098;
//        boolean dokter = code > 3000;
//        Assertions.assertEquals(true, functie.checkDokter(dokter));



    @Test
    void Equavalentie() {
        Werkkracht persoonA = new Werkkracht("Ismail", 765432456, 1160);
        Assertions.assertEquals(true, persoonA.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonA.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonA.checkDokter());

        Werkkracht persoonB = new Werkkracht("Jaap", 765432456, 1500);
        Assertions.assertEquals(true, persoonB.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonB.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonB.checkDokter());

        Werkkracht persoonC = new Werkkracht("Jaap", 765432456, 1900);
        Assertions.assertEquals(true, persoonC.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonC.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonC.checkDokter());

        Werkkracht persoonD = new Werkkracht("Jaap", 765432456, 2100);
        Assertions.assertEquals(false, persoonD.checkReceptiemedewerker());
        Assertions.assertEquals(true, persoonD.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonD.checkDokter());

        Werkkracht persoonE = new Werkkracht("Jaap", 765439456, 2500);
        Assertions.assertEquals(false, persoonE.checkReceptiemedewerker());
        Assertions.assertEquals(true, persoonE.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonE.checkDokter());

        Werkkracht persoonF = new Werkkracht("Jaap", 765434456, 2800);
        Assertions.assertEquals(false, persoonF.checkReceptiemedewerker());
        Assertions.assertEquals(true, persoonF.checkDoktersAssistend());
        Assertions.assertEquals(false, persoonF.checkDokter());

        Werkkracht persoonG = new Werkkracht("Jaap", 765433456, 3100);
        Assertions.assertEquals(false, persoonG.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonG.checkDoktersAssistend());
        Assertions.assertEquals(true, persoonG.checkDokter());

        Werkkracht persoonH = new Werkkracht("Jaap", 765431456, 3400);
        Assertions.assertEquals(false, persoonH.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonH.checkDoktersAssistend());
        Assertions.assertEquals(true, persoonH.checkDokter());

        Werkkracht persoonI = new Werkkracht("Jaap", 765432456, 3800);
        Assertions.assertEquals(false, persoonI.checkReceptiemedewerker());
        Assertions.assertEquals(false, persoonI.checkDoktersAssistend());
        Assertions.assertEquals(true, persoonI.checkDokter());
    }
    @Test
    void CheckMedewerker() {
//        Werkkracht Dokter1  = new Werkkracht("ismail",676767678,3100);
  //      Werkkracht Dokter2 = new Werkkracht("Sabon", 87654, 33543);
   //     Werkkracht.personen.add(Dokter2);
//        assertEquals("Geweigerd!", Dokter1.CheckmedewerkerToegang(Dokter1.getNaam(),Dokter1.getCode(),Dokter1.getBsn(),Dokter1.checkDokter()));
   //     assertEquals("Ingelogd!", Dokter2.CheckmedewerkerToegang(Dokter2.getNaam(), Dokter2.getCode(), Dokter2.getBsn(), Dokter2.checkDokter()));
//
//
//        Werkkracht Dokterassistent1 = new Werkkracht("ismaile",676767678,22050);
//        Werkkracht Dokterassistent2 = new Werkkracht("Chantal", 989076547, 2789);
//        assertEquals("Geweigerd!", Dokterassistent1.CheckmedewerkerToegang(Dokterassistent1.getNaam(),Dokterassistent1.getCode(),Dokterassistent1.getBsn(),Dokterassistent1.checkDokter()));
//        assertEquals("Ingelogd!", Dokterassistent2.CheckmedewerkerToegang(Dokterassistent2.getNaam(),Dokterassistent2.getCode(),Dokterassistent2.getBsn(),Dokterassistent2.checkDokter()));
//
//        Werkkracht Receptiemedewerker1 = new Werkkracht("Lisa", 65642, 987892);
//        Werkkracht Receptiemedewerker2 = new Werkkracht("Diderik", 156789768, 1567);
//        Werkkracht.personen.add(Receptiemedewerker2);
//        assertEquals("Geweigerd!", Receptiemedewerker1.CheckmedewerkerToegang(Receptiemedewerker1.getNaam(),Receptiemedewerker1.getCode(),Receptiemedewerker1.getBsn(),Receptiemedewerker1.checkDokter()));
//        assertEquals("Ingelogd!", Receptiemedewerker2.CheckmedewerkerToegang(Receptiemedewerker2.getNaam(),Receptiemedewerker2.getCode(),Receptiemedewerker2.getBsn(),Receptiemedewerker2.checkDokter()));
//
//
    }
    @Test
    void PairwaiseTest(){
        Werkkracht Doktor1 = new Werkkracht("Chantal",98736,34567);
        Werkkracht Doktor2 = new Werkkracht("Yasin",876543678,3456);
        Werkkracht.personen.add(Doktor2);
        assertEquals("Geweigerd!",Doktor1.CheckmedewerkerToegang(Doktor1.getNaam(),Doktor1.getBsn(),Doktor1.getCode(),Doktor1.checkDokter()));
       assertEquals("Ingelogd!", Doktor2.CheckmedewerkerToegang(Doktor2.getNaam(),Doktor2.getBsn(),Doktor2.getCode(),Doktor2.checkDokter()));

        Werkkracht Dokterassistent1 = new Werkkracht("Pieter",987363423,347);
        Werkkracht Dokterassistent2 = new Werkkracht("Diderik",265784982,2456);
        Werkkracht.personen.add(Dokterassistent2);
        assertEquals("Geweigerd!",Dokterassistent1.CheckmedewerkerToegang(Dokterassistent1.getNaam(),Dokterassistent1.getBsn(),Dokterassistent1.getCode(),Dokterassistent1.checkDokter()));
        assertEquals("Ingelogd!",Dokterassistent2.CheckmedewerkerToegang(Dokterassistent2.getNaam(),Dokterassistent2.getBsn(),Dokterassistent2.getCode(),Dokterassistent2.checkDoktersAssistend()));

        Werkkracht Receptiemedewerker1 = new Werkkracht("Hans",98732,323447);
        Werkkracht Receptiemedewerker2 = new Werkkracht("Nienke",876567562,1234);
        Werkkracht.personen.add(Receptiemedewerker1);
        Werkkracht.personen.add(Receptiemedewerker2);
        assertEquals("Geweigerd!",Receptiemedewerker1.CheckmedewerkerToegang(Receptiemedewerker1.getNaam(),Receptiemedewerker1.getBsn(),Receptiemedewerker1.getCode(),Receptiemedewerker1.checkReceptiemedewerker()));
        assertEquals("Ingelogd!",Receptiemedewerker2.CheckmedewerkerToegang(Receptiemedewerker2.getNaam(),Receptiemedewerker2.getBsn(),Receptiemedewerker2.getCode(),Receptiemedewerker2.checkReceptiemedewerker()));




    }

}