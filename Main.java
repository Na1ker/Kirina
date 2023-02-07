class Main {
    public static void main(String[] args) {
        
        double x = 16.55 * Math.pow(10, -3);
        double y = -2.75;
        double z = 0.15;
        double b;

        

        // double q = Math.sqrt(10 * (Math.pow(x, 1/3) + Math.pow(x, y + 2) ));
        // double w = (Math.pow(Math.asin(z), 2));
        // double e = Math.abs(x - y);

        // b = q * w - e;


        b = Math.abs(Math.sqrt(10 * (Math.cbrt(x) + Math.pow(x, y + 2) )) * (Math.asin(z) * Math.asin(z) - (Math.abs(x - y))));
    System.out.println(b);


    }
}