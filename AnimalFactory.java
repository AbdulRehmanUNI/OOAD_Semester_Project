

class AnimalFactory {
    public static Animal createAnimal(String type, String name) {
        if (type.equalsIgnoreCase("lion")) {
            return new Lion(name);
        } else if (type.equalsIgnoreCase("shark")) {
            return new Shark(name);
        } else if (type.equalsIgnoreCase("elephant")) {
            return new Elephant(name);
        } else {
            throw new IllegalArgumentException("Invalid animal type: " + type);
        }
    }
}
