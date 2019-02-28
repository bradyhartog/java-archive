public class AnimalTester {
    public static void main(String[] args) {
        Cheetah myCheetah = new Cheetah("Acinonyx jubatus", true,false, true);
        Whale myWhale = new Whale("Balaenoptera musculus", false, false, false);
        Snake mySnake = new Snake("Python regius", true, false, true);
        Crocodile myCroc = new Crocodile("Crocodylus acutus", true, true, true);

        Animal[] animals = {myCheetah, myWhale, mySnake, myCroc};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getSpecies());
            System.out.println("Eats by:       " + animals[i].eat());
            System.out.println("Moves by:      " + animals[i].move());
            System.out.println("Poops:         " + animals[i].poop());
            System.out.println("Breathes with: " + animals[i].breathe());
            System.out.println();
        }
    }
}