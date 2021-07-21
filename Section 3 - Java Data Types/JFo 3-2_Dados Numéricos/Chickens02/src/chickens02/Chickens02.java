
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here

        //Segunda Feira
        int eggs = 100;

        //Terca Feira
        eggs += 121;
        
        //Quarta Feira
        eggs += 117;

        //Calcular Media Diaria
        double dailyAverage = eggs / 3.0;

        //Calcular Media Mensal
        double monthlyAverage = dailyAverage * 30.0;

        //Calcular Lucro Mensal
        double monthlyProfit = monthlyAverage * 0.18;
        
        //Imprimir Valores
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
