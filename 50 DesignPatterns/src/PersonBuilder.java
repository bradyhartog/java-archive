public class PersonBuilder {
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

    private PersonBuilder() {}

    public static PersonBuilder create() {
        return new PersonBuilder();
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public PersonBuilder withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public PersonBuilder livesInCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder livesInState(String state) {
        this.state = state;
        return this;
    }

    public PersonBuilder withZip(String zip) {
        this.zip = zip;
        return this;
    }

    public PersonBuilder worksAt(String job) {
        this.job = job;
        return this;
    }

    public Person build() {
        return new Person(firstName, middleName, lastName, age, addressLine1, addressLine2, city, state, zip, job);
    }
}