// // 1.	Find an image of a driving license on the Internet. Take a look at what information the driving
//// license contains. Then define the DrivingLicense class, containing the following attributes:
//// driver's name and surname, address, postal code, city, driving license number, year of issue
//// and driving license category. Use private access modifiers when declaring attributes.
//// Then create a driving license and try to assign values to the attributes. What message are you getting?
//// After that, change the access modifiers from private to public and try to assign values once again.
////2.	Complete the DrivingLicense class. Define a method that displays the driving license
//// (all data contained on the driving license). Try to display the data in an attractive form.
//// What access modifier will you apply to the defined method?
////Getters and Setters
////3.	Apply the private access modifier to all attributes of the DriverLicense class.
//// Then create the get and set methods for each of the attributes.
//// After that, modify the program and the method displaying the driving license.
//// Replace attributes names with get and set methods.
// 8.	Add a toString() method in the DrivingLicense class to return driving license information.
// Use getter methods to get the driving license data. Then check the method in action.
//9.	In the DrivingLicense class, modify the setter method for the year of issue attribute.
// The valid value of the attribute should be greater than or equal to 1980 and less than or equal to the current year.
// If the given value is different, do not change the attribute.
//10.	Modify the setName() method in the DrivingLicense. Regardless of the given name value,
// the value of the attribute should begin with a capital letter. Replace the remaining letters with lowercase.
// Then check the method in action. Tip. Use the methods available in the String class.



package pl.pankalla.weronika;

public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNumber;
    private int yearOfIssue;
    private String category;

    public void setName(String name){
        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        }

    public String getName(){
        return this.name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public String getPostalCode(){
        return this.postalCode;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setDrivingLicenseNumber(String drivingLicenseNumber){
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
    public String getDrivingLicenseNumber(){
        return this.drivingLicenseNumber;
    }
    public void setYearOfIssue(int yearOfIssue){
        if(yearOfIssue >= 1980 && yearOfIssue <= 2021) {
            this.yearOfIssue = yearOfIssue;
        } else {
            System.out.println("Wrong year of issue!");
        }
    }
    public int getYearOfIssue(){
        return this.yearOfIssue;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }

    public void displayAllInfo(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(address);
        System.out.println(postalCode);
        System.out.println(city);
        System.out.println(drivingLicenseNumber);
        System.out.println(yearOfIssue);
        System.out.println(category);
    }


    public String toString() {
        return "Name: " + getName() + " , surname: " + getSurname() + " , address: " + getAddress() + " , postal code: "
                + getPostalCode() + " , city: " + getCity() + " , driving license number: " + getDrivingLicenseNumber()
                + " , year of issue: " + getYearOfIssue() + " , category: " + getCategory();
    }



}
