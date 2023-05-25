public class Blowfish extends Fish {
    public Blowfish() {
        super();
    }

    public Blowfish(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Blowfish(String name, int age, double weight, String voice) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("The Blowfish is eating plankton.");
    }

    @Override
    public String getVoice() {
        return "OOO";
    }

    public void swim() {
        System.out.println("The Blowfish is swimming.");
    }



}
