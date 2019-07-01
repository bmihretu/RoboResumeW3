package resume;

public class Education {
        private String University;
        private String Major;
        private String Date;

    public Education(){

    }

    public Education(String University, String Major, String Date){
        this.University = University;
        this.Major = Major;
        this.Date = Date;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }





}
