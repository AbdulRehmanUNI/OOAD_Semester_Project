public class PolarBear extends Animal{
    
    public PolarBear(String name) {
        super(name, "Bear");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " gurrrs!");
    }
}
