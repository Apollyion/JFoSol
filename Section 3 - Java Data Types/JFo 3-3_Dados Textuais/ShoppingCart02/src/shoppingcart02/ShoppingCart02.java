
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase two "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        
        double price, tax;
        price = 15.0;
        int quantity = 2;
        
        tax = (price * quantity) * 0.15;

        
        // Declare and assign a calculated totalPrice
        

        double totalPrice = (price * quantity) + tax;
        
        // Modify message to include quantity 
        
        System.out.println(message);
        System.out.println("O custo total com o imposto eh: $" + totalPrice);
        
        // Print another message with the total cost
        
    }    
}
