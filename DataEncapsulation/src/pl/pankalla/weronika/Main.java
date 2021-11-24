// 1.	Find an image of a driving license on the Internet. Take a look at what information the driving
// license contains. Then define the DrivingLicense class, containing the following attributes:
// driver's name and surname, address, postal code, city, driving license number, year of issue
// and driving license category. Use private access modifiers when declaring attributes.
// Then create a driving license and try to assign values to the attributes. What message are you getting?
// After that, change the access modifiers from private to public and try to assign values once again.
//2.	Complete the DrivingLicense class. Define a method that displays the driving license
// (all data contained on the driving license). Try to display the data in an attractive form.
// What access modifier will you apply to the defined method?
//Getters and Setters
//3.	Apply the private access modifier to all attributes of the DriverLicense class.
// Then create the get and set methods for each of the attributes.
// After that, modify the program and the method displaying the driving license.
// Replace attributes names with get and set methods.
// 8.	Add a toString() method in the DrivingLicense class to return driving license information.
// Use getter methods to get the driving license data. Then check the method in action.
//9.	In the DrivingLicense class, modify the setter method for the year of issue attribute.
// The valid value of the attribute should be greater than or equal to 1980 and less than or equal to the current year.
// If the given value is different, do not change the attribute.
//10.	Modify the setName() method in the DrivingLicense. Regardless of the given name value,
// the value of the attribute should begin with a capital letter. Replace the remaining letters with lowercase.
// Then check the method in action. Tip. Use the methods available in the String class.


package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
	DrivingLicense drivingLicense = new DrivingLicense();
	drivingLicense.setName("weronika");
	drivingLicense.setSurname("Pankalla");
	drivingLicense.setAddress("Ułanów");
	drivingLicense.setPostalCode("31-450");
	drivingLicense.setCity("Krakow");
	drivingLicense.setDrivingLicenseNumber("123243546453");
	drivingLicense.setYearOfIssue(2016);
	drivingLicense.setCategory("B");

	drivingLicense.displayAllInfo();

		System.out.println(drivingLicense);


    }
}
