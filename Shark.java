class Shark extends Animal {
    public Shark(String name) {
        super(name, "Shark");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " remains silent.");
    }
}