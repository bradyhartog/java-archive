public class Snake extends Reptile {

    public Snake(String species, boolean living, boolean awake, boolean hungry) {
        super(species, living, awake, hungry);
    }

    @Override
    public String eat() {
        return "swallowing prey whole";
    }

    @Override
    public String move() {
        return "slithering";
    }

    @Override
    public String poop() {
        return "anywhere";
    }

    @Override
    public String breathe() {
        return "lungs";
    }
}