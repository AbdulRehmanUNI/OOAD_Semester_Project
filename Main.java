public class Main {
    public static void main(String[] args) {

        System.out.println("\n================== Zoo 1 ==================\n");
        
        Zoo myZoo = new Zoo();

        
        Animal simba = AnimalFactory.createAnimal("lion", "Simba");
        Animal bruce = AnimalFactory.createAnimal("shark", "Bruce");
        Animal dumbo = AnimalFactory.createAnimal("elephant", "Dumbo");

        
        myZoo.addAnimalToHabitat("Savanna", simba);
        myZoo.addAnimalToHabitat("Savanna", dumbo);
        myZoo.addAnimalToHabitat("Ocean Exhibit", bruce);

        
        myZoo.displayZooInfo();

        myZoo.makeAllAnimalsSound();

        // created a new zoo for our testing
        System.out.println("\n================== Zoo 2 ==================\n");

        Zoo myZoo2 = new Zoo();

        Animal milo = AnimalFactory.createAnimal("lion", "Milo");
        Animal nemo = AnimalFactory.createAnimal("shark", "Nemo");
        Animal polarBear = AnimalFactory.createAnimal("polar bear", "Bhaloo");

        myZoo2.addAnimalToHabitat("Savanna", milo);
        myZoo2.addAnimalToHabitat("Ocean Exhibit", nemo);
        myZoo2.addAnimalToHabitat("Polar Bear Enclosure", polarBear);

        myZoo2.displayZooInfo();

        myZoo2.makeAllAnimalsSound();
        
    }// main
}// class
