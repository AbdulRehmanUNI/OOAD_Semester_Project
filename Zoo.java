import java.util.*;

class Zoo {
    private List<Habitat> habitats;
    private List<Animal> allAnimals; 

    public Zoo() {
        habitats = new ArrayList<>();
        allAnimals = new ArrayList<>();
        
        habitats.add(HabitatFactory.createHabitat("terrestrial", "Savanna", 35.0, 5000));
        habitats.add(HabitatFactory.createHabitat("aquatic", "Ocean Exhibit", 22.0, 10000));
    }

    public void addAnimalToHabitat(String habitatName, Animal animal) {
        for (Habitat habitat : habitats) {
            if (habitat.getName().equalsIgnoreCase(habitatName)) {
                habitat.addAnimal(animal);
                allAnimals.add(animal);
                return;
            }
        }
        System.out.println("Habitat not found!");
    }

    public void displayZooInfo() {
        System.out.println("Welcome to the Zoo!");
        for (Habitat habitat : this.habitats) {
            habitat.displayInfo();
            System.out.println();
        }
    }

    
    public void makeAllAnimalsSound() {
        System.out.println("All animals are making sounds:");
        for (Animal animal : this.allAnimals) {
            animal.makeSound();
        }
    }
}