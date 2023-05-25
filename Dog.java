public class Dog extends Mammal {
    public Dog() {
        super();
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog(String name, int age, double weight, String voice) {
        super(name, age, weight);
    }



    @Override
    public void eat() {
        System.out.println("The dog is eating meat.");
    }

    @Override
    public String getVoice() {
        return "Woof";
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}
