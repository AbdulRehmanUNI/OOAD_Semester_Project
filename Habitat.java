import java.util.*;

abstract class Habitat {
    protected String name;
    protected double temperature;
    protected double area;
    protected List<Animal> animals; // association implementation

    public Habitat(String name, double temperature, double area) {
        this.name = name;
        this.temperature = temperature;
        this.area = area;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        this.animals.add(a);
    }

    public String getName() {
        return this.name;
    }

    public abstract void describeHabitat();

    public void displayInfo() {
        System.out.println("Habitat: " + name + " | Temperature: " + temperature + "°C | Area: " + area + " sq. meters");
        this.describeHabitat();
        this.displayAnimals();
    }

    public void displayAnimals() {
        System.out.println("Animals in " + name + ":");
        for (Animal a : this.animals) {
            a.displayInfo();
        }// for
    }
}// class