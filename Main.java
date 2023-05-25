import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //          Task1
        /*
        Staff staff = new Staff();
        staff.initialize1();
        staff.print1();
        staff.initialize();
        staff.print();

         */

        //Person person = new Person();

        //       Task 2

        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Blowfish();
        animals[2] = new Pigeon();
        animals[3] = new Pigeon("Pidgey", 2, 1.5, "Gray", "Rock Dove");
        

    }
}


//                      Task1

class Person {
    String surname, firstName, street, zipCode, city;

    public void initialize() {          // creating constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surname = sc.nextLine();
        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter street: ");
        street = sc.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = sc.nextLine();
        System.out.print("Enter city: ");
        city = sc.nextLine();
    }

    public void print() {                    // giving information about class
        System.out.println("Surname: " + surname);
        System.out.println("First name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip code: " + zipCode);
        System.out.println("City: " + city);
    }
}



class Staff extends Person {    // new class after inheritance has all variables from father class. We only need to add two additionals
    String education, position;

    public void initialize1() {
        super.initialize();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = sc.nextLine();
        System.out.print("Enter position: ");
        position = sc.nextLine();
    }

    public void print1() {
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

