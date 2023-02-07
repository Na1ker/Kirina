public class Main3 {

    public static void main(String[] args) {

        double y,a,b,h,x,n;
        double k = 20;

        a = 0.1; b = 1.2; h = 0.1; x = a;

        do {
          y = 0;
            for(n = 1;n < k; n++)
            y = ((2 * n + 1) / Math.asin(n * x)) * Math.pow(x,n -1);
                System.out.println("Шаг=" + x);
                System.out.println("Значение выражения=" + y);
            x += h;

        } while (x <= b);




        
    }
    
}
