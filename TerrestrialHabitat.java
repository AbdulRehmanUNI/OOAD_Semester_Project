
class TerrestrialHabitat extends Habitat {
    public TerrestrialHabitat(String name, double temperature, double area) {
        super(name, temperature, area);
    }

    @Override
    public void describeHabitat() {
        System.out.println("This is a terrestrial habitat suitable for land animals.");
    }
}