//10.	Using inheritance, define an Email class that derives from the Message class and describes messages sent
// using email. The class includes the following attributes: message subject and recipient's address.
// The class also includes accessor and mutator methods for class attributes.
// Add a constructor that allows you to create an email with the given subject and content that
// is sent to the given email address. Then create and send two emails.


public class Email extends Message {
    private String subject;
    private String address;

    public Email(String subject, String address) {
        this.subject = subject;
        this.address = address;
    }

    public Email(String message, String subject, String address) {
        super(message);
        this.subject = subject;
        this.address = address;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void send() {
        System.out.println("Subject of email: " + this.subject);
        System.out.println("Address: " + this.address);

    }

}
