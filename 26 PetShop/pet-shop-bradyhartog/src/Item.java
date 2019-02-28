/**
 * Defines an Item to be checked out at the PetShop.
 */

public class Item {
    public double price;
    public boolean isPet;
    public int quantity;

    /**
     * Constructs an Item object.
     * @param price
     * @param isPet
     * @param quantity
     */
    public Item(double price, boolean isPet, int quantity) {
        this.price = price;
        this.isPet = isPet;
        this.quantity = quantity;
    }
}