public class Werkkracht {
    private String naam;
    private int code;
    private int bsn;




    public String getNaam(){
        return this.naam;

    }
    public Integer getCode(){
        return this.code;

    }
    public Integer getBsn() {
        return this.bsn;
    }
    public boolean checknaamArray(String naam){
        return false;
    }
    public boolean checkbsn(int bsn){
        return false;
    }
    public boolean checkCodeRegel(int code){
        return false;
    }
}