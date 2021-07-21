package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        
        int eggsPerChiken = 4;
        int chickenCount = 8;
        int totalEggs=0;

        //Segunda Feira
        totalEggs += eggsPerChiken *chickenCount;


        //Terça Feira
        chickenCount++;
        totalEggs += eggsPerChiken * chickenCount;

        //Quarta Feira
        chickenCount /= 2;
        totalEggs += eggsPerChiken *chickenCount;

        System.out.println(totalEggs);
    }   
}
