package input03;
import java.util.*;
import javax.swing.JOptionPane;
class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);

        //Find and print the sum of three integers entered by the user
        
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        
        System.out.println((val1 + val2 + val3));
        
        
        //Remember to close the Scanner
        sc.close();
    }
}
