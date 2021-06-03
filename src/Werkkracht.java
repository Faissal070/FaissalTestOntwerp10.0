import java.util.ArrayList;

public class Werkkracht {
    private String naam;
    private int code;
    private int bsn;
    public static ArrayList<Werkkracht> personen = new ArrayList<>();

    Werkkracht(){

    }

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
    public boolean checkReceptiemedewerker(boolean codereceptie) {
        return true;

    }

    public boolean checkDoktersAssistend(boolean codeDoktersassistent){
        return true;
    }
    public boolean checkDokter(boolean codeDokter){
        return true;
    }
}
