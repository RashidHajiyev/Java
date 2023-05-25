public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight);
        this.species = species;
    }

    public Pigeon(String name, int age, double weight, String species) {
        super(name, age, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void fly() {
        System.out.println("Pigeon is flying.");;
    }

    @Override
    public String getVoice() {
        return "qa qa qa";
    }

    @Override
    public void eat() {
        System.out.println("The pigeon is eating ants.");
    }

    public String toString() {
        return "Species: " + species;
    }
}
