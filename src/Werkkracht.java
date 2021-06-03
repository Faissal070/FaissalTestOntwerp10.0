import java.util.ArrayList;

public class Werkkracht {
    private String naam;
    private int code;
    private int bsn;
    public static ArrayList<Werkkracht> personen = new ArrayList<>();

    Werkkracht (String naam, Integer bsn, Integer code){
        this.naam = naam;
        this.bsn = bsn;
        this.code = code;
    }




    public String getNaam(){
        return this.naam;

    }
    public Integer getCode(){
        return this.code;

    }
    public Integer getBsn() {
        return this.bsn;
    }
    public String checknaamArray(){
        if(personen.contains(this)) {
            return "Je staat in ons systeem";
        }
        return "Sorry je staat niet in ons systeem";

    }
    public String checkbsn() {
        int numDigits = String.valueOf(bsn).length();
        if (numDigits == 9) {
            return "Je bsn klopt geweldig!";
        }
        return "Sorry je bsn nummer klopt niet";
    }
    public String checkCodeRegel(){
        int numDigits = String.valueOf(code).length();
        if(numDigits == 4){
            return "Je code klopt";
        }
        return "Je code klopt niet";

    }
    public boolean checkReceptiemedewerker() {
        if (code > 1000 && code < 2000) {
            return true;

        }
        return false;
    }

    public boolean checkDoktersAssistend () {
        if (code > 2000 && code < 3000) {
            return true;
        }
        return false;
    }
    public boolean checkDokter (){
        if (code > 3000 && code < 4000) {
            return true;
        }
        return false;
    }
    public String CheckmedewerkerToegang(String naam, int code, int bsn, boolean medewerker) {
        int numDigits = String.valueOf(this.code).length();
        int numDigits2 = String.valueOf(this.bsn).length();
        if (personen.contains(this) && numDigits == 4 && numDigits2 == 9 && checkDokter() ==  true || checkDoktersAssistend() == true || checkReceptiemedewerker() == true) {
            return "Ingelogd!";

        }
        return "Geweigerd!";
    }
    }