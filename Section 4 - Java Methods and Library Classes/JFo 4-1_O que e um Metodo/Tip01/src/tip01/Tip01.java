
package tip01;

public class Tip01 {

    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */


        System.out.println("Person 1: $" + (10 + (10*0.05 + 10*0.15)));
        System.out.println("Person 2: $" + (12 + (12*0.05 + 12*0.15)));
        System.out.println("Person 3: $" + (9 + (9*0.05 + 9*0.15)));
        System.out.println("Person 4: $" + (8 + (8*0.05 + 8*0.15)));
        System.out.println("Person 5: $" + (7 + (7*0.05 + 7*0.15)));
        System.out.println("Person 6: $" + (15 + (15*0.05 + 15*0.15)));
        System.out.println("Person 7: $" + (11 + (11*0.05 + 11*0.15)));
        System.out.println("Person 8: $" + (30 + (30*0.05 + 30*0.15)));

        
    }    
}
