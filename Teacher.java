package inheritance;

public class Teacher extends Person {
    String qualification;

    // Constructor to initialize Teacher's qualification
    public Teacher(String name, int age, String qualification) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
    }

    // Method to display Teacher's information
    void displayInformation() {
        super.displayInformation(); // Calling Person's displayInformation()
        System.out.println("Qualification: " + qualification);
    }
}
