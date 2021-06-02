package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final double salesTax = 1.055;
        int itemOnePrice, itemTwoPrice, itemThreePrice;
        int itemOneQuantity, itemTwoQuantity, itemThreeQuantity;
        double subtotal, total, tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        itemOnePrice = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        itemOneQuantity = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        itemTwoPrice = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        itemTwoQuantity = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        itemThreePrice = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        itemThreeQuantity = input.nextInt();
        subtotal = (itemOnePrice * itemOneQuantity) + (itemTwoPrice * itemTwoQuantity) + (itemThreePrice * itemThreeQuantity);
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        tax = subtotal * (salesTax - 1);
        System.out.println("Tax: $" + String.format("%.2f", tax));
        total = subtotal  * salesTax;
        System.out.println("Total: $" + String.format("%.2f", total));



    }
}
