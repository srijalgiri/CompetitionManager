public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public String getInitial() {
        return (firstName.charAt(0) + "" + lastName.charAt(0)).toUpperCase();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
