class HabitatFactory {
    public static Habitat createHabitat(String type, String name, double temperature, double area) {
        if (type.equalsIgnoreCase("terrestrial")) {
            return new TerrestrialHabitat(name, temperature, area);
        } else if (type.equalsIgnoreCase("aquatic")) {
            return new AquaticHabitat(name, temperature, area);
        }else if(type.equalsIgnoreCase("tundra")){ // added our own for testing
            return new TundraHabitat(name, temperature, area);
        } else {
            throw new IllegalArgumentException("Invalid habitat type: " + type);
        }
    }
}