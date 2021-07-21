package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        int shirtPrice = 0;
        double taxRate = 0;
        int gibberish = 0;

        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        shirtPrice = Integer.parseInt("15");
        taxRate = Double.parseDouble("0.05");

        System.out.println("Total tax price is " + (shirtPrice * taxRate));
        
        //Try to parse taxRate as an int
        
        /* taxRate = Integer.parseInt("0.05");
        System.out.println("taxRate Parsed As Int: " + taxRate); */

        //Try to parse gibberish as an int
        
        /* gibberish = Integer.parseInt("9as14d98asd98");
        System.out.println(gibberish); */

        
    }
    
}
