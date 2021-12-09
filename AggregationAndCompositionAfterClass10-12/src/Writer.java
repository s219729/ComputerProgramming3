public class Writer {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Writer(String name,String surname, int yearOfBirth){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public void display(){
        System.out.println("Name of the writer: " + this.name);
        System.out.println("Surname of the writer: " + this.surname);
        System.out.println("Year of birth of the writer: " + this.yearOfBirth);
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

}
