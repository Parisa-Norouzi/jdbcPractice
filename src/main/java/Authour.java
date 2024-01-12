public class Authour {
    private int Authourid ;
   private String FirstName ;
    private String  LastName;
   private int age ;

    public Authour() {

    }

    public Authour(int authourid, String firstName, String lastName, int age) {
        Authourid = authourid;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public Authour(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }



    public int getAuthourid() {
        return Authourid;
    }

    public void setAuthourid(int authourid) {
        Authourid = authourid;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "authour{" +
                "Authourid=" + Authourid +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
