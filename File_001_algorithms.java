class File_001_algorithms {
    public static int gcd(int p, int q) {
        /* Euclid’s algorithm:
        Compute the greatest common divisor of two nonnegative integers p and q
        */
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static boolean isPrime(int N) {
        /* Check N is a prime number */
        if (N < 2) return false;
            for (int i = 2; i*i <= N; i++)
                if (N % i == 0) return false;
            return true;
    }

    public static double sqrt(double c) {
        /* Square root (Newton’s method) */
        if (c > 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        return t;
    }

    //======================================================================
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        // Hello World!
        System.out.println("gcd(1000,50)=");
        System.out.println(gcd(1000,50));
    }
}
