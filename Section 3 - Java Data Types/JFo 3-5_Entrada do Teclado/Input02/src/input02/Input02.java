package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
/*         JOptionPane.showMessageDialog(null,
                "Task Failed: Successfully!",
                "Error 344",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here."); */
        
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                3,
                null,
                acceptableValues,
                acceptableValues[2]);

        JOptionPane.showMessageDialog(null, input2, "Valor de Input 2", 2);



                
    }
}
