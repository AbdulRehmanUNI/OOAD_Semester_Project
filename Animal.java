abstract class Animal {
    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public abstract void makeSound(); // fot polymorphic behavior

    public void displayInfo() {
        System.out.println(this.name + " (" + this.species + ")");
    }

}// class