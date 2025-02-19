public class Main {
    public static void main(String[] args) {
        
        // Zoo myZoo = new Zoo();

        
        // Animal simba = AnimalFactory.createAnimal("lion", "Simba");
        // Animal bruce = AnimalFactory.createAnimal("shark", "Bruce");
        // Animal dumbo = AnimalFactory.createAnimal("elephant", "Dumbo");

        
        // myZoo.addAnimalToHabitat("Savanna", simba);
        // myZoo.addAnimalToHabitat("Savanna", dumbo);
        // myZoo.addAnimalToHabitat("Ocean Exhibit", bruce);

        
        // myZoo.displayZooInfo();

        // myZoo.makeAllAnimalsSound();

        Zoo myZoo2 = new Zoo();

        Animal milo = AnimalFactory.createAnimal("lion", "Milo");
        Animal nemo = AnimalFactory.createAnimal("shark", "Nemo");


        myZoo2.addAnimalToHabitat("Savanna", milo);
        myZoo2.addAnimalToHabitat("Ocean Exhibit", nemo);

        myZoo2.displayZooInfo();

        myZoo2.makeAllAnimalsSound();


        System.gc();
    }
}
