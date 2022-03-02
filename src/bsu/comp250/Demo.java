package bsu.comp250;

public class Demo {
    public static void main(String[] args) {
        run1(10);
        run1(20);
        run1(30);
        run1(100);
    }

    public static void run1(int n) {
        int sum1 = 0, sum2 = 0;
        double start1, end1, start2, end2, time1, time2;

        start1 = System.nanoTime();
        for(int i = 0; i < n; ++i) {
            sum1 += i;
        }
        end1 = System.nanoTime();

        start2 = System.nanoTime();
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                sum2 += j;
            }
        }
        end2 = System.nanoTime();

        time1 = (end1-start1) / 1000000;
        time2 = (end2-start2) / 1000000;

        System.out.println("\nn = " + n + "\n------");
        System.out.println("Algorithm 1: " + time1 + " milliseconds.");
        System.out.println("Algorithm 2: " + time2 + " milliseconds.");
        System.out.println("Algorithm 1 is " + (time2/time1) + " times faster.");
    }
}