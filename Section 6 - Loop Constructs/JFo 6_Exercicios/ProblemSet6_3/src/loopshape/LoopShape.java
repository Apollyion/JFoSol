package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        if(width < 0 || height < 0){
            System.out.println("Por favor entre com um valor maior ou igual a 1");
        }
            for(int i = 0; i != height; i++){
                for(int j = 0; j < width; j++){
                    System.out.print("#");
                    if( i > 0 && i != (height-1)){
                        for(int k = 0; k < width-2; k++){
                            System.out.print(" ");
                        }
                        System.out.print("#");
                        break;
                    }
                }
                System.out.print("\n");
            }
    }
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        if(leg < 0){
            System.out.println("Por favor entre com um valor maior ou igual a 1");
        }

        for(int i = 0; i <leg; i++){
            
        }
        
    }
}
