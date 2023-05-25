import java.util.Scanner;

//          1st task
/*
class RectangleArea {
    Float length, breadth;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextFloat();
    }

    public Float computeField() {
        return length * breadth;
    }

    public void fieldDisplay() {
        System.out.println("The area of the rectangle is: " + computeField());
    }
}

public class Main {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.fieldDisplay();
    }
}


 */



//     2nd task
/*
class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(int quantity) {
        this.quantity += quantity;
    }

    public void sell(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Model: " + model + "\nBrand: " + brand + "\nYear: " + year + "\nPrice: " + price + "\nColor: " + color + "\nQuantity: " + quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Car Mercedes_S = new Car("S class", "Mercedes", 2023, 120000, "Silver", 7);
        System.out.println(Mercedes_S.toString());

        Mercedes_S.sell(5);
        System.out.println("After selling 2 cars:");
        System.out.println("Quantity: " + Mercedes_S.getQuantity());

        Mercedes_S.setColor("Black");
        Mercedes_S.setPrice(150000);
        System.out.println("After changing color and price:");
        System.out.println(Mercedes_S.toString());
    }
}

 */


