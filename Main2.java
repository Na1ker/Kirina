import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main2 {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // Объявляем сканер
            double x = keyboard.nextDouble();
            double y = keyboard.nextDouble();

            if(x > Math.abs(y))
                System.out.println(2 * Math.pow(x, 3) + (3 * Math.pow(y, 2)));
                else if(3 < x && x < Math.abs(y))
                    System.out.println(Math.abs(x - y));
                    else
                        System.out.println(Math.cbrt(Math.abs(x-y)));
        


    }
}
