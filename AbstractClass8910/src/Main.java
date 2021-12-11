// 8.	An abstract Message class describes an abstract message.
// The class contains the text attribute with the message text and accessor and mutator methods for this attribute.
// The parameterless constructor allows you to create a new, empty message, while the overloaded constructor
// with one parameter allows you to create a new message with the given content.
// The class also includes a charNumber() method that returns the number of characters in the message.
// Moreover, the abstract class includes an abstract send() method for sending a message
// (displays message along with its details). Define an abstract class and its attributes and methods.
//9.	Using inheritance, define an SMS class that derives from the Message class and describes
// text messages sent from a mobile phone. The class contains the phone number attribute to which the text message is sent.
// The class constructor allows you to initialize a phone number. The class also includes accessor and mutator methods
// to modify value of the attribute. Then create and send two mobile messages.
//10.	Using inheritance, define an Email class that derives from the Message class and describes messages sent
// using email. The class includes the following attributes: message subject and recipient's address.
// The class also includes accessor and mutator methods for class attributes.
// Add a constructor that allows you to create an email with the given subject and content that
// is sent to the given email address. Then create and send two emails.

// klasa message zawiera 1 atrybut messages, do tego gettersy settersy, dodatkowo metoda charnumber i metoda abstrakcyjna send

public class Main {

    public static void main(String[] args) {
        SMS sms1 = new SMS("Hello, here is my first SMS to you!","506280922");
        sms1.send();


        SMS sms2 = new SMS("Hi, this is my sec message, why you don't answer?","506280922");
        sms2.send();

        Email email1 = new Email("GJHKJK", "VJHKJ");
        email1.send();


    }
}
