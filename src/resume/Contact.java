package resume;

public class Contact {
    private String Name;
    private String Email;
    private int phoneNumber;

    public Contact() {

    }

    public Contact(String Email, int phoneNumber, String Name) {
        this.Email = Email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {

        return "Personal Info\n======================================\n" + this.getName() + "\n" + this.getEmail() + "\n" + this.getPhoneNumber();

    }

}//end cls
