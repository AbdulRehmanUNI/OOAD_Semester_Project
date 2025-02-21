import java.util.*;

class Zoo {
    private List<Habitat> habitats;
    private List<Animal> allAnimals; 

    public Zoo() {
        habitats = new ArrayList<>();
        allAnimals = new ArrayList<>();  // List to store all animals for polymorphic behavior
        
        // composition implementation
        habitats.add(HabitatFactory.createHabitat("terrestrial", "Savanna", 35.0, 5000));
        habitats.add(HabitatFactory.createHabitat("aquatic", "Ocean Exhibit", 22.0, 10000));
        habitats.add(HabitatFactory.createHabitat("tundra", "Polar Bear Enclosure", -10.0, 2000)); // added our own for testing
    }

    public void addAnimalToHabitat(String habitatName, Animal animal) {
        for (Habitat habitat : habitats) {
            if (habitat.getName().equalsIgnoreCase(habitatName)) {
                habitat.addAnimal(animal);
                allAnimals.add(animal);
                return;
            }// if
        }// for
        System.out.println("Habitat not found!");
    }

    public void displayZooInfo() {
        System.out.println("Welcome to the Zoo!");
        for (Habitat habitat : this.habitats) {
            habitat.displayInfo();
            System.out.println();
        }
    }

     // Demonstrate polymorphic behavior
    public void makeAllAnimalsSound() {
        System.out.println("All animals are making sounds:");
        for (Animal animal : this.allAnimals) {
            animal.makeSound();
        }// for
    }
}// class