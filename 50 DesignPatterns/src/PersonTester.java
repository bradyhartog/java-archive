public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Sally", "J", "Jones", 17, "123 S Main", "#4B", "My City", "Utah", "84123-3344", null);
        Person person2 = new Person("Bill", null, "Jensen", 22, "5050 S State Street", null, "Murray", "Utah", "84123-334", "car wash");

        Person sally = PersonBuilder.create()
                .withFirstName("Sally")
                .withMiddleName("J")
                .withLastName("Jones")
                .withAge(17)
                .withAddressLine1("123 S Main")
                .withAddressLine2("#4B")
                .livesInCity("My City")
                .livesInState("Utah")
                .withZip("84123-3344").build();
    }
}