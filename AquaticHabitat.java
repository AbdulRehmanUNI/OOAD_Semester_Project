class AquaticHabitat extends Habitat {
    public AquaticHabitat(String name, double temperature, double area) {
        super(name, temperature, area);
    }

    @Override
    public void describeHabitat() {
        System.out.println("This is an aquatic habitat suitable for water animals.");
    }
}