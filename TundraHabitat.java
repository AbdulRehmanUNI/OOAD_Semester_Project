class TundraHabitat extends Habitat {
    public TundraHabitat(String name, double temperature, double area) {
        super(name, temperature, area);
    }

    @Override
    public void describeHabitat() {
        System.out.println("This is a Tundra habitat suitable for Arctic animals.");
    }
}