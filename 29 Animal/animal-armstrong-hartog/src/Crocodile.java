public class Crocodile extends Reptile {

    public Crocodile(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }

    @Override
    public String eat() {
        return "devouring prey";
    }

    @Override
    public String move() {
        return "stomping";
    }

    @Override
    public String poop() {
        return "in the river";
    }

    @Override
    public String breathe() {
        return "lungs";
    }
}