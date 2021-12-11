// Using inheritance, define an SMS class that derives from the Message class and describes
//// text messages sent from a mobile phone. The class contains the phone number attribute to which the text message is sent.
//// The class constructor allows you to initialize a phone number. The class also includes accessor and mutator methods
//// to modify value of the attribute. Then create and send two mobile messages.



public class SMS extends Message {
    private String phoneNumber;

    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SMS(String message, String phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void send(){
        System.out.println("Text: " + super.getMessage());
        // System.out.println("Text: " + getMessage());     tez mogloby byc
        System.out.println("Send to: " + this.phoneNumber);
    }
}
