import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Array d:");

        long[] d = new long[11];

        for(int i = 0, v = 23; i < d.length; i++, v-=2) d[i] = v;

        for(long i : d) System.out.print(i + " ");

        System.out.println("\n");

        //Task2
        System.out.println("Array x:");

        double[] x = new double[13];

        for(int i = 0; i < x.length; i++) x[i] = GetRandomNumber(-11.0, 11.0);

        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
            if((i + 1) % 5 == 0) System.out.println();}

        System.out.println("\n");

        //Task3
        System.out.println("Array m:");

        double[][] m = new double[11][13];

        for(int i = 0; i < d.length; i++)
        {
            for (int j = 0; j < x.length; j++)
            {
                switch ((int)d[i]) {
                    case 17: m[i][j] = atan(cos(pow((x[j] / 3) / 4, x[j]) * (x[j] - 3.0 / 4.0))); break;

                    case 3, 5, 9, 13, 21:
                    m[i][j] = pow((pow(2.0 / 3.0 * (3 * (1.0 / 3.0 + x[j]) + 1), cos(x[j])) + 1), pow(2 * asin(x[j] / 22), 2));
                    break;

                    default: m[i][j] = asin(sin(atan(pow(E, -cbrt(pow(E, x[j])))))); break;}
            }
        }

        int l = 1;

        for(double[] n : m) for(double t : n){
            System.out.printf("%7.5f ", t);
            if(l % 12 == 0) System.out.println();
            l++;}
    }
    public static double GetRandomNumber(double min, double max)
    {
        return random() * (max - min) + min;
    }
}