public class Practice1 {

    public static double generatePiIterative(long steps) {
        long insideCircle = 0;
        
        for (long i = 0; i < steps; i++) {
            double x = Math.random();
            double y = Math.random(); 
            
            if (x * x + y * y <= 1) {
                insideCircle++;
            }
        }
        
        return 4.0 * insideCircle / steps;
    }
}
