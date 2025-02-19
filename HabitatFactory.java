class HabitatFactory {
    public static Habitat createHabitat(String type, String name, double temperature, double area) {
        if (type.equalsIgnoreCase("terrestrial")) {
            return new TerrestrialHabitat(name, temperature, area);
        } else if (type.equalsIgnoreCase("aquatic")) {
            return new AquaticHabitat(name, temperature, area);
        }else if(type.equalsIgnoreCase("tundra")){
            return new TundraHabitat(name, temperature, area);
        } else {
            throw new IllegalArgumentException("Invalid habitat type: " + type);
        }
    }
}