/**
 * A checkout interface utilizing the Item and Invoice classes.
 */

import java.util.Scanner;

public class Checkout {
    public static void main(String[] args) {
        System.out.println("Welcome to the PetShop. Please add items for checkout.");

        Scanner in = new Scanner(System.in);
        boolean done = false;
        Invoice invoice = new Invoice();

        while (!done) {
            System.out.println();
            System.out.print("Price: ");
            double price = in.nextDouble();
            System.out.print("Is this a pet? (Y/N): ");
            in.nextLine();
            String yn = in.nextLine();
            boolean isPet;
            if (yn.equals("Y") || yn.equals("y")) {
                isPet = true;
            }
            else {
                isPet = false;
            }
            System.out.print("Quantity: ");
            int quantity = in.nextInt();

            Item item = new Item(price, isPet, quantity);
            invoice.add(item);

            System.out.println();
            System.out.print("Add another item? (Y/N): ");
            in.nextLine();
            yn = in.nextLine();
            if (yn.equals("N") || yn.equals("n")) {
                done = true;
            }
        }

        System.out.println();
        System.out.println("Applying discount...");
        double discount = invoice.getDiscount();
        if (discount == 0) {
            System.out.printf("Sorry, you didn't qualify for a discount.");
        }
        else {
            System.out.printf("You saved $%.2f!", discount);
        }

        double grandTotal = invoice.getTotalAmnt() - discount;
        System.out.println();
        System.out.println();
        System.out.printf("Your total comes to $%.2f.", grandTotal);
        System.out.println();
        System.out.println("Thanks for choosing the PetShop!");
    }
}