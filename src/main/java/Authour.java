public class Authour {
    private int Authourid ;
   private String FirstName ;
    private String  LastName;
   private String age ;

    public Authour(String firstName, String lastName, String age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public Authour(int authourid, String firstName, String lastName, String age) {
        Authourid = authourid;
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

    public String getLastName() {
        return LastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }



    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Authour(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Authour{" +
                "Authourid=" + Authourid +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
