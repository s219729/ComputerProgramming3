public class Writer {
    private String name;
    private String surname;
    private int yearOfBirth;
    private String nationality;

    public Writer(String name, String surname, int yearOfBirth, String nationality)
    {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.nationality = nationality;
    }

    public String getName(){
        return this.name;
    }

    public void writeBook () {

    }

    public String introduce(){
        return this.name;
    }

    public String toString(){
        return("Name: " + name + ", surname: " + surname + " , year of birth: " + yearOfBirth + " , nationality: " + nationality);
    }

}
