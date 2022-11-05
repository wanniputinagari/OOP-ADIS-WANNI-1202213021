public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    int phone_number;


    public void setName (String name) {
        this.name = name;
    }

    public void setPhoneNumber (int phone_number) {
        this.phone_number = phone_number;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void succesful() {
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phone_number);
    }

}
