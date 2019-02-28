public class Cheetah extends Mammal {

    public Cheetah(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }

    @Override
    public String eat() {
        return "devouring prey";
    }

    @Override
    public String move() {
        return "sprinting";
    }

    @Override
    public String poop() {
        return "in tall grass";
    }

    @Override
    public String breathe() {
        return "lungs";
    }
}