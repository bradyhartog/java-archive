/**
 * Provides for collecting and processing items for checkout.
 */

import java.util.ArrayList;

public class Invoice {
    ArrayList<Item> invoice = new ArrayList<>();

    /**
     * Constructs an Invoice object.
     */
    public Invoice() {}

    /**
     * Adds an item to the invoice.
     * @param item
     */
    public void add(Item item) {
        invoice.add(item);
    }

    /**
     * Calculates the total price of the items.
     * @return the total amount owed
     */
    public double getTotalAmnt() {
        double totalAmnt = 0;
        for (int i = 0; i < invoice.size(); i++) {
            totalAmnt = totalAmnt + invoice.get(i).quantity * invoice.get(i).price;
        }
        return totalAmnt;
    }

    /**
     * Calculates the discount on the items, if there is at least 1 pet and 5 other items.
     * @return the total discount
     */
    public double getDiscount() {
        int petCount = 0;
        int otherCount = 0;
        double discount = 0;
        for (int i = 0; i < invoice.size(); i++) {
            if (invoice.get(i).isPet) {
                petCount = petCount + invoice.get(i).quantity;
            }
            else {
                otherCount = otherCount + invoice.get(i).quantity;
            }
        }
        if (petCount >= 1 && otherCount >= 5) {
            for (int i = 0; i <invoice.size(); i++) {
                if (!invoice.get(i).isPet) {
                    discount = discount + invoice.get(i).price * invoice.get(i).quantity * 0.2;
                }
            }
        }
        else {
            discount = 0;
        }
        return discount;
    }
}