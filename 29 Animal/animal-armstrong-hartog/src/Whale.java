public class Whale extends Mammal {

    public Whale(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }

    @Override
    public String eat() {
        return "inhaling krill";
    }

    @Override
    public String move() {
        return "swimming";
    }

    @Override
    public String poop() {
        return "in the open ocean";
    }

    @Override
    public String breathe() {
        return "blowholes";
    }
}