package resume;

public class Contact {
    private String Email;
    private int phoneNumber;

    public Contact(){

    }

    public Contact(String Email, int phoneNumber){
        this.Email = Email;
        this.phoneNumber = phoneNumber;
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


}
