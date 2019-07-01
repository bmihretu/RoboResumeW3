package resume;

public class Skills {
    private String Expert = "";
    private String Advanced = "";
    private String Intermediate ="";
    private String Novice = "";
    private String Fundamental = "";

    public Skills(){

        }


    public Skills(String Expert, String Advanced, String Intermediate, String Novice, String Fundamental){
        this.Expert = Expert;
        this.Advanced = Advanced;
        this.Intermediate = Intermediate;
        this.Novice = Novice;
        this.Fundamental = Fundamental;

    }

    public String getExpert() {
        return Expert;
    }

    public void setExpert(String expert) {
        Expert = expert;
    }

    public String getAdvanced() {
        return Advanced;
    }

    public void setAdvanced(String advanced) {
        Advanced = advanced;
    }

    public String getIntermediate() {
        return Intermediate;
    }

    public void setIntermediate(String intermediate) {
        Intermediate = intermediate;
    }

    public String getNovice() {
        return Novice;
    }

    public void setNovice(String novice) {
        Novice = novice;
    }

    public String getFundamental() {
        return Fundamental;
    }

    public void setFundamental(String fundamental) {
        Fundamental = fundamental;
    }
}

