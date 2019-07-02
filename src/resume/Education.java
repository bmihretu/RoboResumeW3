package resume;

public class Education {
        private String University;
        private String Major;
        private int Date;
        private String Degree;

    public Education(){

    }

    public Education(String University, String Major, int Date, String Degree){
        this.University = University;
        this.Major = Major;
        this.Date = Date;
        this.Degree = Degree;
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

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;

    }
    public String toString() {

        return this.getDegree() + " in " + this.getMajor() + ",\n" + this.getUniversity() + ", " + this.getDate();

    }

}// end cls



