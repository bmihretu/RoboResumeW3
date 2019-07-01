package resume;

public class Experience {
    private String Company = "";
    private String Position = "";
    private String Date = "";
    private String Description ="";

    public Experience(){

    }

    public Experience(String company, String position, String date, String Description){
        this.Company = company;
        this.Position = position;
        this.Date = Date;
        this.Description = Description;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
