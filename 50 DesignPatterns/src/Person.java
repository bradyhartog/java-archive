public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zip;
    private String job;

    public Person(String firstName, String middleName, String lastName, int age, String addressLine1, String addressLine2, String city, String state, String zip, String job) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.job = job;
    }
}