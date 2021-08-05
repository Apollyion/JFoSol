
package Tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        
        Calculator calculator = new Calculator();
        
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party

        System.out.print("Person 1: $"); calculator.findTotal(10.0);
        System.out.print("Person 2: $"); calculator.findTotal(12.0);
        System.out.print("Person 3: $"); calculator.findTotal(9.0);
        System.out.print("Person 4: $"); calculator.findTotal(8.0);
        System.out.print("Person 5: $"); calculator.findTotal(7.0);
        System.out.print("Person 6: $"); calculator.findTotal(15.0);
        System.out.print("Person 7: $"); calculator.findTotal(11.0);
        System.out.print("Person 8: $ "); calculator.findTotal(30.0);

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        
    }
}
